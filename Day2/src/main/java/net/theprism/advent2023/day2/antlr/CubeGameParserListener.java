// Generated from D:/java/projects/Advent2023/src/main/antlr/CubeGameParser.g4 by ANTLR 4.13.1
package net.theprism.advent2023.day2.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CubeGameParser}.
 */
public interface CubeGameParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CubeGameParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CubeGameParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubeGameParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CubeGameParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubeGameParser#game}.
	 * @param ctx the parse tree
	 */
	void enterGame(CubeGameParser.GameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubeGameParser#game}.
	 * @param ctx the parse tree
	 */
	void exitGame(CubeGameParser.GameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubeGameParser#turn}.
	 * @param ctx the parse tree
	 */
	void enterTurn(CubeGameParser.TurnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubeGameParser#turn}.
	 * @param ctx the parse tree
	 */
	void exitTurn(CubeGameParser.TurnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubeGameParser#pull}.
	 * @param ctx the parse tree
	 */
	void enterPull(CubeGameParser.PullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubeGameParser#pull}.
	 * @param ctx the parse tree
	 */
	void exitPull(CubeGameParser.PullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubeGameParser#pullred}.
	 * @param ctx the parse tree
	 */
	void enterPullred(CubeGameParser.PullredContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubeGameParser#pullred}.
	 * @param ctx the parse tree
	 */
	void exitPullred(CubeGameParser.PullredContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubeGameParser#pullgreen}.
	 * @param ctx the parse tree
	 */
	void enterPullgreen(CubeGameParser.PullgreenContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubeGameParser#pullgreen}.
	 * @param ctx the parse tree
	 */
	void exitPullgreen(CubeGameParser.PullgreenContext ctx);
	/**
	 * Enter a parse tree produced by {@link CubeGameParser#pullblue}.
	 * @param ctx the parse tree
	 */
	void enterPullblue(CubeGameParser.PullblueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CubeGameParser#pullblue}.
	 * @param ctx the parse tree
	 */
	void exitPullblue(CubeGameParser.PullblueContext ctx);
}