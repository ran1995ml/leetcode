package com.ran.leetcode.backtrace;

import java.util.ArrayList;
import java.util.List;

/**
 * CombinationSum_39
 *
 * @author rwei
 * @since 2023/9/25 17:49
 */
public class CombinationSum_39 {
    public static void main(String[] args) {
        int[] candidates = {2,3,5};
        int target = 8;
        CombinationSum_39 obj = new CombinationSum_39();
        System.out.println(obj.combinationSum(candidates, target).toString());
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(ans, new ArrayList<>(), candidates, target, 0);
        return ans;
    }

    private void dfs(List<List<Integer>> ans, List<Integer> list, int[] candidates, int target, int index) {
        if (target<0) return;
        if (target==0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i=index;i<candidates.length;i++){
            list.add(candidates[i]);
            dfs(ans, list, candidates, target-candidates[i], i);
            list.remove(list.size()-1);
        }
    }
}
