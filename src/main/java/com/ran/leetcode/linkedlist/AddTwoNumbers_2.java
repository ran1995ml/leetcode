package com.ran.leetcode.linkedlist;

import com.ran.leetcode.entity.ListNode;

/**
 * AddTwoNumbers_2
 * 链表基本操作，注意最后一位进位的处理
 *
 * @author rwei
 * @since 2023/9/14 22:46
 */
public class AddTwoNumbers_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(-1);
        ListNode p = node;
        ListNode p1 = l1;
        ListNode p2 = l2;
        int sum = 0;
        int col = 0;
        while (p1 != null || p2 != null) {
            int v1 = p1 == null ? 0 : p1.val;
            int v2 = p2 == null ? 0 : p2.val;
            sum = (v1 + v2 + col) % 10;
            col = (v1 + v2 + col) / 10;
            p.next = new ListNode(sum);
            p = p.next;
            p1 = p1 == null ? null : p1.next;
            p2 = p2 == null ? null : p2.next;
        }
        if (col > 0) {
            p.next = new ListNode(col);
        }
        return node.next;
    }
}
