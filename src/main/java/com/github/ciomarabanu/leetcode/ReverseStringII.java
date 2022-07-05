package com.github.ciomarabanu.leetcode;

public class ReverseStringII {
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 3));
    }
    public static String reverseStr(String s, int k) {
        if (s.length() < k) {
            return new StringBuilder(s).reverse().toString();
        }
        StringBuilder result = new StringBuilder();
        var begIdx = 0;
        while (begIdx <= s.length()) {
            if (s.substring(begIdx).length() > 2 * k) {
                result.append(reverseFirstK(s.substring(begIdx, begIdx + 2 * k), k));
            } else {
                result.append(reverseFirstK(s.substring(begIdx), k));
            }
            begIdx += 2 * k ;
        }
        return result.toString();
    }

    private static String reverseFirstK(String s, int k) {
        if (s.length() < k)
            return new StringBuilder(s).reverse().toString();
        String reverse = new StringBuilder(s.substring(0, k)).reverse().toString();
        return reverse + s.substring(k);
    }
}
