package com.github.ciomarabanu.leetcode;

import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciNumber {
    public int fib(int n) {
        if (n == 0)
            return 0;

        int prev = 0;
        int nVal = 1;
        int count = 1;

        while (count < n) {
           int jJ = nVal;
           nVal += prev;
           prev = jJ;
           count++;
        }
        return nVal;

//        uncomment for recursive:
//        return fibHelper(n, 1, 0, 1);
    }

    private int fibHelper(int n, int nVal, int prev, int count) {
       if (n == 0) {
           return 0;
       }

       if (count == n) {
           return nVal;
       }
       return fibHelper(n, nVal + prev, nVal, count + 1);
    }

    private int cosmisFibHelper(int n, HashMap<Integer, Integer> memo) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        return memo.computeIfAbsent(n, x -> cosmisFibHelper(x - 1, memo) + cosmisFibHelper( x - 2, memo));

    }

    private int doItBetterFib(int n) {
        var generateFib = Stream.iterate(new int[] {0, 1}, t -> new int[] {t[1], t[0] + t[1]} )
            .limit(n + 1)
            .map(t -> t[0])
            .collect(Collectors.toList());

        return generateFib.get(generateFib.size() - 1);
    }
}
