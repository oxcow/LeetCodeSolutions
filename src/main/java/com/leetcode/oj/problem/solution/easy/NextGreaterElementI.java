package com.leetcode.oj.problem.solution.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * URL: <a href="https://leetcode.com/problems/next-greater-element-i/">Next Greater Element I</a>
 * <p>
 * You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2. Find all the next greater numbers for nums1's elements in the corresponding places of nums2.
 * <p>
 * The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2. If it does not exist, output -1 for this number.
 * <p>
 * Example 1:
 * Input: nums1 = [4,1,2], nums2 = [1,3,4,2].
 * Output: [-1,3,-1]
 * Explanation:
 * For number 4 in the first array, you cannot find the next greater number for it in the second array, so output -1.
 * For number 1 in the first array, the next greater number for it in the second array is 3.
 * For number 2 in the first array, there is no next greater number for it in the second array, so output -1.
 * Example 2:
 * Input: nums1 = [2,4], nums2 = [1,2,3,4].
 * Output: [3,-1]
 * Explanation:
 * For number 2 in the first array, the next greater number for it in the second array is 3.
 * For number 4 in the first array, there is no next greater number for it in the second array, so output -1.
 * Note:
 * All elements in nums1 and nums2 are unique.
 * The length of both nums1 and nums2 would not exceed 1000.
 * <p>
 * Created by leeyee on 2017/4/1.
 */
public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        int[] result = new int[findNums.length];

        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            numsMap.put(nums[i], i);
        }

        for (int i = 0; i < findNums.length; i++) {
            int findNum = findNums[i];
            // 在目标数组nums中找到匹配的元素所在的位置
            int matchIdx = numsMap.getOrDefault(findNum, -1);
            if (matchIdx == -1) { // 根据题目的假设来讲，匹配不到的情况应该不会出现！
                result[i] = -1;
                break;
            }
            // 在目标数组nums中，从matchIdx+1开始查找比匹配元素第一大的数
            int nextGreater = -1;
            for (int j = matchIdx + 1; j < nums.length; j++) {
                if (findNum < nums[j]) {
                    nextGreater = nums[j];
                    break;
                }
            }
            result[i] = nextGreater;
        }
        return result;
    }
}
