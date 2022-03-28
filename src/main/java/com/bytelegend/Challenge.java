package com.bytelegend;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getNumbersBetween(1, 3)));
        System.out.println(Arrays.toString(getNumbersBetween(6, 10)));
    }

    /**
     * `getNumbersBetween()` returns the numbers between `startInclusive` and `endInclusive`, for
     * example:
     *
     * <p>`startInclusive=1, endInclusive=3`, returns `[1, 2, 3]`.
     *
     * <p>`startInclusive=6, endInclusive=10`, returns`[6, 7, 8, 9, 10]`.
     */
    public static int[] getNumbersBetween(int startInclusive, int endInclusive) {
        return IntStream.range(startInclusive, endInclusive + 1).toArray();
    }
}
