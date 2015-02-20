package com.leetcode.oj.problem.solution.easy;

import junit.framework.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PascalsTriangleIITest {

    @Test
    public void testGetRow() throws Exception {
        PascalsTriangleII pascalsTriangleII = new PascalsTriangleII();
        for (int r = 0; r < 34; r++) {
            Assert.assertTrue(isPascalsTriangleRowSimpleTest(pascalsTriangleII.getRow(r),r));
        }
    }

    private boolean isPascalsTriangleRowSimpleTest( List<Integer>  pascalsTriangleRows,int n) {

            int rowSize = pascalsTriangleRows.size();

            //第n行的数字有n项。
            if (pascalsTriangleRows == null || rowSize != n + 1) return false;

            //前提：端点的数为1.
            if (n == 0 && pascalsTriangleRows.get(0) != 1) return false;

            //第n行数字和为2的(n-1)次方
            {
                long sum = 0; // sum 有可能超出 Integer.MAX_VALUE
                for (Integer colNum : pascalsTriangleRows) {
                    sum += colNum;
                }
                if (sum != Math.pow(2, rowSize - 1)) return false;
            }
        return true;
    }
}