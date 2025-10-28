// Generated from C:/Users/obada/IdeaProjects/F_Comp/src/CompilerParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CompilerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CompilerParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CompilerParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CompilerParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CompilerParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(CompilerParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#listContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListContent(CompilerParser.ListContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(CompilerParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#formalParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParams(CompilerParser.FormalParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#ifExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpression(CompilerParser.IfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#condExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondExpression(CompilerParser.CondExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause(CompilerParser.ClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(CompilerParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#letExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetExpression(CompilerParser.LetExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinding(CompilerParser.BindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#doExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoExpression(CompilerParser.DoExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpression(CompilerParser.ArithmeticExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(CompilerParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(CompilerParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(CompilerParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(CompilerParser.BodyContext ctx);
}