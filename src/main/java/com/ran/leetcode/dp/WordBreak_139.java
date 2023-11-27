package com.ran.leetcode.dp;

import java.util.Arrays;
import java.util.List;

/**
 * WordBreak_139
 *
 * @author rwei
 * @since 2023/10/30 10:30
 */
public class WordBreak_139 {
    public static void main(String[] args) {
        WordBreak_139 obj = new WordBreak_139();
        String s = "a";
        List<String> wordDict = Arrays.asList("a");
        System.out.println(obj.wordBreak(s, wordDict));
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length(); j > i; j--) {
                if (dp[i] && wordDict.contains(s.substring(i, j))) {
                    dp[j] = true;
                }
                if (dp[s.length()]) return true;
            }
        }
        return dp[s.length()];
    }
}
