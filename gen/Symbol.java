public class Symbol {
    public static enum Type {
        T_INT, T_FLOAT, T_VOID, T_INVALID
    }

    String name;
    Type type;
    Scope scope;

    public Symbol(String name) {
        this.name = name;
    }

    public Symbol(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        if ( type!=Type.T_INVALID ) return '<'+getName()+":"+type+'>';
        return getName();
    }
}
