package com.leetcode.oj.problem.solution.hard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * URL: <a href="https://leetcode.com/problems/longest-consecutive-sequence/description/">Longest Consecutive Sequence</a>
 * <p>
 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
 * <p>
 * For example,
 * Given [100, 4, 200, 1, 3, 2],
 * The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.
 * <p>
 * Your algorithm should run in O(n) complexity.
 * <p>
 * Created by wli on 2017-08-22.
 */
public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        if (nums == null) return 0;
        if (nums.length <= 1) return nums.length;

        int maxConsecutiveLen = 0;
        Arrays.sort(nums);

        int base = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == base) continue;
            if (nums[i] - base == 1) {
                ++count;
            } else {
                maxConsecutiveLen = Math.max(maxConsecutiveLen, count);
                count = 1;
            }
            base = nums[i];
        }
        return Math.max(maxConsecutiveLen, count);
    }

    // 0(N)
    public int longestConsecutiveNotSort(int... nums) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (!map.containsKey(n)) {
                int left = (map.containsKey(n - 1)) ? map.get(n - 1) : 0;
                int right = (map.containsKey(n + 1)) ? map.get(n + 1) : 0;
                // sum: length of the sequence n is in
                int sum = left + right + 1;
                map.put(n, sum);

                // keep track of the max length
                res = Math.max(res, sum);

                // extend the length to the boundary(s)
                // of the sequence
                // will do nothing if n has no neighbors
                map.put(n - left, sum);
                map.put(n + right, sum);
            } else {
                // duplicates
                continue;
            }
        }
        return res;
    }
}
