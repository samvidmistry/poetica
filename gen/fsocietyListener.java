// Generated from /run/media/samvidmistry/Data/GitHub/poetica/src/fsociety.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link fsocietyParser}.
 */
public interface fsocietyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link fsocietyParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(fsocietyParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link fsocietyParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(fsocietyParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code errorId}
	 * labeled alternative in {@link fsocietyParser#error}.
	 * @param ctx the parse tree
	 */
	void enterErrorId(fsocietyParser.ErrorIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code errorId}
	 * labeled alternative in {@link fsocietyParser#error}.
	 * @param ctx the parse tree
	 */
	void exitErrorId(fsocietyParser.ErrorIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importSection}
	 * labeled alternative in {@link fsocietyParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImportSection(fsocietyParser.ImportSectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importSection}
	 * labeled alternative in {@link fsocietyParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImportSection(fsocietyParser.ImportSectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableDeclaration}
	 * labeled alternative in {@link fsocietyParser#vardeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(fsocietyParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableDeclaration}
	 * labeled alternative in {@link fsocietyParser#vardeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(fsocietyParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link fsocietyParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(fsocietyParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link fsocietyParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(fsocietyParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link fsocietyParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(fsocietyParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fsocietyParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(fsocietyParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arguments}
	 * labeled alternative in {@link fsocietyParser#formalargs}.
	 * @param ctx the parse tree
	 */
	void enterArguments(fsocietyParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arguments}
	 * labeled alternative in {@link fsocietyParser#formalargs}.
	 * @param ctx the parse tree
	 */
	void exitArguments(fsocietyParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argument}
	 * labeled alternative in {@link fsocietyParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArgument(fsocietyParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argument}
	 * labeled alternative in {@link fsocietyParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArgument(fsocietyParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ternery}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTernery(fsocietyParser.TerneryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ternery}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTernery(fsocietyParser.TerneryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Relative}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelative(fsocietyParser.RelativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Relative}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelative(fsocietyParser.RelativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mod}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMod(fsocietyParser.ModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mod}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMod(fsocietyParser.ModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterString(fsocietyParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitString(fsocietyParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(fsocietyParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(fsocietyParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parantheses}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParantheses(fsocietyParser.ParanthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parantheses}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParantheses(fsocietyParser.ParanthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shorthand}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterShorthand(fsocietyParser.ShorthandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shorthand}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitShorthand(fsocietyParser.ShorthandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFloat(fsocietyParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFloat(fsocietyParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funCall}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunCall(fsocietyParser.FunCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funCall}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunCall(fsocietyParser.FunCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(fsocietyParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(fsocietyParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(fsocietyParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(fsocietyParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulSub}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulSub(fsocietyParser.MulSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulSub}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulSub(fsocietyParser.MulSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variable}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(fsocietyParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(fsocietyParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndOr}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndOr(fsocietyParser.AndOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndOr}
	 * labeled alternative in {@link fsocietyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndOr(fsocietyParser.AndOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link fsocietyParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(fsocietyParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link fsocietyParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(fsocietyParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link fsocietyParser#funblock}.
	 * @param ctx the parse tree
	 */
	void enterFunblock(fsocietyParser.FunblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link fsocietyParser#funblock}.
	 * @param ctx the parse tree
	 */
	void exitFunblock(fsocietyParser.FunblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link fsocietyParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(fsocietyParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link fsocietyParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(fsocietyParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableDeclarationStat}
	 * labeled alternative in {@link fsocietyParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationStat(fsocietyParser.VariableDeclarationStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableDeclarationStat}
	 * labeled alternative in {@link fsocietyParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationStat(fsocietyParser.VariableDeclarationStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionStat}
	 * labeled alternative in {@link fsocietyParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStat(fsocietyParser.ExpressionStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionStat}
	 * labeled alternative in {@link fsocietyParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStat(fsocietyParser.ExpressionStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code label}
	 * labeled alternative in {@link fsocietyParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterLabel(fsocietyParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code label}
	 * labeled alternative in {@link fsocietyParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitLabel(fsocietyParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link fsocietyParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIf(fsocietyParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link fsocietyParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIf(fsocietyParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for}
	 * labeled alternative in {@link fsocietyParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterFor(fsocietyParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for}
	 * labeled alternative in {@link fsocietyParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitFor(fsocietyParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link fsocietyParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile(fsocietyParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link fsocietyParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile(fsocietyParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dowhile}
	 * labeled alternative in {@link fsocietyParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDowhile(fsocietyParser.DowhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dowhile}
	 * labeled alternative in {@link fsocietyParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDowhile(fsocietyParser.DowhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link fsocietyParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(fsocietyParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link fsocietyParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(fsocietyParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code break}
	 * labeled alternative in {@link fsocietyParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBreak(fsocietyParser.BreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code break}
	 * labeled alternative in {@link fsocietyParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBreak(fsocietyParser.BreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continue}
	 * labeled alternative in {@link fsocietyParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterContinue(fsocietyParser.ContinueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continue}
	 * labeled alternative in {@link fsocietyParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitContinue(fsocietyParser.ContinueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code goto}
	 * labeled alternative in {@link fsocietyParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterGoto(fsocietyParser.GotoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code goto}
	 * labeled alternative in {@link fsocietyParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitGoto(fsocietyParser.GotoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code return}
	 * labeled alternative in {@link fsocietyParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterReturn(fsocietyParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return}
	 * labeled alternative in {@link fsocietyParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitReturn(fsocietyParser.ReturnContext ctx);
}