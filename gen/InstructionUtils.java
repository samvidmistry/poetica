import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

import java.io.PrintStream;

public class InstructionUtils {
    private InstructionUtils() { /*No instances*/ }

    static void callPrint(MethodVisitor methodVisitor, String message, boolean newLine) {
        String method = (newLine ? "println" : "print");
        methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, Type.getInternalName(System.class), "out",
                CodeGeneratorUtils.getClassDesc(PrintStream.class));
        methodVisitor.visitLdcInsn(message);
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, Type.getInternalName(PrintStream.class), method,
                "("+CodeGeneratorUtils.getClassDesc(String.class)+")V", false);
    }
}
