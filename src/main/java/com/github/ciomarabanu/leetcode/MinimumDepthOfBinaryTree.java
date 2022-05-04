package com.github.ciomarabanu.leetcode;

import com.github.ciomarabanu.leetcode.utils.TreeNode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;

        Queue<TreeNode> toVisit = new LinkedList<>();
        toVisit.offer(root);
        int depth = 1;

        while(!toVisit.isEmpty()) {
            int size = toVisit.size();
            for (int i = 0; i < size; i++) {
                var node = toVisit.poll();
                if (node.left == null && node.right == null)
                    return depth;
                if (node.left != null)
                    toVisit.offer(node.left);
                if (node.right != null)
                    toVisit.offer(node.right);
            }
            depth++;
        }
        return depth;
    }

    private int minDepthV2punkt0(TreeNode root) {
        if (root == null)
            return 0;

        Queue<TreeNode> toVisit = new LinkedList<>();
        toVisit.offer(root);
        int depth = 1;

        while(!toVisit.isEmpty()) {
            var levelNodes = toVisit.stream().toList();
            toVisit.clear();
            for (var node : levelNodes) {
                if (node.left == null && node.right == null)
                    return depth;
                if (node.left != null)
                    toVisit.offer(node.left);
                if (node.right != null)
                    toVisit.offer(node.right);
            }
            depth++;
        }
        return depth;
    }
}
