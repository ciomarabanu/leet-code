package com.github.ciomarabanu.leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheDifference {
    public static void main(String[] args) {
        var s = "asdvdfhtfhhfgfg";
        var t = "asdvdfhtfhhfgfgg";
        System.out.println(findTheDifference(s, t));
        System.out.println(kosmy(s, t));
    }
    public static char findTheDifference(String s, String t) {
        var sS = new int[26] ;
        var tT = new int[26] ;

        for (var c : s.toCharArray()) {
            sS[c - 'a'] += 1;
        }

        for (var c : t.toCharArray()) {
            tT[c - 'a'] += 1;
        }

        for (int i = 0; i < 26; i++) {
            if (sS[i] - tT[i] != 0) {
                return (char)(i + 'a');
            }
        }

        return '0';
    }

    public static char kosmy(String s, String t) {
        var ceva = s.chars().reduce(0, (x, y) -> x ^ y);
        var altceva = t.chars().reduce(ceva, (x, y) -> x ^ y);

        return (char) altceva;
    }
}
