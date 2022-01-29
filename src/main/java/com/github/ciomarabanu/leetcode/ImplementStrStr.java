package com.github.ciomarabanu.leetcode;

public class ImplementStrStr {
    public static void main(String[] args) {
        System.out.println(strStr("abmmmmmc", "mmmc"));
        System.out.println(strStr("abc", "c"));
    }

    public static int strStr(String haystack, String needle) {

        if (needle.equals("")) {
            return 0;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }
        if (haystack.length() == needle.length() && haystack.charAt(0) != needle.charAt(0)) {
            return 0;
        }

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int j = 0;

                while (j < needle.length() && haystack.charAt(i + j) == needle.charAt(j)) {
                    j += 1;

                    if (j == needle.length()) {
                        return i;
                    }
                }
            }
        }
        return -1;
//        return haystack.indexOf(needle);
    }
}
