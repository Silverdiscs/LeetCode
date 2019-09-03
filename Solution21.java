import java.util.*;

/**
 * @Author: CX
 * @Date: 2019/8/8 下午 5:09
 * @Version 1.0
 * @Project: LeetCode.21  合并两个有序链表
 */

public class Solution21 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode mergeTwoLists(ListNode l1,ListNode l2) {
        // 判断两个队列是否为空的情况
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        // 当两个队列不为空，新建立一个头结点
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while (l1 != null && l2 != null) {
            // 判断哪个节点的 value更小一些
            boolean chk = (l1.val < l2.val);
            // 哪个链表的 val值更小一些，cur.next就指向谁
            cur.next = chk ? l1 : l2;
            // cur指针向前移动一位
            cur = cur.next;
            // l1更小，继续输出 l1; 否则 l1的值不变
            l1 = chk ? l1.next : l1;
            // l2更小，继续输出 l2; 否则 l2的值不变
            l2 = chk ? l2 : l2.next;
        }
        // 当其中一个队列变为空的时候
        cur.next = (l1 == null) ? l2 : l1;
        return head.next;
    }
}
