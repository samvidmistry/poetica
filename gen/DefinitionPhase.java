import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class DefinitionPhase extends poeticaBaseListener {
    ParseTreeProperty<Scope> scopes = new ParseTreeProperty<>();
    GlobalScope globals;
    Scope currentScope;

    public static Symbol.Type getType(int token) {
        switch (token) {
            case poeticaParser.T_INT: return Symbol.Type.T_INT;
            case poeticaParser.T_FLOAT: return Symbol.Type.T_FLOAT;
            case poeticaParser.T_VOID: return Symbol.Type.T_VOID;
        }

        return Symbol.Type.T_INVALID;
    }

    @Override
    public void enterProg(poeticaParser.ProgContext ctx) {
        globals = new GlobalScope(null);
        currentScope = globals;
    }

    @Override
    public void enterFunction(poeticaParser.FunctionContext ctx) {
        FunctionSymbol functionSymbol = new FunctionSymbol(ctx.ID().getText(), getType(ctx.type().start.getType()),
                                        currentScope);
        currentScope.define(functionSymbol);
        saveScope(ctx, functionSymbol);
        currentScope = functionSymbol;
    }

    @Override
    public void exitArgument(poeticaParser.ArgumentContext ctx) {
        defineVariable(ctx.type(), ctx.ID().getSymbol());
    }

    @Override
    public void exitVariableDeclaration(poeticaParser.VariableDeclarationContext ctx) {
        ctx.ID().forEach(i -> defineVariable(ctx.type(), i.getSymbol()));
    }

    @Override
    public void exitFunction(poeticaParser.FunctionContext ctx) {
        System.out.println(currentScope);
        currentScope = currentScope.getEnclosingScope();
    }

    private void saveScope(ParserRuleContext ctx, Scope s) {
        scopes.put(ctx, s);
    }

    private void defineVariable(poeticaParser.TypeContext typeContext, Token name) {
        VariableSymbol variable = new VariableSymbol(name.getText(), getType(typeContext.start.getType()));
        currentScope.define(variable);
    }

    @Override
    public void exitProg(poeticaParser.ProgContext ctx) {
        System.out.println(globals);
    }
}
