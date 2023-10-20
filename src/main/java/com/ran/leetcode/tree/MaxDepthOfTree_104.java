package com.ran.leetcode.tree;

import com.ran.leetcode.entity.TreeNode;

/**
 * MaxDepthOfTree_104
 *
 * @author rwei
 * @since 2023/10/16 17:02
 */
public class MaxDepthOfTree_104 {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }
}
