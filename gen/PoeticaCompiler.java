import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;

public class PoeticaCompiler {
    public static void main(String[] args) throws Exception {
        boolean hasError = CodeValidator.check(args);
        if (!hasError) {
            String inputFile = args[0];
            org.antlr.v4.runtime.ANTLRInputStream stream = new org.antlr.v4.runtime.ANTLRInputStream(new FileInputStream(inputFile));
            poeticaLexer lexer = new poeticaLexer(stream);
            org.antlr.v4.runtime.CommonTokenStream tokens = new org.antlr.v4.runtime.CommonTokenStream(lexer);
            poeticaParser parser = new poeticaParser(tokens);
            parser.setBuildParseTree(true);
            ParseTree tree = parser.prog();

            ParseTreeWalker walker = new ParseTreeWalker();
            CodeGenerator codeGenerator = new CodeGenerator(args[0]);
            walker.walk(codeGenerator, tree);
        }
    }
}
