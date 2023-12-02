package net.theprism.advent2023.day2.B;

import net.theprism.advent2023.day2.antlr.CubeGameLexer;
import net.theprism.advent2023.day2.antlr.CubeGameParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.InputStream;

// 71036
public class Day2B {
    public static void main(String[] args) throws IOException {
        InputStream gameData = Day2B.class.getResourceAsStream("/games.txt");
        if (gameData == null) throw new NullPointerException("Could not find game information");
        CharStream stream = CharStreams.fromStream(gameData);
        CubeGameLexer lexer = new CubeGameLexer(stream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        CubeGameParser parser = new CubeGameParser(tokenStream);
        ParseTree parseTree = parser.program();
        GameValidatorB gameValidator = new GameValidatorB();
        gameValidator.visit(parseTree);
    }
}
