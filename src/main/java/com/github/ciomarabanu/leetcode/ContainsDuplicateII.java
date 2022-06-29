package com.github.ciomarabanu.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        var window = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (window.contains(nums[i])) {
                return true;
            }

            window.add(nums[i]);

            if (i >= k) {
                window.remove(nums[i - k]);
            }
        }
        return false;
    }
}
