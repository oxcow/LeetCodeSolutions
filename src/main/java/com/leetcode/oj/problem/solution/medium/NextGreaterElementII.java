package com.leetcode.oj.problem.solution.medium;

/**
 * URL: <a href="https://leetcode.com/problems/next-greater-element-ii/description/">Next Greater Element II</a>
 * <p>
 * Given a circular array (the next element of the last element is the first element of the array), print the Next Greater Number for every element. The Next Greater Number of a number x is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, output -1 for this number.
 * <p>
 * Example 1:
 * Input: [1,2,1]
 * Output: [2,-1,2]
 * Explanation: The first 1's next greater number is 2;
 * The number 2 can't find next greater number;
 * The second 1's next greater number needs to search circularly, which is also 2.
 * Note: The length of given array won't exceed 10000.
 * <p>
 * Created by wli on 2017-09-07.
 */
public class NextGreaterElementII {
    /**
     * iterate find the next greater element for current element.
     * <p>
     * <ol>
     * <li>iterate array. current element's index be marked as 'mid'</li>
     * <li>find the next greater element by inner iterate array.
     * <ul>
     * <li> firstly, iterate the array from 'mid' to 'length-1', 'mid'is open. (mid, lenght -1].</li>
     * <p>
     * if not found the next greater then
     * <li>secondly, iterate the array from 0 to the 'mid', 'mid' is open. [0,mid)</li>
     * </ul>
     * </li>
     * </ol>
     * <p>
     * Time complexity: O(n2).
     * <p>
     * Space complexity: O(n).
     *
     * @param nums
     * @return the Next Greater Number for every element
     * @throws IllegalArgumentException if arg == null or arg.length == 0
     */
    public int[] nextGreaterElements(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Argument can not empty.");
        }

        int len = nums.length;
        int nextGreaters[] = new int[len];
        for (int mid = 0; mid < len; mid++) {

            int nextGreater = nums[mid];
            for (int right = mid + 1; right < len; right++) {
                if (nums[right] > nextGreater) {
                    nextGreater = nums[right];
                    break;
                }
            }
            if (nextGreater == nums[mid]) {
                for (int left = 0; left < mid; left++) {
                    if (nums[left] > nextGreater) {
                        nextGreater = nums[left];
                        break;
                    }
                }
            }

            nextGreaters[mid] = nextGreater > nums[mid] ? nextGreater : -1;
        }

        return nextGreaters;
    }
}
