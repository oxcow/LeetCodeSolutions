package com.leetcode.oj.problem.solution.easy;

import junit.framework.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;


public class PascalsTriangleTest {

    private static final Logger logger = LoggerFactory.getLogger(PascalsTriangleTest.class);

    @Test
    public void testGenerate() throws Exception {
        for (int i = 1; i < 15; i++) {
            List<List<Integer>> pascals = PascalsTriangle.generate(i);
            Assert.assertTrue(isPascalsTriangleSimpleTest(pascals));
        }
    }

    private boolean isPascalsTriangleSimpleTest(List<List<Integer>> pascalsTriangles) {

        for (int n = 0; n < pascalsTriangles.size(); n++) {

            List<Integer> rowNums = pascalsTriangles.get(n);
            int rowSize = rowNums.size();

            //第n行的数字有n项。
            if (rowNums == null || rowSize != n + 1) return false;

            //前提：端点的数为1.
            if (n == 0 && rowNums.get(0) != 1) return false;

            //第n行数字和为2的(n-1)次方
            {
                int sum = 0;
                for (Integer colNum : rowNums) {
                    sum += colNum;
                }
                if (sum != Math.pow(2, rowSize - 1)) return false;
            }

            if (n > 0) {

                for (int m = 0; m < rowSize / 2; m++) {
                    // 第n行的第m个数和第n-m+1个数相等
                    // can not use rowNums.get(m)==rowNums.get(n-m) , beacuse IntegerCache -128-127
                    // when value gt 127, rowNums.get(m)==rowNums.get(n-m) return false
                    if (rowNums.get(m).intValue() != rowNums.get(n - m).intValue()) {
                        return false;
                    }
                    //每个数等于它上方两数之和。
                    int preNumSum = PascalsTriangle.getValueFromList(pascalsTriangles.get(n - 1), m - 1) + PascalsTriangle.getValueFromList(pascalsTriangles.get(n - 1), m);
                    if (rowNums.get(m) != preNumSum) {
                        return false;
                    }

                }
            }
        }
        return true;
    }
}