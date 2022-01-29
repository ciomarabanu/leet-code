package com.github.ciomarabanu.leetcode;

public class ClimbingStairs {

    public static int climbStairs(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int oneBack = 2;
        int twoBack = 1;

        for (int i = 3; i <= n; i++) {
            int dummy = twoBack + oneBack;
            twoBack = oneBack;
            oneBack = dummy;
        }

        return oneBack;
    }
}
