// Generated from D:/java/projects/Advent2023/src/main/antlr/CubeGameParser.g4 by ANTLR 4.13.1
package net.theprism.advent2023.day2.antlr
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CubeGameParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CubeGameParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CubeGameParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CubeGameParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CubeGameParser#game}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGame(CubeGameParser.GameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CubeGameParser#turn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTurn(CubeGameParser.TurnContext ctx);
	/**
	 * Visit a parse tree produced by {@link CubeGameParser#pull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPull(CubeGameParser.PullContext ctx);
	/**
	 * Visit a parse tree produced by {@link CubeGameParser#pullred}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPullred(CubeGameParser.PullredContext ctx);
	/**
	 * Visit a parse tree produced by {@link CubeGameParser#pullgreen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPullgreen(CubeGameParser.PullgreenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CubeGameParser#pullblue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPullblue(CubeGameParser.PullblueContext ctx);
}