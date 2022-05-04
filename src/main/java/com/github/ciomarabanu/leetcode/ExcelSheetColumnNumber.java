package com.github.ciomarabanu.leetcode;

public class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {

//        var parseInput = new StringBuilder(columnTitle)
//            .reverse()
//            .toString()
//            .toCharArray();
//
//        var result = 0;
//
//        for (int i = 0; i < parseInput.length; i++) {
//           result += (parseInput[i] - 'A' + 1) * Math.pow(26, i);
//        }
//
//        return result;

        return doItRecursive(columnTitle.toCharArray(), 0, 0);
    }

    private int doItRecursive (char[] columnTitle, int pow, int result) {
        if (pow == columnTitle.length)
            return result;

        return doItRecursive(columnTitle,
            pow + 1,
            result * 26 + (columnTitle[pow] - 'A' + 1));
    }
}
