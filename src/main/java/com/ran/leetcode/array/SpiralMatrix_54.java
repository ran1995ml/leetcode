package com.ran.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * SpiralMatrix_54
 *
 * @author rwei
 * @since 2023/9/26 17:56
 */
public class SpiralMatrix_54 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        SpiralMatrix_54 obj = new SpiralMatrix_54();
        System.out.println(obj.spiralOrder(matrix).toString());
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int i1 = 0;
        int j1 = 0;
        int i2 = m - 1;
        int j2 = n - 1;
        while (i1 <= i2 && j1 <= j2) {
            traverse(ans, matrix, i1++, j1++, i2--, j2--);
        }
        return ans;
    }

    public void traverse(List<Integer> ans, int[][] matrix, int i1, int j1, int i2, int j2) {
        if (i1 == i2) {
            for (int j = j1; j <= j2; j++) {
                ans.add(matrix[i1][j]);
            }
        } else if (j1 == j2) {
            for (int i = i1; i <= i2; i++) {
                ans.add(matrix[i][j1]);
            }
        } else {
            for (int j = j1; j < j2; j++) {
                ans.add(matrix[i1][j]);
            }
            for (int i = i1; i < i2; i++) {
                ans.add(matrix[i][j2]);
            }
            for (int j = j2; j > j1; j--) {
                ans.add(matrix[i2][j]);
            }
            for (int i = i2; i > i1; i--) {
                ans.add(matrix[i][j1]);
            }
        }
    }
}
