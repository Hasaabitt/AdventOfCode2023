package net.theprism.advent2023.day2.A;

import net.theprism.advent2023.day2.antlr.CubeGameLexer;
import net.theprism.advent2023.day2.antlr.CubeGameParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.InputStream;

// 2204
public class Day2 {
    public static void main(String[] args) throws IOException {
        InputStream gameData = Day2.class.getResourceAsStream("/inputs.txt");
        if (gameData == null) throw new NullPointerException("Could not find game information");
        CharStream stream = CharStreams.fromStream(gameData);
        CubeGameLexer lexer = new CubeGameLexer(stream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        CubeGameParser parser = new CubeGameParser(tokenStream);
        ParseTree parseTree = parser.program();
        GameValidator gameValidator = new GameValidator(12, 13, 14);
        gameValidator.visit(parseTree);
    }
}
