package com.github.ciomarabanu.leetcode;

public class NumberOf1Bits {
//    WROOOOOONG!!!
    public int hammingWeight(int n) {
        if (n == 0)
            return 0;

        return (n & 1) + hammingWeight(n >> 1);
    }
}
