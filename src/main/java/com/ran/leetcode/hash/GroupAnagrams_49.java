package com.ran.leetcode.hash;

import java.util.*;

/**
 * GroupAnagrams_49
 *
 * @author rwei
 * @since 2023/9/26 11:26
 */
public class GroupAnagrams_49 {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        GroupAnagrams_49 obj = new GroupAnagrams_49();
        System.out.println(obj.groupAnagrams(strs).toString());
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chs = str.toCharArray();
            Arrays.sort(chs);
            String key = new String(chs);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
