package com.github.ciomarabanu.leetcode;

public class CousinsInBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    int[] parentsAndDepth = new int[4];

    public boolean isCousins(TreeNode root, int x, int y) {
        int level = 0;
        dfs(root, -1, x, y, level);
        return parentsAndDepth[1] == parentsAndDepth[3] && parentsAndDepth[0]
                != parentsAndDepth[2];
    }

    private void dfs(TreeNode node, int parent, int x, int y, int level) {
        if (node == null)
            return;

        if (node.val == x ){
            parentsAndDepth[0] = parent;
            parentsAndDepth[1] = level;
        }
        else if (node.val == y ){
            parentsAndDepth[2] = parent;
            parentsAndDepth[3] = level;
        }
        dfs(node.left, node.val, x, y, level + 1);
        dfs(node.right, node.val, x, y, level + 1);
    }
}
