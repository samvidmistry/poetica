// Generated from /run/media/samvidmistry/Data/GitHub/poetica/src/fsociety.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link fsocietyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface fsocietyVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link fsocietyParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(fsocietyParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code errorId}
	 * labeled alternative in {@link fsocietyParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorId(fsocietyParser.ErrorIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importSection}
	 * labeled alternative in {@link fsocietyParser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSection(fsocietyParser.ImportSectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableDeclaration}
	 * labeled alternative in {@link fsocietyParser#vardeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(fsocietyParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link fsocietyParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(fsocietyParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link fsocietyParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(fsocietyParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arguments}
	 * labeled alternative in {@link fsocietyParser#formalargs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(fsocietyParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argument}
	 * labeled alternative in {@link fsocietyParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(fsocietyParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Ternery}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernery(fsocietyParser.TerneryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Relative}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelative(fsocietyParser.RelativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mod}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod(fsocietyParser.ModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(fsocietyParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(fsocietyParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parantheses}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParantheses(fsocietyParser.ParanthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shorthand}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShorthand(fsocietyParser.ShorthandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(fsocietyParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funCall}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCall(fsocietyParser.FunCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(fsocietyParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(fsocietyParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulSub}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulSub(fsocietyParser.MulSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(fsocietyParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndOr}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOr(fsocietyParser.AndOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link fsocietyParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(fsocietyParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link fsocietyParser#funblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunblock(fsocietyParser.FunblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link fsocietyParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(fsocietyParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableDeclarationStat}
	 * labeled alternative in {@link fsocietyParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationStat(fsocietyParser.VariableDeclarationStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionStat}
	 * labeled alternative in {@link fsocietyParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStat(fsocietyParser.ExpressionStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code label}
	 * labeled alternative in {@link fsocietyParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(fsocietyParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link fsocietyParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(fsocietyParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for}
	 * labeled alternative in {@link fsocietyParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(fsocietyParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link fsocietyParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(fsocietyParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dowhile}
	 * labeled alternative in {@link fsocietyParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDowhile(fsocietyParser.DowhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link fsocietyParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(fsocietyParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code break}
	 * labeled alternative in {@link fsocietyParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak(fsocietyParser.BreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continue}
	 * labeled alternative in {@link fsocietyParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue(fsocietyParser.ContinueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code goto}
	 * labeled alternative in {@link fsocietyParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto(fsocietyParser.GotoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return}
	 * labeled alternative in {@link fsocietyParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(fsocietyParser.ReturnContext ctx);
}