package com.leetcode.oj.problem.solution.easy;

import com.google.common.collect.Lists;

import java.util.ArrayList;
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

    public static Integer getValueFromList(List<Integer> rowList, int index) {
        if (index < 0 || rowList == null || rowList.size() <= index) {
            return 0;
        } else {
            return rowList.get(index);
        }
    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> pascals = Lists.newArrayList();

        for (int row = 1; row <= numRows; row++) {
            if (row == 1) {
                List<Integer> topList = new ArrayList<Integer>(1);
                topList.add(1);
                pascals.add(topList);
            } else {
                List<Integer> rowList = new ArrayList<Integer>(row);

                List<Integer> preRowList = pascals.get(row - 2);

                for (int col = 0; col < row; col++) {
                    int left = getValueFromList(preRowList, col - 1);
                    int right = getValueFromList(preRowList, col);
                    rowList.add(left + right);

                }
                pascals.add(rowList);
            }
        }
        return pascals;
    }
}
