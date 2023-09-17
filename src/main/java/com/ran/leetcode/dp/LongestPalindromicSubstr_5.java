package com.ran.leetcode.dp;

/**
 * LongestPalindromicSub_5
 *
 * @author rwei
 * @since 2023/9/17 15:16
 */
public class LongestPalindromicSubstr_5 {
    public String longestPalindrome(String s) {
        String str = "";
        int max = 0;
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && (j - i + 1 <= 2 || dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                    if (j - i + 1 > max) {
                        max = j - i + 1;
                        str = s.substring(i, j + 1);
                    }
                }
            }
        }
        return str;
    }
}
