package net.theprism.advent2023.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 54845
public class Day1B {
    public static final Pattern DIGITS_LOOKAHEAD_PATTERN = Pattern.compile("(?=one|two|three|four|five|six|seven|eight|nine|\\d)");
    public static final Pattern DIGITS_PATTERN = Pattern.compile("one|two|three|four|five|six|seven|eight|nine|\\d");

    public static void main(String[] args) {
        InputStream stream = Day1.class.getResourceAsStream("/inputs.txt");
        if (stream == null) throw new NullPointerException("Could not find calibration file");
        int total = 0;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(stream))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Matcher matcher = DIGITS_LOOKAHEAD_PATTERN.matcher(line);
                int firstGroupStart = -1;
                int lastGroupStart = 0;
                while (matcher.find()) {
                    if (firstGroupStart == -1) {
                        firstGroupStart = matcher.start();
                    }
                    lastGroupStart = matcher.start();
                }

                String firstDigit = getDigit(line, firstGroupStart);
                String lastDigit = getDigit(line, lastGroupStart);
                System.out.println(line + ": " + firstDigit + " " + lastDigit);
                total += Integer.parseInt(firstDigit + lastDigit);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Answer: " + total);
    }

    public static String getGroup(String line, int start) {
        String group;
        try {
            group = line.substring(start, start + 5);
        } catch (IndexOutOfBoundsException e) {
            group = line.substring(start);
        }
        Matcher matcher = DIGITS_PATTERN.matcher(group);
        if (matcher.find()) {
            return group.substring(matcher.start(), matcher.end());
        }
        throw new IllegalArgumentException("No number found: " + group);
    }

    private static final Map<String, Integer> DIGITS = Map.of(
            "one", 1,
            "two", 2,
            "three", 3,
            "four", 4,
            "five", 5,
            "six", 6,
            "seven", 7,
            "eight", 8,
            "nine", 9);

    public static String getDigit(String line, int start) {
        if (line.charAt(start) >= '1' && line.charAt(start) <= '9') {
            return Character.toString(line.charAt(start));
        } else {
            String group = getGroup(line, start);
            return Integer.toString(DIGITS.get(group));
        }
    }
}
