/**
 * @Author: CX
 * @Date: 2019/9/3 下午 2:54
 * @Version 1.0
 * @Project: LeetCode.83  删除排序链表中的重复元素
 */

public class Solution83 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode iter = head;
        while (iter != null && iter.next != null) {
            if (iter.val == iter.next.val) {
                iter.next = iter.next.next;
            }else {
                iter = iter.next;
            }
        }
        return head;
    }
}
