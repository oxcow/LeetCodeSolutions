package com.leetcode.oj.problem.solution.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * URL: <a href="https://leetcode.com/problems/group-anagrams/description/">Group Anagrams</a>
 * <p>
 * Given an array of strings, group anagrams together.
 * <p>
 * Example:
 * <p>
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Output:
 * [
 * ["ate","eat","tea"],
 * ["nat","tan"],
 * ["bat"]
 * ]
 * Note:
 * <p>
 * All inputs will be in lowercase.
 * The order of your output does not matter.
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortStr = String.valueOf(chars);

            List<String> group = map.getOrDefault(sortStr, new ArrayList<>());

            group.add(str);

            map.put(sortStr, group);

        }

        List<List<String>> groups = new ArrayList<>();

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            groups.add(entry.getValue());
        }

        return groups;
    }
}
