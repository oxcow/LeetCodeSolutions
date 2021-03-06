package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://leetcode.com/problems/valid-mountain-array/">Valid Mountain Array</a>
 * <p>
 * Given an array A of integers, return true if and only if it is a valid mountain array.
 * <p>
 * Recall that A is a mountain array if and only if:
 * <p>
 * A.length >= 3
 * There exists some i with 0 < i < A.length - 1 such that:
 * A[0] < A[1] < ... A[i-1] < A[i]
 * A[i] > A[i+1] > ... > A[B.length - 1]
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: [2,1]
 * Output: false
 * Example 2:
 * <p>
 * Input: [3,5,5]
 * Output: false
 * Example 3:
 * <p>
 * Input: [0,3,2,1]
 * Output: true
 * <p>
 * <p>
 * Note:
 * <p>
 * 0 <= A.length <= 10000
 * 0 <= A[i] <= 10000
 */
public class ValidMountainArray {
    public boolean validMountainArray(int[] A) {

        if (A.length < 3 || A[1] <= A[0]) return false;

        boolean uphill = true;

        for (int i = 2; i < A.length; i++) {

            if (A[i] == A[i - 1]) return false;

            int currentDirect = A[i] - A[i - 1];

            if (uphill && currentDirect < 0) {
                uphill = false;// start downhill
            } else if (!uphill && currentDirect > 0) {
                return false;
            }
        }

        return !uphill;
    }

    public boolean validMountainArray1(int[] A) {

        if (A.length < 3 || A[1] <= A[0]) return false;

        int uphillIndex = 1;
        for (int up = 2; up < A.length; up++) {

            if (A[up] == A[up - 1]) return false;

            if (A[up] < A[up - 1]) break;

            uphillIndex = up;
        }

        if (uphillIndex == A.length - 1) return false;

        int downhillIndex = -1;
        for (int down = uphillIndex + 1; down < A.length; down++) {

            if (A[down] == A[down - 1]) return false;

            if (A[down] > A[down - 1]) break;

            downhillIndex = down;
        }
        return downhillIndex == A.length - 1;
    }
}
