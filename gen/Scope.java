public interface Scope {
    String getScopeName();

    public Scope getEnclosingScope();

    void define(Symbol symbol);

    Symbol resolve(String name);
}
