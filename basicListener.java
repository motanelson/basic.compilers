// Generated from basic.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link basicParser}.
 */
public interface basicListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link basicParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(basicParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link basicParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(basicParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link basicParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(basicParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link basicParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(basicParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link basicParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(basicParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link basicParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(basicParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link basicParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(basicParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link basicParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(basicParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link basicParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(basicParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link basicParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(basicParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link basicParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(basicParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link basicParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(basicParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link basicParser#subroutineDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSubroutineDefinition(basicParser.SubroutineDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link basicParser#subroutineDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSubroutineDefinition(basicParser.SubroutineDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link basicParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(basicParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link basicParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(basicParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link basicParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(basicParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link basicParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(basicParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link basicParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(basicParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link basicParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(basicParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link basicParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(basicParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link basicParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(basicParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link basicParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(basicParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link basicParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(basicParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link basicParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(basicParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link basicParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(basicParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link basicParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(basicParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link basicParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(basicParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link basicParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(basicParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link basicParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(basicParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link basicParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(basicParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link basicParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(basicParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link basicParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(basicParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link basicParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(basicParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link basicParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(basicParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link basicParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(basicParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link basicParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(basicParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link basicParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(basicParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link basicParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(basicParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link basicParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(basicParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link basicParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(basicParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link basicParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(basicParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link basicParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(basicParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link basicParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(basicParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link basicParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(basicParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link basicParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(basicParser.ArgumentListContext ctx);
}