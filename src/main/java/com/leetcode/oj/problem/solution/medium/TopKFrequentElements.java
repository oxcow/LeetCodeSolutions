package com.leetcode.oj.problem.solution.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * URL: <a href="https://leetcode.com/problems/top-k-frequent-elements/description/">Top K Frequent Elements</a>
 * <p>
 * Given a non-empty array of integers, return the k most frequent elements.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 * Example 2:
 * <p>
 * Input: nums = [1], k = 1
 * Output: [1]
 * Note:
 * <p>
 * You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
 * Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 *
 * @see TopKFrequentWords
 */
public class TopKFrequentElements {

    public List<Integer> topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> frequents = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            frequents.put(nums[i], frequents.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer> candidates = new ArrayList(frequents.keySet());
        Collections.sort(candidates, (w1, w2) -> frequents.get(w1).equals(frequents.get(w2)) ?
                w1.compareTo(w2) : frequents.get(w2) - frequents.get(w1));

        return candidates.subList(0, k);
    }
}
