package com.github.ciomarabanu.leetcode;

import java.util.Arrays;

public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        var i = 0;
        var j = s.length() - 1;
        var charS = s.toCharArray();

        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            char iHalf = s.charAt(i);
            while (j > i && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            char jHalf = s.charAt(j);

            if (iHalf != jHalf) {
                charS[i] = jHalf;
                charS[j] = iHalf;
            }
            i++;
            j--;

        }
        return Arrays.toString(charS);
    }
}
