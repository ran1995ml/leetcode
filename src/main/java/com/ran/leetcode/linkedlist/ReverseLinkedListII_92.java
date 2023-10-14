package com.ran.leetcode.linkedlist;

import com.ran.leetcode.entity.ListNode;

/**
 * ReverseLinkedListII_92
 * 三个指针，一个记录起点之前的位置，一个记录反转后的终点，另一个记录反转后的新起点
 *
 * @author rwei
 * @since 2023/10/10 17:51
 */
public class ReverseLinkedListII_92 {
    public static void main(String[] args) {
        ReverseLinkedListII_92 obj = new ReverseLinkedListII_92();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int left = 3;
        int right = 8;
        ListNode head = ListNode.createLinkedList(nums);
        System.out.println(ListNode.printLinkedList(head));
        ListNode listNode = obj.reverseBetween(head, left, right);
        System.out.println(ListNode.printLinkedList(listNode));
    }


    //-1,1,3,4,5
    //2
    //-1,1,4,5
    //3,2
    //-1,1,5
    //4,3,2
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode node = new ListNode(-1);
        node.next = head;
        ListNode p1 = node;
        for (int i = 0; i < left - 1; i++) {
            p1 = p1.next;
        }
        ListNode p2 = p1.next;
        ListNode p = null;
        for (int i = 0; i < right - left + 1; i++) {
            ListNode next = p1.next;
            p1.next = next.next;
            next.next = p;
            p = next;
        }
        p2.next = p1.next;
        p1.next = p;
        return node.next;
    }
}
