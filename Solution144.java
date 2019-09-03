import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: CX
 * @Date: 2019/9/2 下午 4:21
 * @Version 1.0
 * @Project: LeetCode.144  二叉树的前序遍历
 */

public class Solution144 {
    // Definition for a binary tree node.
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    List<Integer> list = new ArrayList<>();
    // 根据指定的根节点 root，返回其前序遍历结果
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {  // 当前根节点为空
            return Collections.emptyList();
        }
        list.add(root.val);  // 当前节点不为空
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }
}
