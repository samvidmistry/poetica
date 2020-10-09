import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;

public class CodeValidator {
    public static void error(Token t, String message) {
        if (t != null) {
            System.err.printf("line %d:%d %s\n", t.getLine(), t.getCharPositionInLine(), message);
        } else {
            System.err.println(message);
        }
    }

    public static boolean check(String[] args) throws Exception {
        String inputFile = args[0];
        org.antlr.v4.runtime.ANTLRInputStream stream = new org.antlr.v4.runtime.ANTLRInputStream(new FileInputStream(inputFile));
        poeticaLexer lexer = new poeticaLexer(stream);
        org.antlr.v4.runtime.CommonTokenStream tokens = new org.antlr.v4.runtime.CommonTokenStream(lexer);
        poeticaParser parser = new poeticaParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.prog();

        ParseTreeWalker walker = new ParseTreeWalker();
        DefinitionPhase definitionPhase = new DefinitionPhase();
        walker.walk(definitionPhase, tree);

        ReferencePhase referencePhase = new ReferencePhase(definitionPhase.globals, definitionPhase.scopes);
        walker.walk(referencePhase, tree);

        return referencePhase.isErrorsome;
    }
}
