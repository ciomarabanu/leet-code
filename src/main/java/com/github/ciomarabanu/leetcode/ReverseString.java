package com.github.ciomarabanu.leetcode;

public class ReverseString {
    public void reverseString(char[] s) {
//        int left = 0;
//        int right = s.length - 1;
//
//        while (left < right) {
//            char l = s[left];
//            char r = s[right];
//
//            s[left] = r;
//            s[right] = l;
//            left++;
//            right--;
//        }
        reverseStringWithExtraParams(s, 0, s.length - 1);
    }

    private void reverseStringWithExtraParams(char[] s, int left, int right) {
        if (left >= right)
            return;

        char l = s[left];
        char r = s[right];
        s[left] = r;
        s[right] = l;
        reverseStringWithExtraParams(s, left + 1, right - 1 );
    }
}
