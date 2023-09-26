package com.ran.leetcode.stack;

import java.util.Stack;

/**
 * TrapRain_42
 * 单调栈，保持栈内元素递增或递减，存放元素下标
 *
 * @author rwei
 * @since 2023/9/26 11:12
 */
public class TrapRain_42 {
    public static void main(String[] args) {
        int[] nums = {4, 2, 0, 3, 2, 5};
        TrapRain_42 obj = new TrapRain_42();
        System.out.println(obj.trap(nums));
    }

    public int trap(int[] height) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int cur = stack.pop();
                if (stack.isEmpty()) break;
                int w = i - stack.peek() - 1;
                int h = Math.min(height[stack.peek()], height[i]) - height[cur];
                sum += w * h;
            }
            stack.push(i);
        }
        return sum;
    }
}
