package com.github.ciomarabanu.leetcode;

public class LengtOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("hello world"));
    }
    public static int lengthOfLastWord(String s) {
        var words = s.split(" ");
        if (words.length == 0){
            return 0;
        }
        var lastWord = words[words.length -1];
        return lastWord.length();

    }
}
