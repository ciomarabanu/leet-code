package com.github.ciomarabanu.leetcode;

public class RemoveDuplicates {
//    Given an integer array nums sorted in non-decreasing order,
//    remove the duplicates in-place such that each unique element
//    appears only once. The relative order of the elements should be kept the same.
//    Initial array must be modified.

    public static void main(String[] args) {
        int[] test = new int[]{0, 1, 2, 2, 3, 4, 4, 4, 4, 5};
        System.out.println(removeDuplicates(test));
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 0;
        while (j != nums.length) {
            if (nums[i] != nums[j]) {
                i += 1;
                nums[i] = nums[j];
            }
            j += 1;
        }

        return i + 1;

    }


}
