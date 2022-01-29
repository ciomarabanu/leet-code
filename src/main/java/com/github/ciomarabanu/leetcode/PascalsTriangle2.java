package com.github.ciomarabanu.leetcode;

import java.util.ArrayList;
import java.util.List;


public class PascalsTriangle2 {
    public static void main(String[] args) {
        System.out.println(getRow(5));
    }

    public static List<Integer> getRow(int rowIndex) {
        var prevRow = new ArrayList<Integer>();
        prevRow.add(1);

        for (int i = 2; i <= rowIndex + 1; i++) {
            var newRow = new ArrayList<Integer>();
            newRow.add(1);
            for (int j = 1; j < prevRow.size(); j++) {
                newRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            newRow.add(1);
            prevRow = newRow;
        }

        return prevRow;
    }
}
