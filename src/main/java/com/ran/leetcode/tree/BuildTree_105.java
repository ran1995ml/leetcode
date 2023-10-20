package com.ran.leetcode.tree;

import com.ran.leetcode.entity.TreeNode;

/**
 * BuildTree_105
 *
 * @author rwei
 * @since 2023/10/16 17:23
 */
public class BuildTree_105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    public TreeNode build(int[] preorder, int[] inorder, int s1, int e1, int s2, int e2) {
        if (s1 > e1 || s2 > e2) return null;
        int val = preorder[s1];
        int index = s2;
        while (inorder[index] != val) index++;
        TreeNode root = new TreeNode(val);
        root.left = build(preorder, inorder, s1 + 1, s1 + index - s2, s2, index - 1);
        root.right = build(preorder, inorder, s1 + index - s2 + 1, e1, index + 1, e2);
        return root;
    }
}
