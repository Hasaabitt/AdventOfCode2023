package net.theprism.advent2023.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

// 55090
public class Day1 {
    public static void main(String[] args) {
        InputStream stream = Day1.class.getResourceAsStream("/inputs.txt");
        if (stream == null) throw new NullPointerException("Could not find calibration file");
        int total = 0;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(stream))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String numbers = line.replaceAll("\\D", "");
                String firstDigit = numbers.substring(0, 1);
                String lastDigit = numbers.substring(numbers.length() - 1);
                System.out.println(line + ": " + firstDigit + " " + lastDigit);
                total += Integer.parseInt(firstDigit + lastDigit);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Answer: " + total);
    }
}
