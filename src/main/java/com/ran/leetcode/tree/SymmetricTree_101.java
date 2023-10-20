package com.ran.leetcode.tree;

import com.ran.leetcode.entity.TreeNode;

/**
 * SymmetricTree_101
 *
 * @author rwei
 * @since 2023/10/15 14:25
 */
public class SymmetricTree_101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return dfs(root.left, root.right);
    }

    private boolean dfs(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        if (root1.val != root2.val) return false;
        return dfs(root1.left, root2.right) && dfs(root1.right, root2.left);
    }
}
