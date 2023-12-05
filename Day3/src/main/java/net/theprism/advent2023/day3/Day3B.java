package net.theprism.advent2023.day3;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 86879020
public class Day3B {
    public static void main(String[] args) throws IOException {
        InputStream stream = Day3B.class.getResourceAsStream("/inputs.txt");
        if (stream == null) throw new NullPointerException("Could not open file");
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        String line;
        Grid grid = new Grid();
        int y = 0;
        while ((line = reader.readLine()) != null) {
            grid.searchRowForNumbers(line, y);
            char[] c = line.toCharArray();
            int x = 0;
            while (x < c.length) {
                if (c[x] == '*') grid.addGear(new Point(x, y));
                x++;
            }
            y++;
        }
        reader.close();

        int answer = grid.calculateTotalGearRatios();
        System.out.println("Answer: " + answer);
    }

    private static final Pattern NUMBERS = Pattern.compile("\\d+");

    public static class Grid {
        public List<Entry> entries;
        public List<Point> gears;

        public Grid() {
            this.entries = new ArrayList<>();
            this.gears = new ArrayList<>();
        }

        public void searchRowForNumbers(String line, int row) {
            Matcher numberFinder = NUMBERS.matcher(line);
            while (numberFinder.find()) {
                this.entries.add(new Entry(new Point(numberFinder.start(), row), line.substring(numberFinder.start(), numberFinder.end())));
            }
        }

        public void addGear(Point point) {
            this.gears.add(point);
        }

        public Entry getEntryAt(Point point) {
            for (Entry entry : entries) {
                if (entry.left.y != point.y) continue;
                if (point.x >= entry.left.x && point.x < entry.left.x + entry.length) {
                    return entry;
                }
            }
            return null;
        }

        public List<Entry> countNeighboringNumbers(Point point) {
            Point startBound = new Point(point.x - 1, point.y - 1);
            Point endBound = new Point(point.x + 1, point.y + 1);
            Point search = new Point(startBound);
            List<Entry> entryList = new ArrayList<>();
            for (int y = startBound.y; y <= endBound.y; y++) {
                for (int x = startBound.x; x <= endBound.x; x++) {
                    search.setLocation(x, y);
                    Entry entry = getEntryAt(search);
                    if (entry != null && !entryList.contains(entry)) entryList.add(entry);
                }
            }
            return entryList;
        }

        public int calculateTotalGearRatios() {
            int total = 0;
            for (Point gear : this.gears) {
                List<Entry> neighboringParts = countNeighboringNumbers(gear);
                if (neighboringParts.size() == 2) {
                    int ratio = neighboringParts.get(0).number * neighboringParts.get(1).number;
                    total += ratio;
                }
            }
            return total;
        }
    }

    public static class Entry {
        private final Point left;
        private final int number;
        private final int length;

        public Entry(Point left, String number) {
            this.left = left;
            this.number = Integer.parseInt(number);
            this.length = number.length();
        }

        @Override
        public String toString() {
            return String.valueOf(number);
        }
    }
}
