package com.leetcode.oj.problem.solution.medium;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * URL: <a href="https://leetcode.com/problems/maximum-length-of-pair-chain/description/">Maximum Length of Pair Chain</a>
 * <p>
 * You are given n pairs of numbers. In every pair, the first number is always smaller than the second number.
 * <p>
 * Now, we define a pair (c, d) can follow another pair (a, b) if and only if b < c. Chain of pairs can be formed in this fashion.
 * <p>
 * Given a set of pairs, find the length longest chain which can be formed. You needn't use up all the given pairs. You can select pairs in any order.
 * <p>
 * Example 1:
 * Input: [[1,2], [2,3], [3,4]]
 * Output: 2
 * Explanation: The longest chain is [1,2] -> [3,4]
 * Note:
 * The number of given pairs will be in the range [1, 1000].
 * <p>
 * Created by wli on 2017-10-10.
 */
public class MaximumLengthOfPairChain {
    private static final Logger logger = LoggerFactory.getLogger(MaximumLengthOfPairChain.class);

    /**
     * 1. remove pair that the range is big. eg. if a belong to b (a ∈ b) then mark b as null
     * 2. sorted pair.
     * 3. count
     *
     * @param pairs
     * @return
     */
    public int findLongestChain(int[][] pairs) {

        // mark pair that the range is big.
        int iLen = pairs.length;
        for (int i = 0; i < iLen; i++) {
            int[] refer = pairs[i];
            if (refer == null) continue;
            for (int j = i + 1; j < iLen; j++) {
                int[] pair = pairs[j];
                if (pair == null) continue;
                if (pair[0] >= refer[0] && pair[1] <= refer[1]) {
                    pairs[i] = null;
                    break;
                } else if (pair[0] <= refer[0] && pair[1] >= refer[1]) {
                    pairs[j] = null;
                }
            }
        }

        // filter and sorted
        List<int[]> pairList = Arrays.stream(pairs).filter(pair -> {
            return pair != null;
        }).sorted((int[] a, int[] b) -> {
            return a[0] == b[0] ? a[1] - b[1] : a[0] - b[0];
        }).collect(Collectors.toList());

        out(pairList);

        // count
        int count = 1;
        int[] refer = pairList.get(0);
        for (int i = 1; i < pairList.size(); i++) {
            int[] pair = pairList.get(i);
            if (pair[0] > refer[1]) {
                count++;
                refer = pair;
            }
        }
         logger.debug("Count: {}", count);
        return count;
    }

    private void out(List<int[]> pairList) {
        StringBuilder sb = new StringBuilder();
        pairList.stream().forEach((int a[]) -> {
            sb.append(String.format("[%d,%d]", a[0], a[1]));
        });
         logger.debug("{}", sb.toString());
    }

}