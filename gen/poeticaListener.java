// Generated from /run/media/samvidmistry/Data/GitHub/poetica/src/poetica.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link poeticaParser}.
 */
public interface poeticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link poeticaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(poeticaParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link poeticaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(poeticaParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code errorId}
	 * labeled alternative in {@link poeticaParser#error}.
	 * @param ctx the parse tree
	 */
	void enterErrorId(poeticaParser.ErrorIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code errorId}
	 * labeled alternative in {@link poeticaParser#error}.
	 * @param ctx the parse tree
	 */
	void exitErrorId(poeticaParser.ErrorIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importSection}
	 * labeled alternative in {@link poeticaParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImportSection(poeticaParser.ImportSectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importSection}
	 * labeled alternative in {@link poeticaParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImportSection(poeticaParser.ImportSectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableDeclaration}
	 * labeled alternative in {@link poeticaParser#vardeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(poeticaParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableDeclaration}
	 * labeled alternative in {@link poeticaParser#vardeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(poeticaParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link poeticaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(poeticaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link poeticaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(poeticaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link poeticaParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(poeticaParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link poeticaParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(poeticaParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arguments}
	 * labeled alternative in {@link poeticaParser#formalargs}.
	 * @param ctx the parse tree
	 */
	void enterArguments(poeticaParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arguments}
	 * labeled alternative in {@link poeticaParser#formalargs}.
	 * @param ctx the parse tree
	 */
	void exitArguments(poeticaParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argument}
	 * labeled alternative in {@link poeticaParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArgument(poeticaParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argument}
	 * labeled alternative in {@link poeticaParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArgument(poeticaParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ternery}
	 * labeled alternative in {@link poeticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTernery(poeticaParser.TerneryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ternery}
	 * labeled alternative in {@link poeticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTernery(poeticaParser.TerneryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Relative}
	 * labeled alternative in {@link poeticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelative(poeticaParser.RelativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Relative}
	 * labeled alternative in {@link poeticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelative(poeticaParser.RelativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mod}
	 * labeled alternative in {@link poeticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMod(poeticaParser.ModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mod}
	 * labeled alternative in {@link poeticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMod(poeticaParser.ModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link poeticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterString(poeticaParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link poeticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitString(poeticaParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link poeticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(poeticaParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link poeticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(poeticaParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parantheses}
	 * labeled alternative in {@link poeticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParantheses(poeticaParser.ParanthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parantheses}
	 * labeled alternative in {@link poeticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParantheses(poeticaParser.ParanthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shorthand}
	 * labeled alternative in {@link poeticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterShorthand(poeticaParser.ShorthandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shorthand}
	 * labeled alternative in {@link poeticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitShorthand(poeticaParser.ShorthandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link poeticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFloat(poeticaParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link poeticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFloat(poeticaParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funCall}
	 * labeled alternative in {@link poeticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunCall(poeticaParser.FunCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funCall}
	 * labeled alternative in {@link poeticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunCall(poeticaParser.FunCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link poeticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(poeticaParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link poeticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(poeticaParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link poeticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(poeticaParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link poeticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(poeticaParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulSub}
	 * labeled alternative in {@link poeticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulSub(poeticaParser.MulSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulSub}
	 * labeled alternative in {@link poeticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulSub(poeticaParser.MulSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variable}
	 * labeled alternative in {@link poeticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(poeticaParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link poeticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(poeticaParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndOr}
	 * labeled alternative in {@link poeticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndOr(poeticaParser.AndOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndOr}
	 * labeled alternative in {@link poeticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndOr(poeticaParser.AndOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link poeticaParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(poeticaParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link poeticaParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(poeticaParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link poeticaParser#funblock}.
	 * @param ctx the parse tree
	 */
	void enterFunblock(poeticaParser.FunblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link poeticaParser#funblock}.
	 * @param ctx the parse tree
	 */
	void exitFunblock(poeticaParser.FunblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link poeticaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(poeticaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link poeticaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(poeticaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableDeclarationStat}
	 * labeled alternative in {@link poeticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationStat(poeticaParser.VariableDeclarationStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableDeclarationStat}
	 * labeled alternative in {@link poeticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationStat(poeticaParser.VariableDeclarationStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionStat}
	 * labeled alternative in {@link poeticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStat(poeticaParser.ExpressionStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionStat}
	 * labeled alternative in {@link poeticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStat(poeticaParser.ExpressionStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code label}
	 * labeled alternative in {@link poeticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterLabel(poeticaParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code label}
	 * labeled alternative in {@link poeticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitLabel(poeticaParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link poeticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIf(poeticaParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link poeticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIf(poeticaParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for}
	 * labeled alternative in {@link poeticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterFor(poeticaParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for}
	 * labeled alternative in {@link poeticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitFor(poeticaParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link poeticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile(poeticaParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link poeticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile(poeticaParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dowhile}
	 * labeled alternative in {@link poeticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDowhile(poeticaParser.DowhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dowhile}
	 * labeled alternative in {@link poeticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDowhile(poeticaParser.DowhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link poeticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(poeticaParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link poeticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(poeticaParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code break}
	 * labeled alternative in {@link poeticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBreak(poeticaParser.BreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code break}
	 * labeled alternative in {@link poeticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBreak(poeticaParser.BreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continue}
	 * labeled alternative in {@link poeticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterContinue(poeticaParser.ContinueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continue}
	 * labeled alternative in {@link poeticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitContinue(poeticaParser.ContinueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code goto}
	 * labeled alternative in {@link poeticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterGoto(poeticaParser.GotoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code goto}
	 * labeled alternative in {@link poeticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitGoto(poeticaParser.GotoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code return}
	 * labeled alternative in {@link poeticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterReturn(poeticaParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return}
	 * labeled alternative in {@link poeticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitReturn(poeticaParser.ReturnContext ctx);
}