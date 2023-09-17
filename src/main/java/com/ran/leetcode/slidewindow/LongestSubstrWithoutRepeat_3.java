package com.ran.leetcode.slidewindow;

import java.util.HashMap;
import java.util.Map;

/**
 * LongestSubstrWithoutRepeat_3
 * 滑动窗口
 *
 * @author rwei
 * @since 2023/9/15 15:50
 */
public class LongestSubstrWithoutRepeat_3 {
    public static void main(String[] args) {
        LongestSubstrWithoutRepeat_3 obj = new LongestSubstrWithoutRepeat_3();
        String s = "abcabcbb";
        int result = obj.lengthOfLongestSubstring(s);
        System.out.println(result);
    }

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] ch = s.toCharArray();
        int left = 0;
        int right = 0;
        int max = 0;
        while (right < ch.length) {
            char c1 = ch[right];
            map.put(c1, map.getOrDefault(c1, 0) + 1);
            while (map.get(c1) > 1) {
                char c2 = ch[left];
                map.put(c2, map.get(c2) - 1);
                left++;
            }
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }
}
