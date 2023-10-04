package com.ran.leetcode.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * MergeIntervals_56
 *
 * @author rwei
 * @since 2023/10/3 15:47
 */
public class MergeIntervals_56 {
    public static void main(String[] args) {
//        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] intervals = {{1, 4}, {4, 5}};
        MergeIntervals_56 obj = new MergeIntervals_56();
        System.out.println(Arrays.deepToString(obj.merge(intervals)));
    }

    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][2];
        List<int[]> ans = new ArrayList<>();
        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];
            if (ans.size() == 0 || start > ans.get(ans.size() - 1)[1]) {
                ans.add(new int[]{start, end});
            } else {
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], end);
            }
        }
        return ans.toArray(new int[0][2]);
    }
}
