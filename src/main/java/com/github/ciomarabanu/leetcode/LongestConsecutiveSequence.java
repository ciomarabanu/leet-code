package com.github.ciomarabanu.leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        var maxSeq = 1;
        var prevVal = 0;
        var nextVal = 0;

        var a = Arrays.stream(nums).boxed()
            .collect(Collectors.toSet());

        for (var num : nums) {
            var seq = 1;
            prevVal = num - 1;
            nextVal = num + 1;
            a.remove(num);

            while (!a.isEmpty()) {

                if (a.contains(prevVal)) {
                    a.remove(prevVal);
                    prevVal--;
                    seq++;
                }
                if (a.contains(nextVal)) {
                    a.remove(nextVal);
                    nextVal++;
                    seq++;
                }
                if (!a.contains(nextVal) && !a.contains(prevVal)) {
                    maxSeq = Math.max(maxSeq, seq);
                    break;
                }
            }
        }
        return maxSeq;
    }
}
