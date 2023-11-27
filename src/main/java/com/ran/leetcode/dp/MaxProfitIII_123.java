package com.ran.leetcode.dp;

/**
 * MaxProfitIII_123
 *
 * @author rwei
 * @since 2023/10/29 22:16
 */
public class MaxProfitIII_123 {
    public static void main(String[] args) {
        int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};
        MaxProfitIII_123 obj = new MaxProfitIII_123();
        System.out.println(obj.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int[][] dp = new int[2][3];
        for (int i = 0; i < prices.length; i++) {
            for (int k = 1; k <= 2; k++) {
                if (i == 0) {
                    dp[1][k] = -prices[i];
                } else {
                    dp[0][k] = Math.max(dp[0][k], dp[1][k] + prices[i]);
                    dp[1][k] = Math.max(dp[1][k], dp[0][k - 1] - prices[i]);
                }
            }
        }
        return dp[0][2];
    }
}
