package com.ran.leetcode.sort;

import java.util.Arrays;

/**
 * NextPermutation_31
 * 先从个位找出升序的数，升序是最大的，找到降序的那一位，再找出比它大的最小的，即下一个排列
 *
 * @author rwei
 * @since 2023/9/24 20:48
 */
public class NextPermutation_31 {
    public static void main(String[] args) {
        NextPermutation_31 obj = new NextPermutation_31();
        int[] nums = {1, 5, 1};
        obj.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    public void nextPermutation(int[] nums) {
        int p1 = nums.length - 1;
        while (p1 - 1 >= 0 && nums[p1] <= nums[p1 - 1]) {
            p1--;
        }
        if (p1 == 0) {
            reverse(nums, 0, nums.length - 1);
            return;
        }
        p1 = p1 - 1;
        int p2 = nums.length - 1;
        while (nums[p2] <= nums[p1]) {
            p2--;
        }
        swap(nums, p1, p2);
        reverse(nums, p1 + 1, nums.length - 1);
    }

    private void reverse(int[] nums, int p1, int p2) {
        while (p1 < p2) {
            swap(nums, p1, p2);
            p1++;
            p2--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
