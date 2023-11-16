package com.ran.leetcode.linkedlist;

import com.ran.leetcode.entity.ListNode;

import java.util.List;

/**
 * LinkedListCycleII_142
 * 环的长度: r, 环内相遇的长度: r1, 环外的长度: l
 * 2(l + r1) = l + r + r1
 * l + r1 = r
 * l = r - r1
 *
 * @author rwei
 * @since 2023/10/21 16:01
 */
public class LinkedListCycleII_142 {
    public ListNode detectCycle(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head;
        boolean hasCycle = false;
        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1 == p2) {
                hasCycle = true;
                break;
            }
        }
        if (!hasCycle) return null;
        p2 = head;
        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}
