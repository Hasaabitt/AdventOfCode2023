package net.theprism.advent2023.day4;

public class Day4 {
    public static void main(String[] args) {
        InputFileReader fileReader = InputFileReader.getResource("/inputs.txt");
        int total = 0;
        for (String line : fileReader) {
            Card card = new Card(line);
            System.out.println(card.getCardNumber() + " " + card.getPoints());
            total += card.getPoints();
        }

        System.out.println("Total: " + total);
    }
}
