package com.bytelegend;

import java.util.Arrays;

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
        if (endInclusive < startInclusive) {
            return new int[0];
        }
        int[] result = new int[endInclusive - startInclusive + 1];
        for (int number = startInclusive; number <= endInclusive; ++number) {
            result[number - startInclusive] = number;
        }
        return result;
    }
}
