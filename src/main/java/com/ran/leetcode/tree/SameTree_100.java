package com.ran.leetcode.tree;

import com.ran.leetcode.entity.TreeNode;

/**
 * SameTree_100
 *
 * @author rwei
 * @since 2023/9/26 09:47
 */
public class SameTree_100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
