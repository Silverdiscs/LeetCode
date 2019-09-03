/**
 * @Author: CX
 * @Date: 2019/9/2 下午 3:43
 * @Version 1.0
 * @Project: LeetCode.226  翻转二叉树
 */

class Solution226 {
    // Definition for a binary tree node.
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
