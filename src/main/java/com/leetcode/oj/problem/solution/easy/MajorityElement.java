package com.leetcode.oj.problem.solution.easy;

import java.util.Arrays;

/**
 * URL: <a href="https://leetcode.com/problems/majority-element/">Majority Element</a>
 * <p>
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * <p>
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * <p>
 * <a href="https://leetcode.com/problems/majority-element/solution/">Majority Element Runtime</a>
 * <p>
 * Runtime: O(n2) — Brute force solution: Check each element if it is the majority element.
 * <p>
 * Runtime: O(n), Space: O(n) — Hash table: Maintain a hash table of the counts of each element, then find the most common one.
 * <p>
 * Runtime: O(n log n) — Sorting: As we know more than half of the array are elements of the same value, we can sort the array and all majority elements will be grouped into one contiguous chunk. Therefore, the middle (n/2th) element must also be the majority element.
 * <p>
 * Average runtime: O(n), Worst case runtime: Infinity — Randomization: Randomly pick an element and check if it is the majority element. If it is not, do the random pick again until you find the majority element. As the probability to pick the majority element is greater than 1/2, the expected number of attempts is < 2.
 * <p>
 * Runtime: O(n log n) — Divide and conquer: Divide the array into two halves, then find the majority element A in the first half and the majority element B in the second half. The global majority element must either be A or B. If A == B, then it automatically becomes the global majority element. If not, then both A and B are the candidates for the majority element, and it is suffice to check the count of occurrences for at most two candidates. The runtime complexity, T(n) = T(n/2) + 2n = O(n log n).
 * <p>
 * Runtime: O(n) — Moore voting algorithm: We maintain a current candidate and a counter initialized to 0. As we iterate the array, we look at the current element x:
 * <p>
 * If the counter is 0, we set the current candidate to x and the counter to 1.
 * <p>
 * If the counter is not 0, we increment or decrement the counter based on whether x is the current candidate.
 * <p>
 * After one pass, the current candidate is the majority element. Runtime complexity = O(n).
 * <p>
 * Runtime: O(n) — Bit manipulation: We would need 32 iterations, each calculating the number of 1's for the ith bit of all n numbers. Since a majority must exist, therefore, either count of 1's > count of 0's or vice versa (but can never be equal). The majority number’s ith bit must be the one bit that has the greater count.
 * <p>
 * Update (2014/12/24): Improve algorithm on the O(n log n) sorting solution: We do not need to 'Find the longest contiguous identical element' after sorting, the n/2th element is always the majority.
 * Created by leeyee on 16-3-5.
 */
public class MajorityElement {


    /**
     * Runtime: O(n2)
     *
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {

        int iLen = nums.length;

        if (iLen == 1) return nums[0];

        if (iLen == 2 && nums[0] == nums[1]) return nums[0];

        int minCount = iLen / 2 + 1;

        Arrays.sort(nums);

        int start = 0;

        while (true) {
            int count = 1;

            for (int i = start + 1; i < iLen; i++) {
                if (nums[start] == nums[i]) {
                    ++count;
                    start = i;
                } else {
                    start = i;
                    break;
                }
            }

            if (count >= minCount) return nums[start - 1];

            if (start >= iLen - 1) return Integer.MIN_VALUE;
        }

    }
}
