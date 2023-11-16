package com.ran.leetcode.linkedlist;

import com.ran.leetcode.entity.ListNode;

import java.util.List;

/**
 * LinkedListCycle_141
 * 快慢指针，有环必会相遇
 * @author rwei
 * @since 2023/10/21 15:56
 */
public class LinkedListCycle_141 {
    public boolean hasCycle(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head;
        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1 == p2) return true;
        }
        return false;
    }
}
