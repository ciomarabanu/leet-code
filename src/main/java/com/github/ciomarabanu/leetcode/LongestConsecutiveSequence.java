package com.github.ciomarabanu.leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {1,2,0,1};
        System.out.println(longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int longestSeq = 1;
        int currSeq = 1;
        var a = Arrays.stream(nums).sorted().toArray();
        for (int i = 1; i < nums.length; i++) {
            if (a[i] == a[i - 1] + 1){
                currSeq++;
                longestSeq = Math.max(currSeq, longestSeq);
            } else if (a[i] != a[i - 1]) {
                currSeq = 1;
            }
        }
        return longestSeq;
    }
}
