package com.ran.leetcode.array;

/**
 * RemoveElement_27
 *
 * @author rwei
 * @since 2023/9/22 11:04
 */
public class RemoveElement_27 {
    public static void main(String[] args) {
        RemoveElement_27 obj = new RemoveElement_27();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        System.out.println(obj.removeElement(nums, val));
    }

    public int removeElement(int[] nums, int val) {
        int p1 = 0;
        int p2 = 0;
        while (p1 < nums.length) {
            if (nums[p1] != val) nums[p2++] = nums[p1];
            p1++;
        }
        return p2;
    }
}
