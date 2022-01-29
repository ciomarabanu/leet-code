package com.github.ciomarabanu.leetcode;

public class SqrtX {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }

    public static int mySqrt(int x) {
        if (x == 1 || x == 2) {
            return 1;
        }
        long low = 0L;
        long high = x;
        long mid = x / 2;
        while (low < high) {
            mid = (low + high) / 2;
            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid > x) {
                high = mid;
            } else {
                low = mid;

            }

            if (mid * mid < x && (mid + 1) * (mid + 1) > x) {
                return (int) mid;
            }
        }
        return (int) mid;
    }
}

//
//    int n = x / 2;
//    int prevN = 0;
//        while(true){
//                if (n * n > x){
//                prevN = n;
//                n = n / 2;
//                } else if (n * n < x){
//        n = (n + prevN) / 2;
//        } else {
//        return n;
//        }
//        if (prevN - n == 1 && n * n < x){
//        return n;
//        }