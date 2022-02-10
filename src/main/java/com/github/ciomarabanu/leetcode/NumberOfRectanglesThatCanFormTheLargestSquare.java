package com.github.ciomarabanu.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class NumberOfRectanglesThatCanFormTheLargestSquare {
    public static void main(String[] args) {
        var input = new int[5][];
        input[0] = new int[]{5, 8};
        input[1] = new int[]{3, 9};
        input[2] = new int[]{5, 12};
        input[3] = new int[]{16, 5};
        input[4] = new int[]{2, 4};
        System.out.println(countGoodRectangles(input));
    }

    public static int countGoodRectangles(int[][] rectangles) {
        var result = 0;
        var allSquareLengths = Arrays.stream(rectangles)
            .map(r -> Math.min(r[0], r[1]))
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());

        int finalMaxLength = allSquareLengths.get(0);

        result = allSquareLengths.stream()
            .reduce(0, (acc, n) -> n == finalMaxLength ? acc + 1 : acc);

        return result;
    }

//
}
