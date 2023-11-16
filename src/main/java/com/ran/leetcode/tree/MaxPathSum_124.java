package com.ran.leetcode.tree;

import com.ran.leetcode.entity.TreeNode;

/**
 * MaxPathSum_124
 *
 * @author rwei
 * @since 2023/11/15 17:14
 */
public class MaxPathSum_124 {
    private long max = Long.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        dfs(root);
        return (int) max;
    }

    private int dfs(TreeNode root) {
        if (root == null) return 0;
        int left = Math.max(dfs(root.left), 0);
        int right = Math.max(dfs(root.right), 0);
        max = Math.max(max, root.val + left + right);
        return Math.max(left, right) + root.val;
    }
}
