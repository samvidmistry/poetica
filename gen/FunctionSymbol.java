import java.util.LinkedHashMap;
import java.util.Map;

public class FunctionSymbol extends Symbol implements Scope {
    private final Scope enclosingScope;
    private final Map<String, Symbol> args = new LinkedHashMap<>();

    public FunctionSymbol(String name, Type type, Scope enclosingScope) {
        super(name, type);
        this.enclosingScope = enclosingScope;
    }

    @Override
    public String getScopeName() {
        return name;
    }

    @Override
    public Scope getEnclosingScope() {
        return enclosingScope;
    }

    @Override
    public void define(Symbol symbol) {
        args.put(symbol.name, symbol);
        symbol.scope = this;
    }

    @Override
    public Symbol resolve(String name) {
        Symbol symbol = args.get(name);
        if (symbol != null) {
            return symbol;
        }
        if (enclosingScope != null) {
            return enclosingScope.resolve(name);
        }
        return null;
    }

    public String toString() { return "function"+super.toString()+":"+args.values(); }
}
