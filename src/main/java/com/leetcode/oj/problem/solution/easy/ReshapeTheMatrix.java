package com.leetcode.oj.problem.solution.easy;

import com.leetcode.oj.problem.solution.common.StringHelper;

import java.util.stream.IntStream;

/**
 * URL: <a href="https://leetcode.com/problems/reshape-the-matrix/description/">Reshape the Matrix</a>
 * <p>
 * In MATLAB, there is a very useful function called 'reshape', which can reshape a matrix into a new one with different size but keep its original data.
 * <p>
 * You're given a matrix represented by a two-dimensional array, and two positive integers r and c representing the row number and column number of the wanted reshaped matrix, respectively.
 * <p>
 * The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.
 * <p>
 * If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.
 * <p>
 * Example 1:
 * Input:
 * nums =
 * [[1,2],
 * [3,4]]
 * r = 1, c = 4
 * Output:
 * [[1,2,3,4]]
 * Explanation:
 * The row-traversing of nums is [1,2,3,4]. The new reshaped matrix is a 1 * 4 matrix, fill it row by row by using the previous list.
 * Example 2:
 * Input:
 * nums =
 * [[1,2],
 * [3,4]]
 * r = 2, c = 4
 * Output:
 * [[1,2],
 * [3,4]]
 * Explanation:
 * There is no way to reshape a 2 * 2 matrix to a 2 * 4 matrix. So output the original matrix.
 * Note:
 * The height and width of the given matrix is in range [1, 100].
 * The given r and c are all positive.
 * <p>
 * Created by leeyee on 2017/8/18.
 */
public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {

        if (nums == null) return nums;

        int row = nums.length, col = nums[0].length;

        if (r * c != row * col) return nums;

        int[][] reshape = new int[r][c];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int offset = i * col + j;
                reshape[offset / c][offset % c] = nums[i][j];
            }
        }

        return reshape;
    }


}
