public class MaximumDeptOfBinaryTree {
    public class TreeNode {
        int val;
        SimetricTree.TreeNode left;
        SimetricTree.TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, SimetricTree.TreeNode left, SimetricTree.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

//    public int maxDepth(TreeNode root) {
//
//    }
}
