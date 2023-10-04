package com.ran.leetcode.array;

import java.util.Arrays;

/**
 * SpiralMatrixII_59
 *
 * @author rwei
 * @since 2023/10/3 17:22
 */
public class SpiralMatrixII_59 {
    private int index = 1;

    public static void main(String[] args) {
        SpiralMatrixII_59 obj = new SpiralMatrixII_59();
        int n = 3;
        System.out.println(Arrays.deepToString(obj.generateMatrix(n)));
    }

    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int i1 = 0;
        int j1 = 0;
        int i2 = n - 1;
        int j2 = n - 1;
        while (i1 <= i2 && j1 <= j2) {
            traverse(ans, i1++, j1++, i2--, j2--);
        }
        return ans;
    }

    private void traverse(int[][] matrix, int i1, int j1, int i2, int j2) {
        if (i1 == i2) {
            for (int j = j1; j <= j2; j++) {
                matrix[i1][j] = index++;
            }
        } else if (j1 == j2) {
            for (int i = i1; i <= i2; i++) {
                matrix[i][j1] = index++;
            }
        } else {
            for (int j = j1; j < j2; j++) {
                matrix[i1][j] = index++;
            }
            for (int i = i1; i < i2; i++) {
                matrix[i][j2] = index++;
            }
            for (int j = j2; j > j1; j--) {
                matrix[i2][j] = index++;
            }
            for (int i = i2; i > i1; i--) {
                matrix[i][j1] = index++;
            }
        }
    }
}
