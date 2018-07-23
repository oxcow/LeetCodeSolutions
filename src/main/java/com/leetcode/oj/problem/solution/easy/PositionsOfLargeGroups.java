package com.leetcode.oj.problem.solution.easy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * URL: <a href="https://leetcode.com/problems/positions-of-large-groups/description/">Positions of Large Groups</a>
 * <p>
 * In a string S of lowercase letters, these letters form consecutive groups of the same character.
 * <p>
 * For example, a string like S = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z" and "yy".
 * <p>
 * Call a group large if it has 3 or more characters.  We would like the starting and ending positions of every large group.
 * <p>
 * The final answer should be in lexicographic order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: "abbxxxxzzy"
 * Output: [[3,6]]
 * Explanation: "xxxx" is the single large group with starting  3 and ending positions 6.
 * Example 2:
 * <p>
 * Input: "abc"
 * Output: []
 * Explanation: We have "a","b" and "c" but no large group.
 * Example 3:
 * <p>
 * Input: "abcdddeeeeaabbbcd"
 * Output: [[3,5],[6,9],[12,14]]
 * <p>
 * <p>
 * Note:  1 <= S.length <= 1000
 */
public class PositionsOfLargeGroups {

    private static final Logger LOGGER = LoggerFactory.getLogger(PositionsOfLargeGroups.class);

    public List<List<Integer>> largeGroupPositions(String S) {

        List<List<Integer>> largeGroups = new ArrayList<>();

        if (S.length() < 3) return largeGroups;

        char sChar[] = (S + " ").toCharArray(), groupChar = sChar[0];

        int startIndex = 0, endIndex = 0;

        for (int i = 1; i < sChar.length; i++) {
            if (groupChar != sChar[i]) {
                if (endIndex - startIndex > 1) {
                    List<Integer> positions = new ArrayList<>();
                    positions.add(startIndex);
                    positions.add(endIndex);
                    largeGroups.add(positions);
                    if (LOGGER.isDebugEnabled()) {
                        StringBuilder subStr = new StringBuilder();
                        for (int l = 0; l <= endIndex - startIndex; l++) {
                            subStr.append(groupChar);
                        }
                        LOGGER.debug("Input: {}, {} is the single large group from {} to {}"
                                , S, subStr.toString(), startIndex, endIndex);
                    }
                }
                startIndex = i;
                groupChar = sChar[i];
            }
            endIndex = i;
        }

        return largeGroups;
    }
}
