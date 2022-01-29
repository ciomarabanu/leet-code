package com.github.ciomarabanu.leetcode;

import java.util.Arrays;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(3443));
    }

    public static boolean isPalindrome(int x) {
        Integer y = x;
        var stringX = y.toString().toCharArray();
        char[] reversed = new char[stringX.length];
        for (int i = stringX.length - 1; i >= 0; i--) {
            reversed[i] = stringX[stringX.length - i - 1];
        }
        return (Arrays.equals(stringX, reversed));
    }
}
