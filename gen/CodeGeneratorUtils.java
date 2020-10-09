import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.objectweb.asm.Type;

public class CodeGeneratorUtils {
    private CodeGeneratorUtils(){ /*No instances*/ }

    static String mapToJavaType(int token) {
        switch (token) {
            case poeticaParser.T_INT:
                return "I";
            case poeticaParser.T_FLOAT:
                return "F";
            case poeticaParser.T_VOID:
                return "V";
            default:
                throw new RuntimeException("Not a supported type");
        }
    }

    static String getClassDesc(Class c) {
        return "L" + Type.getInternalName(c) + ";";
    }
}
