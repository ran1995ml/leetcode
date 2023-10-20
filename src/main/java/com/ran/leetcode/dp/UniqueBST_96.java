package com.ran.leetcode.dp;

/**
 * UniqueBST_96
 * s(1) = f(0)*f(n-1)
 * s(2) = f(1)*f(n-1)
 * sum(n) = s(1) + s(2) + s(n) = f(0)*f(n-1) + f(1)*f(n-1) + f(2)*f(n-2) + f(n-1)*f(0)
 *
 * @author rwei
 * @since 2023/10/15 13:34
 */
public class UniqueBST_96 {
    public static void main(String[] args) {
        UniqueBST_96 obj = new UniqueBST_96();
        int n = 4;
        System.out.println(obj.numTrees(n));
    }

    public int numTrees(int n) {
        if (n <= 2) return n;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }
        return dp[n];
    }
}
