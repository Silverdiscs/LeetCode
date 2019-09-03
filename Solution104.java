/**
 * @Author: CX
 * @Date: 2019/9/2 下午 4:18
 * @Version 1.0
 * @Project: LeetCode.104  二叉树的最大深度
 */

public class Solution104 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // 求出当前二叉树子树的最大深度
        int maxDepth = Math.max(maxDepth(root.left), maxDepth(root.right));
        return maxDepth + 1;
    }
}
