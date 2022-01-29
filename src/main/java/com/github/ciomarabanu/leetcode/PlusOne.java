package com.github.ciomarabanu.leetcode;

import java.sql.Array;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] test = new int[]{1, 9, 8, 9};
        System.out.println(Arrays.toString(plusOne(test)));
    }

    public static int[] plusOne(int[] digits) {

        if (mustElongate(digits)) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            for (int i = 1; i < result.length; i++) {
                result[i] = 0;
            }
            return result;
        }

        int i = digits.length - 1;
        while (true) {
            if (digits[i] == 9) {
                digits[i] = 0;
                i--;
            } else {
                digits[i] += 1;
                return digits;
            }
        }
    }

    private static boolean mustElongate(int[] digits) {
        for (int digit : digits) {
            if (digit != 9){
                return false;
            }
        }
        return true;
    }
}
