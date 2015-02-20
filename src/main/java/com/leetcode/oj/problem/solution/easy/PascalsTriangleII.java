package com.leetcode.oj.problem.solution.easy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * URL: <a href="https://oj.leetcode.com/problems/pascals-triangle-ii/">pascals-triangle-ii</a>
 * Given an index k, return the kth row of the Pascal's triangle.
 * <p/>
 * For example, given k = 3,
 * Return [1,3,3,1].
 * <p/>
 * Note:
 * Could you optimize your algorithm to use only O(k) extra space?
 * <p/>
 * Created by leeyee.li on 2015/2/15.
 */
public class PascalsTriangleII {
    private static final Logger logger = LoggerFactory.getLogger(PascalsTriangleII.class);

    public List<Integer> getRow(int rowIndex) {

        Integer pascalsRow[] = new Integer[rowIndex + 1]; // 第n行的数字有n项。

        pascalsRow[0] = 1; // first = 1;

        if (rowIndex == 0) return new ArrayList<>(Arrays.asList(pascalsRow));

        pascalsRow[rowIndex] = 1; // last = first

        // a(k+1) = a(k) * (n-k)/(k+1).   n是行数，从0开始；k是列，从0开始
        long preNumCache = 1L;
        for (int col = 1; col <= rowIndex / 2; col++) {
            preNumCache = preNumCache * (rowIndex - col + 1) / col;
            pascalsRow[col] = (int) preNumCache;
            if (col < rowIndex + 1 - col)
                pascalsRow[rowIndex - col] = (int) preNumCache;
        }
        return new ArrayList<>(Arrays.asList(pascalsRow));
    }

    public static void main(String... args) throws Exception {
        PascalsTriangleII pascalsTriangleII = new PascalsTriangleII();
        List<Integer> pascals = pascalsTriangleII.getRow(33);
        System.out.print("[");
        for (Integer integer : pascals) {
            System.out.print(integer + ",");
        }
        System.out.println("]");
    }
}
