package com.github.ciomarabanu.leetcode;

public class MergeTwoSortedLLRecursively {
    public static void main(String[] args) {
//        System.out.println(merge());
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    private static ListNode merge (ListNode A, ListNode B){
        if (A == null){
            return B;
        }
        if (B == null){
            return A;
        }

        if (A.val < B.val){
            A.next = merge(A.next, B);

            return B;
        } else {
            B.next = merge(A, B.next);
            return A;
        }

    }
}
