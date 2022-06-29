package com.github.ciomarabanu.leetcode;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        var a = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        return a.size() < nums.length;
    }
}
