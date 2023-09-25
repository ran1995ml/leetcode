package com.ran.leetcode.search;

/**
 * SearchRotatedSortedArray_33
 * 用二分法，二分法需要数组有序
 * 对数组二分后，肯定一半有序，另一半无序，先判断target是否在有序的部分，否则遍历无序的部分
 *
 * @author rwei
 * @since 2023/9/24 21:53
 */
public class SearchRotatedSortedArray_33 {
    public static void main(String[] args) {
        SearchRotatedSortedArray_33 obj = new SearchRotatedSortedArray_33();
        int[] nums = {4, 5, 6, 7, 8, 1, 2, 3};
        int target = 8;
        System.out.println(obj.search(nums, target));
    }

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[0] <= nums[mid]) {
                if (nums[0] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && nums[nums.length - 1] >= target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
