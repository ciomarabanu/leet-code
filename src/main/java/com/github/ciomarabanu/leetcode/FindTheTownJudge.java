package com.github.ciomarabanu.leetcode;

public class FindTheTownJudge {
    public int findJudge(int n, int[][] trust) {
        int[] degree = new int[n + 1];
        for (var relationship : trust) {
            degree[relationship[1]] += 1;
            degree[relationship[0]] -= 1;
        }
        for (int i = 1; i <= n; i++) {
            if (degree[i] == n - 1) {
                return i;
            }
        }
        return -1;
    }
}
