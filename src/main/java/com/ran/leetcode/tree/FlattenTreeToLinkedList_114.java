package com.ran.leetcode.tree;

import com.ran.leetcode.entity.TreeNode;

/**
 * FlattenTreeToLinkedList_114
 * 1        1
 * 2 5        2
 * 3 4 6        3
 * 4
 * 5
 * 6
 *
 * @author rwei
 * @since 2023/10/19 16:39
 */
public class FlattenTreeToLinkedList_114 {
    public void flatten(TreeNode root) {
        while (root != null) {
            TreeNode right = root.right;
            TreeNode left = root.left;
            if (left != null) {
                root.right = left;
                while (left.right != null) {
                    left = left.right;
                }
                left.right = right;
                root.left = null;
                root = root.right;
            } else {
                root = root.right;
            }
        }
    }
}
