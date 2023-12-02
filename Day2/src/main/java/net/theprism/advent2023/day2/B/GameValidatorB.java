package net.theprism.advent2023.day2.B;

import net.theprism.advent2023.day2.antlr.CubeGameParser;
import net.theprism.advent2023.day2.antlr.CubeGameParserBaseVisitor;

import java.util.ArrayList;
import java.util.List;

public class GameValidatorB extends CubeGameParserBaseVisitor<ResultB> {
    public GameValidatorB() {
    }

    @Override
    public ResultB visitProgram(CubeGameParser.ProgramContext ctx) {
        List<CubeGameParser.GameContext> games = ctx.game();
        int power = 0;
        for (CubeGameParser.GameContext game : games) {
            int gameNumber = Integer.parseInt(game.INT().getText());
            System.out.println("Visiting game " + gameNumber);
            ResultB result = visitGame(game);
            power += (result.red() * result.green() * result.blue());
            System.out.println("Result: " + result);
        }
        System.out.println("Answer: " + power);
        return new ResultB(0, 0, 0);
    }

    @Override
    public ResultB visitGame(CubeGameParser.GameContext ctx) {
        List<CubeGameParser.TurnContext> turnsList = ctx.turn();
        List<ResultB> turnResults = new ArrayList<>();
        for (CubeGameParser.TurnContext turn : turnsList) {
            turnResults.add(visitTurn(turn));
        }
        return createResult(turnResults);
    }

    @Override
    public ResultB visitTurn(CubeGameParser.TurnContext ctx) {
        List<CubeGameParser.PullContext> pullResults = ctx.pull();
        List<ResultB> turnResults = new ArrayList<>();
        for (CubeGameParser.PullContext turn : pullResults) {
            ResultB result = visitPull(turn);
            turnResults.add(result);
        }
        return createResult(turnResults);
    }

    private static ResultB createResult(List<ResultB> results) {
        int minRed = Integer.MIN_VALUE;
        int minGreen = Integer.MIN_VALUE;
        int minBlue = Integer.MIN_VALUE;
        for (ResultB result : results) {
            if (result.red() > minRed) minRed = result.red();
            if (result.green() > minGreen) minGreen = result.green();
            if (result.blue() > minBlue) minBlue = result.blue();
        }
        return new ResultB(minRed, minGreen, minBlue);
    }

    @Override
    public ResultB visitPullred(CubeGameParser.PullredContext ctx) {
        int count = Integer.parseInt(ctx.INT().getText());
        return new ResultB(count, Integer.MIN_VALUE, Integer.MIN_VALUE);

    }

    @Override
    public ResultB visitPullgreen(CubeGameParser.PullgreenContext ctx) {
        int count = Integer.parseInt(ctx.INT().getText());
        return new ResultB(Integer.MIN_VALUE, count, Integer.MIN_VALUE);
    }

    @Override
    public ResultB visitPullblue(CubeGameParser.PullblueContext ctx) {
        int count = Integer.parseInt(ctx.INT().getText());
        return new ResultB(Integer.MIN_VALUE, Integer.MIN_VALUE, count);
    }
}
