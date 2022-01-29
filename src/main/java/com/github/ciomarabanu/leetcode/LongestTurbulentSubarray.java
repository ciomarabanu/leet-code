package com.github.ciomarabanu.leetcode;

public class LongestTurbulentSubarray {
    public static void main(String[] args) {
        int[] arr = {9, 4, 2, 10, 7, 8, 8, 1, 9};
        System.out.println(maxTurbulenceSize(arr));
    }

    public static int maxTurbulenceSize(int[] arr) {
        int maxLength = 1, downLength = 1, upLength = 1;
        for (int i = 1; i < arr.length; i++) {
            var newUpLength = (arr[i] > arr[i - 1]) ? downLength + 1 : 1;
            downLength = (arr[i] < arr[i - 1]) ? upLength + 1 : 1;
            upLength = newUpLength;
            maxLength = Math.max(maxLength, Math.max(upLength, downLength));
        }
        return maxLength;
    }
}
