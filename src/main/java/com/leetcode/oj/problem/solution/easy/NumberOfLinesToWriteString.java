package com.leetcode.oj.problem.solution.easy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * URL: <a href="https://leetcode.com/problems/number-of-lines-to-write-string/description/">Number of Lines To Write String</a>
 * <p>
 * We are to write the letters of a given string S, from left to right into lines. Each line has maximum width 100 units, and if writing a letter would cause the width of the line to exceed 100 units, it is written on the next line. We are given an array widths, an array where widths[0] is the width of 'a', widths[1] is the width of 'b', ..., and widths[25] is the width of 'z'.
 * <p>
 * Now answer two questions: how many lines have at least one character from S, and what is the width used by the last such line? Return your answer as an integer list of length 2.
 * <p>
 * <p>
 * <p>
 * Example :
 * Input:
 * widths = [10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10]
 * S = "abcdefghijklmnopqrstuvwxyz"
 * Output: [3, 60]
 * Explanation:
 * All letters have the same length of 10. To write all 26 letters,
 * we need two full lines and one line with 60 units.
 * Example :
 * Input:
 * widths = [4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10]
 * S = "bbbcccdddaaa"
 * Output: [2, 4]
 * Explanation:
 * All letters except 'a' have the same length of 10, and
 * "bbbcccdddaa" will cover 9 * 10 + 2 * 4 = 98 units.
 * For the last 'a', it is written on the second line because
 * there is only 2 units left in the first line.
 * So the answer is 2 lines, plus 4 units in the second line.
 * <p>
 * <p>
 * Note:
 * <p>
 * The length of S will be in the range [1, 1000].
 * S will only contain lowercase letters.
 * widths is an array of length 26.
 * widths[i] will be in the range of [2, 10].
 */
public class NumberOfLinesToWriteString {

    private static final Logger logger = LoggerFactory.getLogger(NumberOfLinesToWriteString.class);

    private static final int MAX_UNIT = 100;

    public int[] numberOfLines(int[] widths, String s) {

        int lines = 0, units = 0;

        for (char c : s.toCharArray()) {
            int width = widths[c - 97];
            if (units + width >= MAX_UNIT) {
                ++lines;
                logger.debug("{} units in the line {}", units + width == MAX_UNIT ? MAX_UNIT : units, lines);
                units = units + width == MAX_UNIT ? 0 : width;
            } else {
                units += width;
                logger.debug("{}:{}, ", c, width);
            }
        }

        if (units != 0) ++lines;

        logger.debug("{} units in the line {}", units, lines);
        logger.debug("{} lines, plus {} units in the {} line", lines, units, lines);

        return new int[]{lines, units};
    }
}
