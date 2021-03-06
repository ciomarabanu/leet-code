package com.github.ciomarabanu.leetcode;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        int result = 0;

        while (x != 0) {
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && x % 10 > 7)) return 0;
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && x % 10 < -8)) return 0;
            result = result * 10 + (x % 10);
            x = x / 10;

        }
        return result;
    }
}
