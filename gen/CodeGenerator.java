import org.antlr.v4.runtime.misc.Triple;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

import java.io.*;
import java.util.*;

import static org.objectweb.asm.Opcodes.*;

public class CodeGenerator extends poeticaBaseListener {
    private ClassWriter writer = new ClassWriter(org.objectweb.asm.ClassWriter.COMPUTE_FRAMES);
    private String className;
    private ParseTreeProperty<String> nodeData = new ParseTreeProperty<>();
    private List<Triple<String, String, String>> pendingInitializations = new LinkedList<>();
    private MethodVisitor currentMethodVisitor;

    CodeGenerator(String arg) {
        String[] fileNameArray = arg.split("/");
        String classNameWithExtension = fileNameArray[fileNameArray.length - 1];
        className = classNameWithExtension.split("\\.")[0];
    }

    @Override
    public void exitInt(poeticaParser.IntContext ctx) {
        nodeData.put(ctx, ctx.INT().getText());
    }

    @Override
    public void exitFloat(poeticaParser.FloatContext ctx) {
        nodeData.put(ctx, ctx.FLOAT().getText());
    }

    @Override
    public void enterProg(poeticaParser.ProgContext ctx) {
        writer.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC, className, null,
                Type.getType(Object.class).getInternalName(), null);
        MethodVisitor constructor = writer.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
        constructor.visitCode();
        constructor.visitVarInsn(ALOAD, 0);
        constructor.visitMethodInsn(INVOKESPECIAL, Type.getInternalName(Object.class), "<init>", "()V", false);
        constructor.visitInsn(RETURN);
        constructor.visitMaxs(1, 1);
        constructor.visitEnd();
    }

    @Override
    public void exitVariableDeclaration(poeticaParser.VariableDeclarationContext ctx) {
        final String type = CodeGeneratorUtils.mapToJavaType(ctx.type().start.getType());
        for (int i = 0; i < ctx.ID().size(); i++) {
            if (ctx.getParent() instanceof poeticaParser.ProgContext) {
                writer.visitField(Opcodes.ACC_PUBLIC + ACC_STATIC, ctx.ID(i).getText(), type, null,
                        null).visitEnd();
            }
            pendingInitializations.add(new Triple<>(ctx.ID(i).getText(), type, nodeData.get(ctx.expr(i))));
        }
        if (!(ctx.getParent() instanceof poeticaParser.ProgContext)) {
            initializeVariables(false);
        }
    }

    @Override
    public void exitArguments(poeticaParser.ArgumentsContext ctx) {
        final StringBuilder types = new StringBuilder();
        for (int i = 0; i < ctx.arg().size(); i++) {
            types.append(CodeGeneratorUtils.mapToJavaType(((poeticaParser.ArgumentContext)ctx.arg(i)).type().start
                                                                                                        .getType()));
        }

        nodeData.put(ctx, types.toString());
    }

    private void initializeVariables(boolean isStatic) {
        if (pendingInitializations.size() > 0) {
            pendingInitializations.forEach((i) -> {
                if (i.b.equals("I")) {
                    currentMethodVisitor.visitLdcInsn(Integer.valueOf(i.c));
                } else if (i.b.equals("F")) {
                    currentMethodVisitor.visitLdcInsn(Float.valueOf(i.c));
                } else {
                    throw new RuntimeException("Sorry, we don't know this type");
                }
                if (isStatic) {
                    currentMethodVisitor.visitFieldInsn(PUTSTATIC, className, i.a, i.b);
                } else {
                    currentMethodVisitor.visitVarInsn(ISTORE, pendingInitializations.indexOf(i));
                }
            });
            pendingInitializations.clear();
        }
    }

    @Override
    public void enterFunction(poeticaParser.FunctionContext ctx) {
        String functionName = ctx.ID().getText();
        if (functionName.equals("main")) {
            enterMainFunction(ctx);
        } else {
            StringBuilder signature = new StringBuilder(nodeData.get(ctx.formalargs()) == null ? "" :
                    nodeData.get(ctx.formalargs()));
            signature.insert(0, "(").append(")").append(CodeGeneratorUtils.mapToJavaType(ctx.type().start.getType()));
            currentMethodVisitor = writer.visitMethod(ACC_PRIVATE + ACC_STATIC, ctx.ID().getText(), signature.toString(),
                    null, null);
            currentMethodVisitor.visitCode();
        }

        initializeVariables(true);
        currentMethodVisitor.visitInsn(RETURN);
    }

    private void enterMainFunction(poeticaParser.FunctionContext ctx) {
        currentMethodVisitor = writer.visitMethod(ACC_PUBLIC + ACC_STATIC, ctx.ID().getText(), "" + "(" + "[L" + Type.getInternalName(String.class) + ";)V",
                null, null);
        currentMethodVisitor.visitCode();
    }

    @Override
    public void exitFunction(poeticaParser.FunctionContext ctx) {
        currentMethodVisitor.visitMaxs(1, 1);
        currentMethodVisitor.visitEnd();
    }

    @Override
    public void exitProg(poeticaParser.ProgContext ctx) {
        writer.visitEnd();
        File file = new File("./" + className + ".class");
        try {
            if (file.exists()) {
                file.delete();
                file.createNewFile();
            }
            OutputStream stream = new FileOutputStream(file);
            stream.write(writer.toByteArray());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
