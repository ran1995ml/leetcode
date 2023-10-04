package com.ran.leetcode.array;

/**
 * MaxSubArray_53
 *
 * @author rwei
 * @since 2023/9/26 16:24
 */
public class MaxSubArray_53 {
    public static void main(String[] args) {
        MaxSubArray_53 obj = new MaxSubArray_53();
        int[] nums = {5, 4, -1, 7, 8};
        System.out.println(obj.maxSubArray(nums));
    }

    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : nums) {
            if (sum < 0) {
                sum = num;
            } else {
                sum += num;
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
