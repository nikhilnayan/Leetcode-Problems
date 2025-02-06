/*
 * @lc app=leetcode id=1008 lang=java
 *
 * [1008] Construct Binary Search Tree from Preorder Traversal
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    private int index = 0;

    public TreeNode bstFromPreorder(int[] preorder) {
        return constructBST(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private TreeNode constructBST(int[] preorder, int lower, int upper) {

        if (index >= preorder.length || preorder[index] < lower || preorder[index] > upper) {
            return null;
        }

        int rootVal = preorder[index++];
        TreeNode root = new TreeNode(rootVal);

        root.left = constructBST(preorder, lower, rootVal);

        root.right = constructBST(preorder, rootVal, upper);

        return root;
    }
}
// @lc code=end
