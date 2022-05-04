package com.github.ciomarabanu.leetcode;

import java.util.ArrayList;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
       var values = new ArrayList<Integer>();
       values = getAllValues(head, values);

       int left = 0;
       int right = values.size() - 1;

       while (left < right) {
           if (!values.get(left).equals(values.get(right))) {
               return false;
           }
           left++;
           right--;
       }
       return true;
    }

    private ArrayList<Integer> getAllValues(ListNode head, ArrayList<Integer> values) {
        if (head == null)
            return values;

        values.add(head.val);
        return getAllValues(head.next, values);
    }


}
