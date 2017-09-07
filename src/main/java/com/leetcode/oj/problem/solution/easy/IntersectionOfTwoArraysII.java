package com.leetcode.oj.problem.solution.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * URL: <a href="https://leetcode.com/problems/intersection-of-two-arrays-ii/description/">Intersection of Two Arrays II</a>
 * <p>
 * Given two arrays, write a function to compute their intersection.
 * <p>
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
 * <p>
 * Note:
 * Each element in the result should appear as many times as it shows in both arrays.
 * The result can be in any order.
 * Follow up:
 * What if the given array is already sorted? How would you optimize your algorithm?
 * What if nums1's size is small compared to nums2's size? Which algorithm is better?
 * What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 * <p>
 * Created by leeyee on 2017/9/6 23:18.
 */
public class IntersectionOfTwoArraysII {

    /**
     * compute the intersection. two arrays have be sorted, and the first array 's size more than second.
     *
     * @param sortedLongNums
     * @param sortedShortNums
     * @return
     */
    private List<Integer> intersectSorted(int[] sortedLongNums, int[] sortedShortNums) {
        List<Integer> intersect = new ArrayList<>();

        for (int i = 0, j = 0; i < sortedLongNums.length && j < sortedShortNums.length; i++) {
            if (sortedLongNums[i] == sortedShortNums[j]) {
                intersect.add(sortedLongNums[i]);
                ++j;
            } else if (sortedLongNums[i] > sortedShortNums[j]) {
                ++j;
                --i;
            }
        }
        return intersect;
    }

    /**
     * 1. Sorted two arrays
     * 2. Get a larger array of lengths
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.parallelSort(nums1);
        Arrays.parallelSort(nums2);

        List<Integer> intersect = nums1.length < nums2.length ?
                intersectSorted(nums2, nums1) : intersectSorted(nums1, nums2);

        return intersect.stream().mapToInt(e -> e).toArray();
    }
}
