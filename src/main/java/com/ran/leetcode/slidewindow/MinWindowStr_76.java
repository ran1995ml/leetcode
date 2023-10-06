package com.ran.leetcode.slidewindow;

import java.util.HashMap;
import java.util.Map;

/**
 * MinWindowStr_76
 * 注意窗口滑动的条件，只要window里的value大于needs里的value，即满足条件
 * 需要用count记录满足的key
 *
 * @author rwei
 * @since 2023/10/6 15:50
 */
public class MinWindowStr_76 {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        MinWindowStr_76 obj = new MinWindowStr_76();
        System.out.println(obj.minWindow(s, t));
    }

    public String minWindow(String s, String t) {
        char[] sh = s.toCharArray();
        char[] th = t.toCharArray();
        Map<Character, Integer> needs = new HashMap<>();
        for (char c : th) {
            needs.put(c, needs.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> windows = new HashMap<>();
        int left = 0;
        int right = 0;
        int min = Integer.MAX_VALUE;
        int count = 0;
        String str = "";
        while (right < sh.length) {
            char c1 = sh[right];
            if (needs.containsKey(c1)) {
                windows.put(c1, windows.getOrDefault(c1, 0) + 1);
                if (windows.get(c1).equals(needs.get(c1))) count++;
            }
            while (count == needs.size()) {
                if (right - left + 1 < min) {
                    min = right - left + 1;
                    str = s.substring(left, right + 1);
                }
                char c2 = sh[left];
                if (needs.containsKey(c2)) {
                    windows.put(c2, windows.get(c2) - 1);
                    if (windows.get(c2) < needs.get(c2)) count--;
                }
                left++;
            }
            right++;
        }
        return str;
    }
}
