package com.ran.leetcode.dp;

/**
 * MaxProfitI_121
 *
 * @author rwei
 * @since 2023/10/20 22:08
 */
public class MaxProfitI_121 {
    public static void main(String[] args) {
        MaxProfitI_121 obj = new MaxProfitI_121();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(obj.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int price : prices) {
            min = Math.min(min, price);
            max = Math.max(max, price - min);
        }
        return max;
    }
}
