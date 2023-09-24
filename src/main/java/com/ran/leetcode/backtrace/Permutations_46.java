package com.ran.leetcode.backtrace;

import java.util.ArrayList;
import java.util.List;

/**
 * Permutations_46
 *
 * @author rwei
 * @since 2023/9/24 16:31
 */
public class Permutations_46 {
    public static void main(String[] args) {
        Permutations_46 obj = new Permutations_46();
        int[] nums = {1, 2, 3};
        System.out.println(obj.permute(nums).toString());
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        dfs(ans, nums, visited, new ArrayList<>());
        return ans;
    }

    private void dfs(List<List<Integer>> ans, int[] nums, boolean[] visited, List<Integer> list) {
        if (list.size() == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            list.add(nums[i]);
            dfs(ans, nums, visited, list);
            visited[i] = false;
            list.remove(list.size() - 1);
        }
    }
}
