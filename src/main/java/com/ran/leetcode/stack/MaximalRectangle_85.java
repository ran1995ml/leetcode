package com.ran.leetcode.stack;

import java.util.Stack;

/**
 * MaximalRectangle_85
 *
 * @author rwei
 * @since 2023/10/14 18:28
 */
public class MaximalRectangle_85 {
    public static void main(String[] args) {
        MaximalRectangle_85 obj = new MaximalRectangle_85();
        char[][] matrix = {{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}};
        System.out.println(obj.maximalRectangle(matrix));
    }

    public int maximalRectangle(char[][] matrix) {
        int max = 0;
        int col = matrix[0].length;
        int[] heights = new int[col];
        for (char[] chars : matrix) {
            for (int j = 0; j < col; j++) {
                if (chars[j] == '1') {
                    heights[j] += 1;
                } else {
                    heights[j] = 0;
                }
            }
            max = Math.max(max, maxArea(heights));
        }
        return max;
    }

    public int maxArea(int[] heights) {
        int max = 0;
        int[] newHeights = new int[heights.length + 2];
        System.arraycopy(heights, 0, newHeights, 1, heights.length);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < newHeights.length; i++) {
            while (!stack.isEmpty() && newHeights[i] < newHeights[stack.peek()]) {
                int h = newHeights[stack.pop()];
                int w = i - stack.peek() - 1;
                max = Math.max(max, w * h);
            }
            stack.add(i);
        }
        return max;
    }

}
