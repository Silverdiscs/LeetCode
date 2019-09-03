import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: CX
 * @Date: 2019/9/2 下午 4:26
 * @Version 1.0
 * @Project: LeetCode.606  根据二叉树创建字符串
 */

public class Solution606 {
    // Definition for a binary tree node.
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public String tree2str(TreeNode t) {
        StringBuilder res = new StringBuilder();
        tree2str(t, res);
        return res.toString();
    }

    private void tree2str(TreeNode node, StringBuilder res) {
        if (node == null) {
            return;
        }
        res.append(node.val);
        if (node.left != null) {
            res.append("(");
            tree2str(node.left, res);
            res.append(")");
        }else {
            // 左子树为空，同时右子树不为空
            if (node.right != null) {
                res.append("()");
            }
        }
        if (node.right != null) {
            res.append("(");
            tree2str(node.right, res);
            res.append(")");
        }
    }
}
