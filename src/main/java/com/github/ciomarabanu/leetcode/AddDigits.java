package com.github.ciomarabanu.leetcode;

public class AddDigits {
    public int addDigits(int num) {
        var result = 0;

        while (num != 0) {
            result += num % 10;
            num = num / 10;
            if (num == 0 && result >= 10) {
                num = result;
                result = 0;
            }
        }
       return result;
    }

    private int addDigitsRecursive(int num, int result) {
        if (num == 0 && result >= 10) return addDigitsRecursive(result, 0);
        else if (num == 0) return result;
        else return addDigitsRecursive(num / 10, result + num % 10);
    }

    private static int reverseNum(int n) {
        var result = 0;

        while (n != 0) {
            result = result * 10 + n % 10;
            n = n / 10;
        }

        return result;
    }

    private static int reverseNumRecursive(int n, int result) {
        if (n == 0)
            return result;

        return reverseNumRecursive(n / 10, result * 10 + n % 10);
    }
}
