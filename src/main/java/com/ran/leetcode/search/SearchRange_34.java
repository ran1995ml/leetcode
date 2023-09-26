package com.ran.leetcode.search;

import java.util.Arrays;

/**
 * SearchRange_34
 *
 * @author rwei
 * @since 2023/9/25 17:24
 */
public class SearchRange_34 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 6;
        SearchRange_34 obj = new SearchRange_34();
        System.out.println(Arrays.toString(obj.searchRange(nums, target)));
    }

    public int[] searchRange(int[] nums, int target) {
        int index1 = -1;
        int index2 = -1;
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid]>=target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        if (left<nums.length&&nums[left]==target){
            index1 = left;
        }
        right = nums.length;
        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid]>target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        if (right-1>=0&&nums[right-1]==target) {
            index2 = right - 1;
        }
        return new int[]{index1, index2};
    }
}
