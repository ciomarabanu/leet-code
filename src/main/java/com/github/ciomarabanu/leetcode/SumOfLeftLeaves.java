package com.github.ciomarabanu.leetcode;

import com.github.ciomarabanu.leetcode.utils.TreeNode;

public class SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {
        return dfs(root, false);
    }

    private int dfs(TreeNode node, boolean isLeft) {
        if (node == null)
            return 0;
        if (node.left == null && node.right == null)
            return isLeft ? node.val : 0;
        return dfs(node.left, true) + dfs(node.right, false);
    }
}
