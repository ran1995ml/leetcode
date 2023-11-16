package com.ran.leetcode.array;

import java.util.HashSet;
import java.util.Set;

/**
 * LongestConsecutive_128
 * 数组中会有很多重复的元素，遍历set
 * @author rwei
 * @since 2023/11/16 11:16
 */
public class LongestConsecutive_128 {
    public static void main(String[] args) {
        LongestConsecutive_128 obj = new LongestConsecutive_128();
        int[] nums = {100,4,200,1,3,2};
        System.out.println(obj.longestConsecutive(nums));
    }

    public int longestConsecutive(int[] nums) {
        int max = 0;
        Set<Integer> set = new HashSet<>();
        for (int num: nums) {
            set.add(num);
        }
        for (int num: set) {
            int count = 1;
            if (!set.contains(num - 1)) {
                int temp = num + 1;
                while (set.contains(temp)) {
                    count++;
                    temp++;
                }
            }
            max = Math.max(count, max);
        }
        return max;
    }
}
