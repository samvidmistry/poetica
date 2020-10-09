public class GlobalScope extends BaseScope {
    GlobalScope(Scope enclosingScope) {
        super(enclosingScope);
    }

    @Override
    public String getScopeName() {
        return "globals";
    }
}
