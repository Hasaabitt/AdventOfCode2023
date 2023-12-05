package net.theprism.advent2023.day4;

import java.util.*;

public class Day4B {
    public static void main(String[] args) {
        InputFileReader fileReader = InputFileReader.getResource("/inputs.txt");
        Map<Integer, List<Card>> cardMap = new LinkedHashMap<>();
        for (String line : fileReader) {
            Card card = new Card(line);
            cardMap.put(card.getCardNumber(), new ArrayList<>(List.of(card)));
        }

        int total = 0;
        for (Integer currentCardNumber : cardMap.keySet()) {
            List<Card> cards = cardMap.get(currentCardNumber);
            for (Card card : cards) {
                int winCount = card.getWinningNumbers();
                List<Integer> range = createRange(currentCardNumber + 1, winCount);
                for (Integer wonCard : range) {
                    cardMap.get(wonCard).add(cardMap.get(wonCard).get(0));
                }
                total++;
            }
        }

        System.out.println("Total: " + total);
    }

    public static List<Integer> createRange(int startNumber, int count) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            numbers.add(startNumber + i);
        }
        return numbers;
    }
}
