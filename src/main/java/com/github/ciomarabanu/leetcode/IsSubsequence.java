package com.github.ciomarabanu.leetcode;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        if (s.equals(""))
            return true;
        if (s.length() > t.length())
            return false;
        int verify = 0;
        int i = 0;

        for (int j = 0; j < t.length(); j++) {
            if (s.toCharArray()[i] == t.toCharArray()[j]) {
                verify++;
                i++;
            }
            if (i == s.length())
                break;
        }

        return verify == s.length();
    }
}
