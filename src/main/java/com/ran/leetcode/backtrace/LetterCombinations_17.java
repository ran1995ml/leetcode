package com.ran.leetcode.backtrace;

import java.util.ArrayList;
import java.util.List;

/**
 * LetterCombinations_17
 *
 * @author rwei
 * @since 2023/9/21 16:11
 */
public class LetterCombinations_17 {
    private static final String[] LETTERS = {"", "", "abc", "def", "ghi", "jkl", "mno",
            "pqrs", "tuv", "wxyz"};

    public static void main(String[] args) {
        String digits = "";
        LetterCombinations_17 obj = new LetterCombinations_17();
        List<String> res = obj.letterCombinations(digits);
        System.out.println(res.toString());
    }

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0) return ans;
        dfs(ans, new StringBuffer(), digits, 0);
        return ans;
    }

    private void dfs(List<String> ans, StringBuffer sb, String digits, int index) {
        if (sb.length() == digits.length()) {
            ans.add(String.valueOf(sb));
            return;
        }
        char c = digits.charAt(index);
        char[] letters = LETTERS[c - '0'].toCharArray();
        for (char letter : letters) {
            sb.append(letter);
            dfs(ans, sb, digits, index + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
