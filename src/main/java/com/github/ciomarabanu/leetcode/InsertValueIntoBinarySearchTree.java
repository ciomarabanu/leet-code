package com.github.ciomarabanu.leetcode;

public class InsertValueIntoBinarySearchTree {
    public class TreeNode{

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(){};

        TreeNode (int val){
            this.val = val;
        }

        TreeNode (int val, TreeNode left, TreeNode right ){
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }

    public TreeNode insertValue (TreeNode head, int val){
        if (head == null){
            head = new TreeNode();
            head.val = val;
            return head;
        }
        if (head.val < val){
            head.right = insertValue(head.right, val);
        }else {
            head.left = insertValue(head.left, val);
        }
        return head;
    }
}
