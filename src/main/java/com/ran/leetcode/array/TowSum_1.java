package com.ran.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * TowSum_1
 * 用哈希表一次遍历
 *
 * @author rwei
 * @since 2023/9/8 13:52
 */
public class TowSum_1 {
    public static void main(String[] args) {
        TowSum_1 obj = new TowSum_1();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] results = obj.twoSum(nums, target);
        System.out.println(Arrays.toString(results));
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
