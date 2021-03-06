package com.leetcode.oj.problem.solution.easy;

import java.util.Arrays;

/**
 * URL: <a href="https://leetcode.com/problems/merge-sorted-array/description/">Merge Sorted Array</a>
 * <p>
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * <p>
 * Note:
 * <p>
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * Example:
 * <p>
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * <p>
 * Output: [1,2,2,3,5,6]
 */
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        Arrays.sort(nums1);
    }

    // 归并排序
    public void merge1(int[] nums1, int m, int[] nums2, int n) {

        int[] subNums1 = new int[m];

        for (int i = 0; i < m; i++) {
            subNums1[i] = nums1[i];
        }

        int i = 0;

        for (int idx1 = 0, idx2 = 0; idx1 < m || idx2 < n; ) {

            if (idx1 == m) {
                nums1[i++] = nums2[idx2++];
                continue;
            }

            if (idx2 == n) {
                nums1[i++] = subNums1[idx1++];
                continue;
            }

            int num1 = subNums1[idx1], num2 = nums2[idx2];

            if (num1 < num2) {
                nums1[i++] = num1;
                idx1++;
            } else if (num1 == num2) {
                nums1[i++] = num1;
                nums1[i++] = num2;
                idx1++;
                idx2++;
            } else {
                nums1[i++] = num2;
                idx2++;
            }
        }
    }

}
