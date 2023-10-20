package com.ran.leetcode.tree;

import com.ran.leetcode.entity.TreeNode;

/**
 * ValidBST_98
 * 验证二叉搜索书，中序遍历检查是否递增
 *
 * @author rwei
 * @since 2023/10/15 14:16
 */
public class ValidBST_98 {
    private long pre = Long.MIN_VALUE;

    private boolean res = false;

    public boolean isValidBST(TreeNode root) {
        dfs(root);
        return res;
    }

    private void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.left);
        if (root.val > pre) {
            pre = root.val;
        } else {
            res = false;
            return;
        }
        dfs(root.right);
    }
}
