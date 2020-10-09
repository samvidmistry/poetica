import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class ReferencePhase extends poeticaBaseListener {
    private GlobalScope globals;
    private ParseTreeProperty<Scope> scopes;
    private Scope currentScope;
    public boolean isErrorsome = false;

    public ReferencePhase(GlobalScope globals, ParseTreeProperty<Scope> scopes) {
        this.globals = globals;
        this.scopes = scopes;
    }

    @Override
    public void enterProg(poeticaParser.ProgContext ctx) {
        currentScope = globals;
        isErrorsome = false;
    }

    @Override
    public void enterFunction(poeticaParser.FunctionContext ctx) {
        currentScope = scopes.get(ctx);
    }

    @Override
    public void exitVariable(poeticaParser.VariableContext ctx) {
        String name = ctx.ID().getSymbol().getText();
        Symbol var = currentScope.resolve(name);
        if (var == null) {
            CodeValidator.error(ctx.ID().getSymbol(), "No variable found with name " + name);
            isErrorsome = true;
        }
        if (var instanceof FunctionSymbol) {
            CodeValidator.error(ctx.ID().getSymbol(), name + " is not a variable");
            isErrorsome = true;
        }
    }

    @Override
    public void exitFunCall(poeticaParser.FunCallContext ctx) {
        if (currentScope == globals) {
            CodeValidator.error(ctx.ID().getSymbol(), "Cannot call a function outside a function");
            isErrorsome = true;
            return;
        }

        String funName = ctx.ID().getText();
        Symbol function = currentScope.resolve(funName);
        if (function == null) {
            CodeValidator.error(ctx.ID().getSymbol(), "No function found with name " + funName);
            isErrorsome = true;
        }
        if (function instanceof VariableSymbol) {
            CodeValidator.error(ctx.ID().getSymbol(), funName + " is not a function");
            isErrorsome = true;
        }
    }

    @Override
    public void exitErrorId(poeticaParser.ErrorIdContext ctx) {
        CodeValidator.error(ctx.ID().getSymbol(), "Only statements allowed outside functions are variable" +
                " declarations and definitions");
        isErrorsome = true;
    }

    @Override
    public void exitFunction(poeticaParser.FunctionContext ctx) {
        currentScope = currentScope.getEnclosingScope();
        if (ctx.ID().getText().equals("main") && ctx.formalargs() != null) {
            CodeValidator.error(ctx.ID().getSymbol(), "main function cannot have parameters");
            isErrorsome = true;
            return;
        }

        if (!ctx.type().getText().equals("void")) {
            CodeValidator.error(ctx.type().start, "main must not return anything");
            isErrorsome = true;
        }
    }
}
