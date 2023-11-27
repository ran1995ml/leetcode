package com.ran.leetcode.linkedlist;

import com.ran.leetcode.entity.ListNode;

/**
 * IntersectionNode_160
 *
 * @author rwei
 * @since 2023/11/16 23:44
 */
public class IntersectionNode_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2 = headB;
        while (p1 != p2) {
            p1 = p1 == null ? headB : p1.next;
            p2 = p2 == null ? headA : p2.next;
        }
        return p1;
    }
}
