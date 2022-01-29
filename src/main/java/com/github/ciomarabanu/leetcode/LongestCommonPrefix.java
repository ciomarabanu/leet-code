package com.github.ciomarabanu.leetcode;

import java.util.Arrays;


public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = new String[]{"abadccf", "abar", "abaft"};
        System.out.println(longestCommonPrefix(arr));
    }

    public static String longestCommonPrefix(String[] strs) {
        int shortestWordLength = Arrays
                .stream(strs)
                .map(String::length)
                .min(Integer::compare)
                .orElse(0);

        String prefix = "";
        while (prefix.length() < shortestWordLength) {

            for (int i = 0; i < strs.length; i++) {
                if (!prefix.equals(strs[i].substring(0, i))) {
                    return prefix;
                }
            }
        }
        return prefix;

    }
}
