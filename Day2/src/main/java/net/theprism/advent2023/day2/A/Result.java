package net.theprism.advent2023.day2.A;

import java.util.Objects;

public record Result(boolean valid) {
    public static final Result TRUE = new Result(true);
    public static final Result FALSE = new Result(false);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return valid == result.valid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(valid);
    }

    @Override
    public String toString() {
        return String.valueOf(valid);
    }
}
