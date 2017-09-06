package com.leetcode.oj.problem.solution.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * URL: <a href="https://leetcode.com/problems/relative-ranks/description/">Relative Ranks</a>
 * <p>
 * Given scores of N athletes, find their relative ranks and the people with the top three highest scores, who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".
 * <p>
 * Example 1:
 * Input: [5, 4, 3, 2, 1]
 * Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
 * Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal", "Silver Medal" and "Bronze Medal".
 * For the left two athletes, you just need to output their relative ranks according to their scores.
 * Note:
 * N is a positive integer and won't exceed 10,000.
 * All the scores of athletes are guaranteed to be unique.
 * <p>
 * Created by leeyee on 2017/9/6 22:15.
 */
public class RelativeRanks {

    static String[] MEDALS = {"Gold Medal", "Silver Medal", "Bronze Medal"};

    /**
     * 1. copy array to a new array.
     * 2. sort origin array.
     * 3. get every element's relative ranks from the origin array that has sorted, and save to map.
     * 4. iterate new array that has copied, get relative ranks by element's index from map.
     * <p>
     * TODO: waste space! try to use other way to resolve
     *
     * @param nums
     * @return
     */
    public String[] findRelativeRanks(int[] nums) {

        int len = nums.length;

        int[] copy = Arrays.copyOf(nums, len);

        Arrays.parallelSort(nums);

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            map.put(nums[i], len - i);
        }

        String[] relativeRanks = new String[len];

        for (int i = 0; i < len; i++) {
            int offset = map.get(copy[i]);
            if (offset < 4) {
                relativeRanks[i] = MEDALS[offset - 1];
            } else {
                relativeRanks[i] = offset + "";
            }
        }

        return relativeRanks;
    }
}
