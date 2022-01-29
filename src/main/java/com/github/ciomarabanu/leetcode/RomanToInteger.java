package com.github.ciomarabanu.leetcode;

import java.util.HashMap;
import java.util.stream.Stream;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
    public static int romanToInt(String s) {
        var romanNumerals = new HashMap<String, Integer>();
        romanNumerals.put("I", 1);
        romanNumerals.put("V", 5);
        romanNumerals.put("X", 10);
        romanNumerals.put("L", 50);
        romanNumerals.put("C", 100);
        romanNumerals.put("D", 500);
        romanNumerals.put("M", 1000);

        var working = Stream.of(s).map(num -> romanNumerals.get(num)).toArray();

        var workingNum = s.toCharArray();
        var result = 0;

        for (int i = 0; i < working.length; i++){
            if (i == working.length-1){
                result += (int)working[i];
                break;
            }
            if ((int)working[i] < (int)working[i+1]){
                result -= (int)working[i];
            } else {
                result += (int)working[i];
            }
        }
        return result;

//       ---> Working solution !!! <---

//        var workingNum = s.toCharArray();
//        var result = 0;
//
//        for (int i = 0; i < workingNum.length; i++){
//            if (i == s.length()-1){
//                result += romanNumerals.get(Character.toString(workingNum[i]));
//                break;
//            }
//            if (romanNumerals.get(Character.toString(workingNum[i])) < romanNumerals.get(Character.toString(workingNum[i+1]))){
//                result -= romanNumerals.get(Character.toString(workingNum[i]));
//            } else {
//                result += romanNumerals.get(Character.toString(workingNum[i]));
//            }
//        }
//        return result;
    }
}
