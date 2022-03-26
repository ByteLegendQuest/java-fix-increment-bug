package com.bytelegend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class ChallengeTest {
    @Test
    public void test() {
        Assertions.assertArrayEquals(new int[] {0}, Challenge.getNumbersBetween(0, 0));
        Assertions.assertArrayEquals(new int[] {1, 2, 3}, Challenge.getNumbersBetween(1, 3));
        Assertions.assertArrayEquals(
                new int[] {6, 7, 8, 9, 10}, Challenge.getNumbersBetween(6, 10));
    }

    @Test
    public void randomTest() {
        int start = new Random().nextInt(10);
        int end = start + new Random().nextInt(10);

        int[] result = Challenge.getNumbersBetween(start, end);

        for (int i = 0; i < result.length; ++i) {
            Assertions.assertEquals(start + i, result[i]);
        }
    }
}
