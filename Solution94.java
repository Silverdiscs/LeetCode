import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: CX
 * @Date: 2019/9/2 下午 3:52
 * @Version 1.0
 * @Project: LeetCode.94  二叉树的中序遍历
 */

public class Solution94 {
    // Definition for a binary tree node.
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return list;
    }
}
