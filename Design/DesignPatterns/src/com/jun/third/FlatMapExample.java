package com.jun.third;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {
    static int maxPairs(List<Integer> rating, int minDiff) {
        return (int)rating
                .stream()
                .sorted()
                .flatMap((i) -> rating.stream().map((j) -> new int[]{i, j}))
                .filter((pair) -> Math.abs(pair[0] - pair[1]) >= minDiff)
                .count() / 2;
    }

    static int onePairs(List<Integer> rating, int minDiff) {
        return (int)rating
                .stream()
                .distinct()
                .filter((i) -> i <= minDiff)
                .count();
    }

    private static int lessThan(List<Integer> rating, int minDiff) {
        return (int)rating
                .stream()
                .distinct()
                .filter((value) -> value > minDiff)
                .count();
    }

    public static long sumTo(List<Integer> rating, int sum) {
        return rating
                .stream()
                .sorted()
                .flatMap((i) -> rating.stream().map((j) -> new int[]{i, j}))
                .filter((pair) -> pair[0] + pair[1] == sum)
                .count();
    }

    public static void main(String[] args) {
        List<Integer> rating = Arrays.asList(1, 2, 3, 4, 5, 6);
        int minDiff = 4;
        System.out.println(maxPairs(rating, minDiff));
        System.out.println(onePairs(rating, minDiff));
        System.out.println(lessThan(rating, minDiff));
        System.out.println(sumTo(rating, 10));
    }
}
