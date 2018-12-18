package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://leetcode.com/problems/di-string-match/">DI String Match</a>
 * <p>
 * Given a string S that only contains "I" (increase) or "D" (decrease), let N = S.length.
 * <p>
 * Return any permutation A of [0, 1, ..., N] such that for all i = 0, ..., N-1:
 * <p>
 * If S[i] == "I", then A[i] < A[i+1]
 * If S[i] == "D", then A[i] > A[i+1]
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: "IDID"
 * Output: [0,4,1,3,2]
 * Example 2:
 * <p>
 * Input: "III"
 * Output: [0,1,2,3]
 * Example 3:
 * <p>
 * Input: "DDI"
 * Output: [3,2,0,1]
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= S.length <= 10000
 * S only contains characters "I" or "D".
 */
public class DIStringMatch {
    public int[] diStringMatch(String S) {

        int len = S.length();

        int ranges[] = new int[]{0, len};

        int result[] = new int[len + 1];

        char[] chars = S.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if ('D' == chars[i]) {
                result[i] = ranges[1];
                ranges[1] = ranges[1] - 1;
            }
            if ('I' == chars[i]) {
                result[i] = ranges[0];
                ranges[0] = ranges[0] + 1;
            }
        }

        result[len] = ranges[0];

        return result;
    }
}
