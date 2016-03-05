package com.leetcode.oj.problem.solution.medium;

import java.util.*;

/**
 * URL: <a href="https://leetcode.com/problems/majority-element-ii/">Majority Element II</a>
 * <p>
 * Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
 * The algorithm should run in linear time and in O(1) space.
 * <p>
 * Hint:
 * <p>
 * How many majority elements could it possibly have?
 * <p>
 * Do you have a better hint? Suggest it!
 * <p>
 * Created by leeyee on 16-3-5.
 */
public class MajorityElementII {

    public List<Integer> majorityElement(int[] nums) {

        List<Integer> resultList = new ArrayList<>();

        int iLen = nums.length;

        if (iLen < 2) {
            for (int i = 0; i < iLen; i++) {
                resultList.add(nums[i]);
            }
            return resultList;
        }

        Arrays.sort(nums);

        int start = 0;
        int count = 1;

        for (int i = start + 1; i < iLen; i++) {

            if (nums[start] == nums[i]) {
                ++count;
            } else {
                if (count > iLen / 3) {
                    resultList.add(nums[start]);
                }
                count = 1;
            }

            start = i;

            if (start > iLen - 1) {
                break;
            }
        }

        if (count > iLen / 3) {
            resultList.add(nums[start]);
        }

        return resultList;
    }
}
