package com.github.ciomarabanu.leetcode;

public class BuyAndSellStock {

    public int maxProfit(int[] prices) {
        var result = 0;
        var delta = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = 0; j < i; j++) {
                delta = prices[i] - prices[j];
                if (delta > result) {
                    result = delta;
                }
            }
        }

        return result;
    }

//    sau...

    public int maxProfitButBetter(int[] prices) {
        var min = prices[0];
        var delta = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            if (delta < prices[i] - min) {
                delta = prices[i] - min;
            }
        }
        return delta;
    }
}
