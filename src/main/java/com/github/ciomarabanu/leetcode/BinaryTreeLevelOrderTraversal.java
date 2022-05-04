package com.github.ciomarabanu.leetcode;

import com.github.ciomarabanu.leetcode.utils.TreeNode;

import java.util.*;
import java.util.stream.Collectors;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> toVisit = new LinkedList<TreeNode>();
        var orderedNodes = new ArrayList<List<Integer>>();
        if (root != null){
            toVisit.offer(root);
            orderedNodes.add(Arrays.asList(root.val));
        }

        while (!toVisit.isEmpty()) {
            var levelVals = new ArrayList<Integer>();
            var levelNodes = new ArrayList<>(toVisit);
            toVisit.clear();

            for (var node : levelNodes) {
                if (node.left != null) {
                    toVisit.offer(node.left);
                    levelVals.add(node.left.val);
                }
                if (node.right != null) {
                    toVisit.offer(node.right);
                    levelVals.add(node.right.val);
                }
            }
            if (!levelVals.isEmpty())
                orderedNodes.add(levelVals);
        }
        return orderedNodes;
    }
}
