// Generated from C:/Users/obada/IdeaProjects/F_Comp/src/CompilerParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CompilerParser}.
 */
public interface CompilerParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CompilerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CompilerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CompilerParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CompilerParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CompilerParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(CompilerParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(CompilerParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#listContent}.
	 * @param ctx the parse tree
	 */
	void enterListContent(CompilerParser.ListContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#listContent}.
	 * @param ctx the parse tree
	 */
	void exitListContent(CompilerParser.ListContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(CompilerParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(CompilerParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#formalParams}.
	 * @param ctx the parse tree
	 */
	void enterFormalParams(CompilerParser.FormalParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#formalParams}.
	 * @param ctx the parse tree
	 */
	void exitFormalParams(CompilerParser.FormalParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void enterIfExpression(CompilerParser.IfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void exitIfExpression(CompilerParser.IfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#condExpression}.
	 * @param ctx the parse tree
	 */
	void enterCondExpression(CompilerParser.CondExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#condExpression}.
	 * @param ctx the parse tree
	 */
	void exitCondExpression(CompilerParser.CondExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#clause}.
	 * @param ctx the parse tree
	 */
	void enterClause(CompilerParser.ClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#clause}.
	 * @param ctx the parse tree
	 */
	void exitClause(CompilerParser.ClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(CompilerParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(CompilerParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#letExpression}.
	 * @param ctx the parse tree
	 */
	void enterLetExpression(CompilerParser.LetExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#letExpression}.
	 * @param ctx the parse tree
	 */
	void exitLetExpression(CompilerParser.LetExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#binding}.
	 * @param ctx the parse tree
	 */
	void enterBinding(CompilerParser.BindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#binding}.
	 * @param ctx the parse tree
	 */
	void exitBinding(CompilerParser.BindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#doExpression}.
	 * @param ctx the parse tree
	 */
	void enterDoExpression(CompilerParser.DoExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#doExpression}.
	 * @param ctx the parse tree
	 */
	void exitDoExpression(CompilerParser.DoExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpression(CompilerParser.ArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpression(CompilerParser.ArithmeticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(CompilerParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(CompilerParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(CompilerParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(CompilerParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(CompilerParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(CompilerParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(CompilerParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(CompilerParser.BodyContext ctx);
}