package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://leetcode.com/problems/toeplitz-matrix/description/">Toeplitz Matrix</a>
 * <p>
 * A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same element.
 * <p>
 * Now given an M x N matrix, return True if and only if the matrix is Toeplitz.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input:
 * matrix = [
 * [1,2,3,4],
 * [5,1,2,3],
 * [9,5,1,2]
 * ]
 * Output: True
 * Explanation:
 * In the above grid, the diagonals are:
 * "[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]".
 * In each diagonal all elements are the same, so the answer is True.
 * Example 2:
 * <p>
 * Input:
 * matrix = [
 * [1,2],
 * [2,2]
 * ]
 * Output: False
 * Explanation:
 * The diagonal "[1, 2]" has different elements.
 * <p>
 * Note:
 * <p>
 * matrix will be a 2D array of integers.
 * matrix will have a number of rows and columns in range [1, 20].
 * matrix[i][j] will be integers in range [0, 99].
 * <p>
 * Follow up:
 * <p>
 * What if the matrix is stored on disk, and the memory is limited such that you can only load at most one row of the matrix into the memory at once?
 * What if the matrix is so large that you can only load up a partial row into the memory at once?
 */
public class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        // 对角线上半部分，包含对角线
        for (int i = 0; i < n - 1; i++) {
            if (!isEqual(0, i, m, n, matrix)) {
                return false;
            }
        }

        // 对角线下半部分
        for (int i = 1; i < m - 1; i++) {
            if (!isEqual(i, 0, m, n, matrix)) {
                return false;
            }
        }

        return true;
    }

    private boolean isEqual(int x, int y, int m, int n, int[][] matrix) {
        int base = matrix[x][y];
        while (x++ < m - 1 && y++ < n - 1) {
            if (base != matrix[x][y]) {
                return false;
            }
        }
        return true;
    }

}
