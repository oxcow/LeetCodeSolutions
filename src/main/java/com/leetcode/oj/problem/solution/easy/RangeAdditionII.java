package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://leetcode.com/problems/range-addition-ii/description/">Range Addition II</a>
 * <p>
 * Given an m * n matrix M initialized with all 0's and several update operations.
 * <p>
 * Operations are represented by a 2D array, and each operation is represented by an array with two positive integers a and b, which means M[i][j] should be added by one for all 0 <= i < a and 0 <= j < b.
 * <p>
 * You need to count and return the number of maximum integers in the matrix after performing all the operations.
 * <p>
 * Example 1:
 * Input:
 * m = 3, n = 3
 * operations = [[2,2],[3,3]]
 * Output: 4
 * Explanation:
 * Initially, M =
 * [[0, 0, 0],
 * [0, 0, 0],
 * [0, 0, 0]]
 * <p>
 * After performing [2,2], M =
 * [[1, 1, 0],
 * [1, 1, 0],
 * [0, 0, 0]]
 * <p>
 * After performing [3,3], M =
 * [[2, 2, 1],
 * [2, 2, 1],
 * [1, 1, 1]]
 * <p>
 * So the maximum integer in M is 2, and there are four of it in M. So return 4.
 * Note:
 * The range of m and n is [1,40000].
 * The range of a is [1,m], and the range of b is [1,n].
 * The range of operations size won't exceed 10,000.
 * <p>
 * <p>
 * <p>
 * 求ops操作数的交集。
 * <p>
 * Created by leeyee on 2017/8/19.
 */
public class RangeAdditionII {


    public int maxCount(int m, int n, int[][] ops) {

        if (ops == null || ops.length == 0) return m * n;

        int minRow = ops[0][0], minCol = ops[0][1];

        for (int i = 1; i < ops.length; i++) {
            minRow = Math.min(ops[i][0], minRow);
            minCol = Math.min(ops[i][1], minCol);
        }

        return minRow * minCol;
    }

}
