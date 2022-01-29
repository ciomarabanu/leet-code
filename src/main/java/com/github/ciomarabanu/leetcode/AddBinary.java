package com.github.ciomarabanu.leetcode;

public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
    }

    public static String addBinary(String a, String b) {

        if (a.equals("") || a.equals("0")) {
            return b;
        }
        if (b.equals("") || b.equals("0")) {
            return a;
        }

        String longer;
        String shorter;


        if (a.length() > b.length()) {
            longer = a;
            shorter = b;
        } else {
            longer = b;
            shorter = a;
        }

        String result = "";
        boolean carry = false;
        int deltaLength = longer.length() - shorter.length();

        for (int i = longer.length() - 1; i >= 0; i--) {
            int shorterIdx = i - deltaLength;
            char shorterCharAtIdx = '0';
            if (shorterIdx >= 0) {
                shorterCharAtIdx = shorter.charAt(shorterIdx);
            }
            if (!carry) {
                if (shorterCharAtIdx == '0' && longer.charAt(i) == '0') {
                    result = "0" + result;
                } else if (shorterCharAtIdx == '1' && longer.charAt(i) == '1') {
                    result = "0" + result;
                    carry = true;
                } else {
                    result = "1" + result;
                }
            } else {
                if (shorterCharAtIdx == '0' && longer.charAt(i) == '0') {
                    result = "1" + result;
                    carry = false;
                } else if (shorterCharAtIdx == '1' && longer.charAt(i) == '1') {
                    result = "1" + result;
                    carry = true;
                } else {
                    result = "0" + result;
                    carry = true;
                }
            }

        }
        if (carry) {
            result = "1" + result;
        }

        return result;
    }
}
