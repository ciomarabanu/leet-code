package com.github.ciomarabanu.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        var result = new ArrayList<List<Integer>>();
        var firstRow = new ArrayList<Integer>();
        firstRow.add(1);
        result.add(firstRow);
        for (int i = 2; i <= numRows; i++) {
            var newRow = new ArrayList<Integer>();
            newRow.add(1);
            var prevRow = result.get(result.size() - 1);
            for (int j = 1; j < prevRow.size(); j++) {
                newRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            newRow.add(1);
            result.add(newRow);
        }
        return result;
    }
}
