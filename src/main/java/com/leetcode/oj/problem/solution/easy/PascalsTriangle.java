package com.leetcode.oj.problem.solution.easy;

import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * URL: <a href="https://oj.leetcode.com/problems/pascals-triangle/">pascals-triangle</a>
 * Given numRows, generate the first numRows of <a href="http://baike.baidu.com/link?url=HUNCZZlqkYp97FZn-cIdjiSc70yc8OB3c3jyA7WgnjG97Bt2i5bk5MtQpc7AK6R9Eq7VuBQR3BzUmOnFwHHHVIp6SiQlYhmVGgMg6eP8Xj8eteioftDnNJaMEHMGdPX-ncDNiZMg6oDeYZsSntKw2akL-bt8DYvEsXvPKI4sGePeL10eSecFVohCRjZOO3ah">Pascal's triangle.</a>
 * <p/>
 * For example, given numRows = 5,
 * Return
 * <pre>
 * [
 *  [1],
 *  [1,1],
 *  [1,2,1],
 *  [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 * </pre>
 * Created by leeyee.li on 2015/2/2.
 */
public class PascalsTriangle {
    private static final Logger logger = LoggerFactory.getLogger(PascalsTriangle.class);

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> pascals = new ArrayList<>(numRows);

        Integer rowCache[] = null;

        for (int row = 0; row < numRows; row++) {
            Integer rows[] = new Integer[row + 1];
            rows[0] = 1;
            if (row > 0) {
                rows[row] = 1; // first and end number certainly equal to 1
                for (int col = 1; col <= row / 2; col++) { // pascals triangle is symmetric, so loop half!
                    int value = rowCache[col - 1] + rowCache[col];
                    rows[col] = value;
                    if (col < row - col)
                        rows[row - col] = value;
                }
            }
            rowCache = rows;
            pascals.add(Arrays.asList(rows));
        }
        return pascals;
    }


    public static void main(String... args) throws Exception {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        List<List<Integer>> pascals = pascalsTriangle.generate(34);
        for (List<Integer> rowList : pascals) {
            System.out.print("[");
            for (Integer integer : rowList) {
                System.out.print(integer + ",");
            }
            System.out.println("]");
        }
    }
}
