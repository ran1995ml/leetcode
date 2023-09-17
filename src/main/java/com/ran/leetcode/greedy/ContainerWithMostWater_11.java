package com.ran.leetcode.greedy;

/**
 * ContainerWithMostWater_11
 * 贪心 + 滑动窗口
 * @author rwei
 * @since 2023/9/17 15:28
 */
public class ContainerWithMostWater_11 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            int h = Math.min(height[left], height[right]);
            max = Math.max(max, (right - left) * h);
            if (height[right] < height[left]) {
                right --;
            }else {
                left ++;
            }
        }
        return max;
    }
}
