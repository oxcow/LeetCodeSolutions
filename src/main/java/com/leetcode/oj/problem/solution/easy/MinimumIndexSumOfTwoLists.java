package com.leetcode.oj.problem.solution.easy;

import java.util.*;
import java.util.stream.IntStream;

/**
 * URL: <a href="https://leetcode.com/problems/minimum-index-sum-of-two-lists/description/">Minimum Index Sum of Two Lists</a>
 * <p>
 * Suppose Andy and Doris want to choose a restaurant for dinner, and they both have a list of favorite restaurants represented by strings.
 * <p>
 * You need to help them find out their common interest with the least list index sum. If there is a choice tie between answers, output all of them with no order requirement. You could assume there always exists an answer.
 * <p>
 * Example 1:
 * Input:
 * ["Shogun", "Tapioca Express", "Burger King", "KFC"]
 * ["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
 * Output: ["Shogun"]
 * Explanation: The only restaurant they both like is "Shogun".
 * Example 2:
 * Input:
 * ["Shogun", "Tapioca Express", "Burger King", "KFC"]
 * ["KFC", "Shogun", "Burger King"]
 * Output: ["Shogun"]
 * Explanation: The restaurant they both like and have the least index sum is "Shogun" with index sum 1 (0+1).
 * Note:
 * The length of both lists will be in the range of [1, 1000].
 * The length of strings in both lists will be in the range of [1, 30].
 * The index is starting from 0 to the list length minus 1.
 * No duplicates in both lists.
 * <p>
 * Created by wli on 2017-08-23.
 */
public class MinimumIndexSumOfTwoLists {

    //TODO: Need to optimization algorithm

    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        Map<String, Integer> maps = new HashMap<>();
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                maps.put(list2[i], i + map.get(list2[i]));
            }
        }

        int minIdx = maps.values().stream().sorted().findFirst().get();

        List<String> res = new ArrayList<>();
        maps.forEach((k, v) -> {
            if (v == minIdx) {
                res.add(k);
            }
        });

        return res.toArray(new String[0]);
    }

}
