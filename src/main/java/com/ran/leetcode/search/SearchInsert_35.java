package com.ran.leetcode.search;

/**
 * SearchInsert_35
 *
 * @author rwei
 * @since 2023/9/24 21:32
 */
public class SearchInsert_35 {
    public static void main(String[] args) {
        SearchInsert_35 obj = new SearchInsert_35();
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        System.out.println(obj.searchInsert(nums, target));
    }

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return right;
    }
}
