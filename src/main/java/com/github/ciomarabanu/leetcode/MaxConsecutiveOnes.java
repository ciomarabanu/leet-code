package com.github.ciomarabanu.leetcode;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        var count = 0;
        var max = 0;
        for (int num : nums){
            if (num == 1){
                count += 1;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        return Math.max(max, count);
    }
}
