package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://leetcode.com/problems/peak-index-in-a-mountain-array/description/">Peak Index in a Mountain Array</a>
 * <p>
 * Let's call an array A a mountain if the following properties hold:
 * <p>
 * A.length >= 3
 * There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
 * Given an array that is definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].
 * <p>
 * Example 1:
 * <p>
 * Input: [0,1,0]
 * Output: 1
 * Example 2:
 * <p>
 * Input: [0,2,1,0]
 * Output: 1
 * Note:
 * <p>
 * 3 <= A.length <= 10000
 * 0 <= A[i] <= 10^6
 * A is a mountain, as defined above.
 */
public class PeakIndexInAMountainArray {

    public int peakIndexInMountainArray(int[] A) {
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i - 1] < A[i] && A[i] > A[i + 1]) {
                return i;
            }
        }
        // 根据Note描述肯定不会返回该值。
        return -1;
    }

    // 根据Note中描述的，实际是求数组最大值的位置，只要该值的位置不在开头和结尾就符合要求
    // 比上面的方法处理起来要慢！
    public int peakIndex(int[] A) {
        int maxIdx = 0;
        int max = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
                maxIdx = i;
            }
        }
        if (maxIdx != 0 && maxIdx != A.length - 1) {
            return maxIdx;
        } else {
            return -1;
        }
    }
}
