package com.github.ciomarabanu.leetcode.mockinterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppearMoreThanThird {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] {3,2,3}));
    }
    public static List<Integer> majorityElement(int[] nums) {
        var result = new ArrayList<Integer>();
        Arrays.stream(nums)
             .boxed()
             .collect(Collectors.groupingBy(Function.identity()))
             .forEach((key, value) -> {
                 if (value.size() > nums.length/3){
                     result.add(key);
                 }
             });

        return result;
    }
}
