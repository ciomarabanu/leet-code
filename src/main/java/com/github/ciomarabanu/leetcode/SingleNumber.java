package com.github.ciomarabanu.leetcode;

import java.util.Arrays;

public class SingleNumber {
    public int singleNumber(int[] nums) {

        return Arrays.stream(nums).reduce(0, (acc, n) -> acc ^ n);

    }
}
