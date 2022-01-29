package com.github.ciomarabanu.leetcode;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(heights));
    }

    public static int maxArea(int[] height) {
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        int rightWall = height[rightPointer];
        int leftWall = height[leftPointer];
        int mostWater = Math.min(leftWall, rightWall) * (rightPointer - leftPointer);

        while (leftPointer < rightPointer) {

            if (leftWall > rightWall) {
                rightPointer -= 1;
            } else {
                leftPointer += 1;
            }
            rightWall = height[rightPointer];
            leftWall = height[leftPointer];

            int thisWater = Math.min(leftWall, rightWall) * (rightPointer - leftPointer);
            if (mostWater < thisWater) {
                mostWater = thisWater;
            }
        }
        return mostWater;
    }
}
