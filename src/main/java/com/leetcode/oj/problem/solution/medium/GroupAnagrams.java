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

        Map<String, List<String>> groupMap = new HashMap<>();

        Arrays.stream(strs).forEach(str -> {

            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortStr = String.valueOf(chars);

            List<String> group = groupMap.getOrDefault(sortStr, new ArrayList<>());
            group.add(str);
            groupMap.put(sortStr, group);
        });

        return new ArrayList<>(groupMap.values());
    }
}
