package com.github.ciomarabanu.leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(4));
    }

    public static List<String> generateParenthesis(int n) {
        var result = new ArrayList<String>();
        String elem = "";

        for (int i = 0; i < n; i++) {
            elem = "(" + elem + ")";
        }
        result.add(elem);


        return result;
    }
}
