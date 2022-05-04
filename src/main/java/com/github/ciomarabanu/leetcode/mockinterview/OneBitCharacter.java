package com.github.ciomarabanu.leetcode.mockinterview;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OneBitCharacter {
    public static void main(String[] args) {

        System.out.println(isOneBitCharacter(new int[]{1, 1, 1, 0}));
    }
    public static boolean isOneBitCharacter(int[] bits) {
        int ones = 0;
        for (int i = bits.length - 2; i >= 0 && bits[i] != 0 ; i--) {
            ones++;
        }
        return ones % 2 <= 0;
    }
}
