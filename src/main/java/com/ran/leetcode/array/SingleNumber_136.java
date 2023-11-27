package com.ran.leetcode.array;

/**
 * SingleNumber_136
 *
 * @author rwei
 * @since 2023/10/23 17:58
 */
public class SingleNumber_136 {
    public static void main(String[] args) {
        SingleNumber_136 obj = new SingleNumber_136();
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(obj.singleNumber(nums));
    }

    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans ^= num;
        }
        return ans;
    }
}
