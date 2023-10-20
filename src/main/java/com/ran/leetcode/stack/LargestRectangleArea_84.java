package com.ran.leetcode.stack;

import java.util.Stack;

/**
 * LargestRectangleArea_84
 *
 * @author rwei
 * @since 2023/10/14 17:25
 */
public class LargestRectangleArea_84 {
    public static void main(String[] args) {
        LargestRectangleArea_84 obj = new LargestRectangleArea_84();
        int[] array = {2, 1, 5, 6, 2, 3};
        System.out.println(obj.largestRectangleArea(array));
    }

    public int largestRectangleArea(int[] heights) {
        int max = 0;
        Stack<Integer> stack = new Stack<>();
        int[] newHeights = new int[heights.length + 2];
        System.arraycopy(heights, 0, newHeights, 1, heights.length);
        heights = newHeights;
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                int h = heights[stack.pop()];
                int w = i - stack.peek() - 1;
                max = Math.max(max, h * w);
            }
            stack.add(i);
        }
        return max;
    }
}
