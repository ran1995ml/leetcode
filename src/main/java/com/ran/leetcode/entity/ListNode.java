package com.ran.leetcode.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * ListNode
 *
 * @author rwei
 * @since 2023/9/14 22:27
 */
public class ListNode {
    public int val;

    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static List<Integer> printLinkedList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list;
    }

    public static ListNode createLinkedList(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        ListNode node = new ListNode(-1);
        ListNode p = node;
        for (int num : nums) {
            p.next = new ListNode(num);
            p = p.next;
        }
        return node.next;
    }
}
