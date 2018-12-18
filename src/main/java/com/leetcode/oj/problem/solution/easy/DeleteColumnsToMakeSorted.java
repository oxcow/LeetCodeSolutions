package com.leetcode.oj.problem.solution.easy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * URL: <a href="https://leetcode.com/problems/delete-columns-to-make-sorted/">Delete Columns to Make Sorted</a>
 * <p>
 * We are given an array A of N lowercase letter strings, all of the same length.
 * <p>
 * Now, we may choose any set of deletion indices, and for each string, we delete all the characters in those indices.
 * <p>
 * For example, if we have an array A = ["abcdef","uvwxyz"] and deletion indices {0, 2, 3}, then the final array after deletions is ["bef", "vyz"], and the remaining columns of A are ["b","v"], ["e","y"], and ["f","z"].  (Formally, the c-th column is [A[0][c], A[1][c], ..., A[A.length-1][c]].)
 * <p>
 * Suppose we chose a set of deletion indices D such that after deletions, each remaining column in A is in non-decreasing sorted order.
 * <p>
 * Return the minimum possible value of D.length.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: ["cba","daf","ghi"]
 * Output: 1
 * Explanation:
 * After choosing D = {1}, each column ["c","d","g"] and ["a","f","i"] are in non-decreasing sorted order.
 * If we chose D = {}, then a column ["b","a","h"] would not be in non-decreasing sorted order.
 * Example 2:
 * <p>
 * Input: ["a","b"]
 * Output: 0
 * Explanation: D = {}
 * Example 3:
 * <p>
 * Input: ["zyx","wvu","tsr"]
 * Output: 3
 * Explanation: D = {0, 1, 2}
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= A.length <= 100
 * 1 <= A[i].length <= 1000
 */
public class DeleteColumnsToMakeSorted {

    private static final Logger LOGGER = LoggerFactory.getLogger(DeleteColumnsToMakeSorted.class);

    public int minDeletionSize(String[] A) {

        int len = A.length;

        if (len == 1) return 0;

        int strLen = A[0].length();

        List<Integer> D = new ArrayList<>();

        int dSize = 0;

        for (int i = 0; i < strLen; i++) {

            // chatAt(i) 会比 toCharArray()[i] 快很多
            char baseChar = A[0].charAt(i);

            for (int j = 1; j < len; j++) {
                if (baseChar > A[j].charAt(i)) {
                    if (LOGGER.isDebugEnabled()) {
                        D.add(i);
                    }
                    dSize++;
                    break;
                }
                baseChar = A[j].charAt(i);
            }
        }

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("A is {}, and D is {}", A, D);
        }

        return dSize;
    }
}
