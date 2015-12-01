package com.leetcode.oj.problem.solution.medium;

import com.google.common.base.Stopwatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * URL: <a href="https://leetcode.com/problems/two-sum/">Two Sum</a>
 * <p/>
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * <p/>
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * <p/>
 * You may assume that each input would have exactly one solution.
 * <p/>
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 * <p/>
 * <p/>
 * O(n2) runtime, O(1) space – Brute force:
 * <p/>
 * The brute force approach is simple. Loop through each element x and find if there is another value that equals to target – x. As finding another value requires looping through the rest of array, its runtime complexity is O(n2).
 * <p/>
 * O(n) runtime, O(n) space – Hash table:
 * <p/>
 * We could reduce the runtime complexity of looking up a value to O(1) using a hash map that maps a value to its index.
 * <p/>
 * Created by leeyee.li on 2015/11/11.
 */
public class TowSum {
    private static final Logger logger = LoggerFactory.getLogger(TowSum.class);

    public int[] twoSumUseLoop(int[] nums, int target) {
        Stopwatch stopwatch = Stopwatch.createStarted();
        int result[] = null;
        int iLen = nums.length;
        for (int i = 0; i < iLen; i++) {
            for (int j = i + 1; j < iLen; j++) {
                if (nums[i] + nums[j] == target) {
                    result = new int[]{i + 1, j + 1};
                }
            }
        }
        logger.info("twoSumUseLoop({},{}) spend:{}μs", nums, target, stopwatch.stop().elapsed(TimeUnit.MICROSECONDS));
        return result;
    }

    public int[] towSumUseHashMap(int[] nums, int target) {
        Stopwatch stopwatch = Stopwatch.createStarted();
        Map<Integer, Integer> map = new HashMap<>();
        int result[] = null;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                result = new int[]{map.get(nums[i]) + 1, i + 1};
                break;
            } else {
                map.put(target - nums[i], i);
            }
        }

        logger.info("towSumUseHashMap({},{}) spend:{}μs", nums, target, stopwatch.stop().elapsed(TimeUnit.MICROSECONDS));
        return result;

    }
}
