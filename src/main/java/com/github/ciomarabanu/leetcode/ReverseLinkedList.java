package com.github.ciomarabanu.leetcode;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        return dfs(null, head);
    }

    private static ListNode dfs(ListNode prev, ListNode curr) {
        if (curr == null) {
            return prev;
        }

        var next = curr.next;
        curr.next = prev;

        return dfs(curr, next);
    }
}
