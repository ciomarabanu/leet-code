package com.github.ciomarabanu.leetcode;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = nums[0];
        if (nums.length == 1) {
            return max;
        }
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            if (nums[i] > sum) {
                sum = nums[i];
            }
            max = Math.max(sum, max);
        }
        return max;
    }
}
