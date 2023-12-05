package net.theprism.advent2023.day4;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Card {
    private static final Pattern NUMBERS = Pattern.compile("\\d+");
    private final Set<Integer> yourNumbers, winningNumbers;
    private final int cardNum;

    public Card(String line) {
        this.yourNumbers = new HashSet<>();
        this.winningNumbers = new HashSet<>();
        this.cardNum = Integer.parseInt(line.split(":")[0].replaceAll("\\D", ""));
        String numberLine = line.split(":")[1];
        String winning = numberLine.split("\\|")[0];
        Matcher winningMatcher = NUMBERS.matcher(winning);
        while (winningMatcher.find()) {
            this.winningNumbers.add(Integer.parseInt(winning.substring(winningMatcher.start(), winningMatcher.end())));
        }
        String numbers = numberLine.split("\\|")[1];
        Matcher numbersMatcher = NUMBERS.matcher(numbers);
        while (numbersMatcher.find()) {
            this.yourNumbers.add(Integer.parseInt(numbers.substring(numbersMatcher.start(), numbersMatcher.end())));
        }
    }

    public int getCardNumber() {
        return this.cardNum;
    }

    public int getWinningNumbers() {
        Set<Integer> output = new HashSet<>(this.yourNumbers);
        output.retainAll(this.winningNumbers);
        return output.size();
    }

    public int getPoints() {
        Set<Integer> output = new HashSet<>(this.yourNumbers);
        output.retainAll(this.winningNumbers);
        return (int) Math.pow(2, output.size() - 1);
    }

    @Override
    public String toString() {
        return "Card " + cardNum;
    }
}
