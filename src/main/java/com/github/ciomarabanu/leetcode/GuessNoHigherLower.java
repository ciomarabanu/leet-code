package com.github.ciomarabanu.leetcode;

public class GuessNoHigherLower {
    public static void main(String[] args) {
        System.out.println(guessNumber(Integer.MAX_VALUE));
    }

    public static int guessNumber(int n) {
        int low = 0;
        int high = n;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (guess(mid) <= 0)
                high = mid;
            else
                low = mid + 1;
        }
        return low;
    }

    private static int guess(int n) {
        int actualNumber = 0;
        return Integer.compare(actualNumber, n);
    }
}
