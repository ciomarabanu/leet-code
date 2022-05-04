package com.github.ciomarabanu.leetcode.mockinterview;

public class RotateString {
    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "cdeab"));
    }
    public static boolean rotateString(String s, String goal) {
        if (s.equals(goal))
            return true;

        var firstPart = "";
        var secondPart = "";

        for (int i = 1; i < goal.length(); i++) {
            if (s.charAt(i) == goal.charAt(0)) {
                firstPart = s.substring(0, i);
                secondPart = s.substring(i);
                var tryS = secondPart + firstPart;
                if (tryS.equals(goal))
                    return true;
            }
        }
        return false;
    }
}
