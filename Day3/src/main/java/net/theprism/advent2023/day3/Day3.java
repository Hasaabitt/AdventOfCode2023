package net.theprism.advent2023.day3;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 540131
public class Day3 {
    public static void main(String[] args) throws IOException {
        InputStream stream = Day3.class.getResourceAsStream("/schematic.txt");
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
                if (c[x] >= '0' && c[x] <= '9') {
                    grid.put(new Point(x, y), PointType.NUMBER);
                } else if (c[x] == '.') {
                    grid.put(new Point(x, y), PointType.EMPTY);
                } else {
                    grid.put(new Point(x, y), PointType.PART);
                }
                x++;
            }
            y++;
        }
        reader.close();

        int total = grid.addSchematicNumbers();
        System.out.println("Answer: " + total);
    }

    private static final Pattern NUMBERS = Pattern.compile("\\d+");

    public enum PointType {
        EMPTY,
        NUMBER,
        PART
    }

    public static class Grid {
        private final Map<Point, PointType> gridItems;
        public List<Entry> entries;

        public Grid() {
            this.gridItems = new HashMap<>();
            this.entries = new ArrayList<>();
        }

        public void searchRowForNumbers(String line, int row) {
            Matcher numberFinder = NUMBERS.matcher(line);
            while (numberFinder.find()) {
                this.entries.add(new Entry(this, new Point(numberFinder.start(), row), line.substring(numberFinder.start(), numberFinder.end())));
            }
        }

        public int addSchematicNumbers() {
            int total = 0;
            for (Entry entry : this.entries) {
                if (entry.isPartNumber()) {
                    System.out.println(entry);
                    total += entry.number();
                }
            }
            return total;
        }

        public void put(Point point, PointType pointType) {
            this.gridItems.put(point, pointType);
        }

        public PointType get(Point point) {
            return this.gridItems.getOrDefault(point, PointType.EMPTY);
        }
    }

    public static class Entry {
        private final Grid grid;
        private final Point left;
        private final int number;
        private final int length;

        public Entry(Grid grid, Point left, String number) {
            this.grid = grid;
            this.left = left;
            this.number = Integer.parseInt(number);
            this.length = number.length();
        }

        public int number() {
            return this.number;
        }

        public boolean isPartNumber() {
            Point startBound = new Point(left.x - 1, left.y - 1);
            Point endBound = new Point(left.x + length, left.y + 1);
            Point search = new Point(startBound);
            for (int y = startBound.y; y <= endBound.y; y++) {
                for (int x = startBound.x; x <= endBound.x; x++) {
                    search.setLocation(x, y);
                    if (grid.get(search) == PointType.PART) return true;
                }
            }
            return false;
        }

        @Override
        public String toString() {
            return String.valueOf(number);
        }
    }
}
