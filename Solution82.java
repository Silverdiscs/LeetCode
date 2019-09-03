/**
 * @Author: CX
 * @Date: 2019/9/3 下午 3:23
 * @Version 1.0
 * @Project: LeetCode.82  删除排序链表中的重复元素 II
 */

public class Solution82 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode dummy = new ListNode(0);
        // dummy.next = head;
        ListNode preNode = dummy;
        ListNode curNode = head;
        ListNode realNode = dummy;
        while (curNode != null) {
            if ((preNode == dummy || preNode.val != curNode.val)
                    && (curNode.next == null || curNode.val != curNode.next.val)) {
                realNode.next = curNode;
                realNode = curNode;
            }
            preNode = curNode;
            curNode = curNode.next;
            preNode.next = null;
        }
        return dummy.next;
    }
}