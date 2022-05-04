package com.github.ciomarabanu.leetcode;

public class CountOperationsToObtainZero {
    public int countOperations(int num1, int num2) {

        if (num1 == 0 || num2 == 0)
            return 0;

        int n1 = Math.max(num1, num2);
        num2 = Math.min(num1, num2);
        num1 = n1;
       return num1 / num2 + countOperations(num1 - (num1 / num2) * num2, num2);


//        return countOpHelper(num1, num2, 0);
    }

//    private int countOpHelper(int num1, int num2, int counter) {
//        if (num1 == 0 || num2 == 0)
//            return counter;
//
//        return countOpHelper(Math.abs(num1 - num2), Math.min(num1, num2), counter + 1);
//    }
}
