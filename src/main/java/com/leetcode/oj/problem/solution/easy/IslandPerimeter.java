package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://leetcode.com/problems/island-perimeter/">Island Perimeter</a>
 * <p>
 * You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water. Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells). The island doesn't have "lakes" (water inside that isn't connected to the water around the island). One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.
 * <p>
 * Example:
 * <p>
 * [[0,1,0,0],
 * [1,1,1,0],
 * [0,1,0,0],
 * [1,1,0,0]]
 * <p>
 * Answer: 16
 * Explanation: The perimeter is the 16 yellow stripes in the image below:
 * <p>
 * <p>
 * Created by leeyee on 2017/4/1.
 */
public class IslandPerimeter {

    public static final int SIDE_LEN = 1;

    public int islandPerimeter(int[][] grid) {

        int side = 0;

        int col = grid.length, row = grid[0].length;

        for (int i = 0; i < col; i++) {

            for (int j = 0; j < row; j++) {

                if (grid[i][j] == 1) {

                    side += 4;

                    // up
                    if (i >= 1 && grid[i - 1][j] == 1) {
                        side -= 1;
                    }
                    // down
                    if (i + 1 < col && grid[i + 1][j] == 1) {
                        side -= 1;
                    }
                    // before
                    if (j >= 1 && grid[i][j - 1] == 1) {
                        side -= 1;
                    }
                    // after
                    if (j + 1 < row && grid[i][j + 1] == 1) {
                        side -= 1;
                    }

                }
            }

        }

        return SIDE_LEN * side;
    }
}
