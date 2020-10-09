import java.util.LinkedHashMap;
import java.util.Map;

public abstract class BaseScope implements Scope {
    Scope enclosingScope;
    Map<String, Symbol> symbols = new LinkedHashMap<>();

    BaseScope(Scope enclosingScope) {
        this.enclosingScope = enclosingScope;
    }

    @Override
    public Scope getEnclosingScope() {
        return enclosingScope;
    }

    @Override
    public void define(Symbol symbol) {
        symbols.put(symbol.getName(), symbol);
        symbol.scope = this;
    }

    @Override
    public Symbol resolve(String name) {
        Symbol symbol = symbols.get(name);
        if (symbol != null) {
            return symbol;
        }

        if (enclosingScope != null) {
            return enclosingScope.resolve(name);
        }

        return null;
    }

    @Override
    public String toString() {
        return getScopeName()+":"+symbols.keySet().toString();
    }
}
