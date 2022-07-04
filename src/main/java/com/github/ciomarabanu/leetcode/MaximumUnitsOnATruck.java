package com.github.ciomarabanu.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MaximumUnitsOnATruck {
    public static void main(String[] args) {
        int[][] boxTypes = {{1,3},{2,2},{3,1}};
        var truckSize = 4;
        System.out.println(maximumUnits(boxTypes, truckSize));

    }
    public static int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);

        var result = 0;

        for (var type : boxTypes) {
            if (truckSize >= type[0]) {
                result += type[1] * type[0];
                truckSize -= type[0];
            } else {
                result += truckSize * type[1];
                return result;
            }

        }
        return result;
    }
}
