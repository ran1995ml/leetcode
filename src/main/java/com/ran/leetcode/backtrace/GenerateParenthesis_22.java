package com.ran.leetcode.backtrace;

import java.util.ArrayList;
import java.util.List;

/**
 * GenerateParenthesis_22
 *
 * @author rwei
 * @since 2023/9/22 10:01
 */
public class GenerateParenthesis_22 {

    public static void main(String[] args) {
        int n = 4;
        GenerateParenthesis_22 obj = new GenerateParenthesis_22();
        List<String> list = obj.generateParenthesis(n);
        System.out.println(list.toString());
    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        dfs(ans, new StringBuffer(), 0, 0, n);
        return ans;
    }

    private void dfs(List<String> ans, StringBuffer sb, int left, int right, int n) {
        if (right > left) return;
        if (left > n) return;
        if (left == n && right == n) {
            ans.add(String.valueOf(sb));
            return;
        }

        sb.append('(');
        dfs(ans, sb, left + 1, right, n);
        sb.deleteCharAt(sb.length() - 1);

        sb.append(')');
        dfs(ans, sb, left, right + 1, n);
        sb.deleteCharAt(sb.length() - 1);
    }
}
