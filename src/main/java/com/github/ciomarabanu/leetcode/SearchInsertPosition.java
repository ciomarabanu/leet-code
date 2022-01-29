package com.github.ciomarabanu.leetcode;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] test = new int[]{0,1,2,3,4,6,7,8};
        System.out.println(searchInsert(test, 5));
    }
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        if (target <= nums[start]){
            return start;
        }
        if (target == nums[end]){
            return end;
        }
        if (target > nums[end]){
            return end + 1;
        }
        while (start < end - 1){
            if (target < nums[(end+start)/2]){
                end = (end + start)/2;
            } else if (target > nums[(end + start)/2]) {
                start = ((end + start)/2);
            } else if (target == nums[(end + start)/2]) {
                return (end + start)/2;
            }
        }
        return start+1;
    }
}
