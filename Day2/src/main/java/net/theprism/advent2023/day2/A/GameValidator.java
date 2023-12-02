package net.theprism.advent2023.day2.A;

import net.theprism.advent2023.day2.antlr.CubeGameParser;
import net.theprism.advent2023.day2.antlr.CubeGameParserBaseVisitor;

import java.util.ArrayList;
import java.util.List;

public class GameValidator extends CubeGameParserBaseVisitor<Result> {
    private final int expectedRed, expectedGreen, expectedBlue;

    public GameValidator(int initialRed, int initialGreen, int initialBlue) {
        this.expectedRed = initialRed;
        this.expectedGreen = initialGreen;
        this.expectedBlue = initialBlue;
    }

    @Override
    public Result visitProgram(CubeGameParser.ProgramContext ctx) {
        List<CubeGameParser.GameContext> games = ctx.game();
        int solution = 0;
        for (CubeGameParser.GameContext game : games) {
            int gameNumber = Integer.parseInt(game.INT().getText());
            System.out.println("Visiting game " + gameNumber);
            Result result = visitGame(game);
            System.out.println("Result: " + result);
            if (result.valid()) {
                solution += gameNumber;
            }
        }
        System.out.println("Answer: " + solution);
        return Result.TRUE;
    }

    @Override
    public Result visitGame(CubeGameParser.GameContext ctx) {
        List<CubeGameParser.TurnContext> turnsList = ctx.turn();
        List<Result> turnResults = new ArrayList<>();
        for (CubeGameParser.TurnContext turn : turnsList) {
            turnResults.add(visitTurn(turn));
        }
        return new Result(!turnResults.contains(Result.FALSE));
    }

    @Override
    public Result visitTurn(CubeGameParser.TurnContext ctx) {
        List<CubeGameParser.PullContext> turnResult = ctx.pull();
        List<Result> turnResults = new ArrayList<>();
        for (CubeGameParser.PullContext turn : turnResult) {
            Result result = super.visitPull(turn);
            turnResults.add(result);
        }
        return new Result(!turnResults.contains(Result.FALSE));
    }

    @Override
    public Result visitPullred(CubeGameParser.PullredContext ctx) {
        int count = Integer.parseInt(ctx.INT().getText());
        return new Result(count <= expectedRed);
    }

    @Override
    public Result visitPullgreen(CubeGameParser.PullgreenContext ctx) {
        int count = Integer.parseInt(ctx.INT().getText());
        return new Result(count <= expectedGreen);
    }

    @Override
    public Result visitPullblue(CubeGameParser.PullblueContext ctx) {
        int count = Integer.parseInt(ctx.INT().getText());
        return new Result(count <= expectedBlue);
    }
}
