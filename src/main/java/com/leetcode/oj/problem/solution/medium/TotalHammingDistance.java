package com.leetcode.oj.problem.solution.medium;

import com.google.common.base.Stopwatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * URL: <a href="https://leetcode.com/problems/total-hamming-distance/">Total Hamming Distance</a>
 * <p/>
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * <p/>
 * Now your job is to find the total Hamming distance between all pairs of the given numbers.
 * <p/>
 * Example:
 * Input: 4, 14, 2
 * <p/>
 * Output: 6
 * <p/>
 * Explanation: In binary representation, the 4 is 0100, 14 is 1110, and 2 is 0010 (just
 * showing the four bits relevant in this case). So the answer will be:
 * HammingDistance(4, 14) + HammingDistance(4, 2) + HammingDistance(14, 2) = 2 + 2 + 2 = 6.
 * Note:
 * Elements of the given array are in the range of 0 to 10^9
 * Length of the array will not exceed 10^4.
 * Created by leeyee on 16-12-25.
 *
 * @see com.leetcode.oj.problem.solution.easy.HammingDistance
 */
public class TotalHammingDistance {
    private static final Logger logger = LoggerFactory.getLogger(TotalHammingDistance.class);

    public int totalHammingDistance(int[] nums) {
        int iLen = nums.length;
        int total = 0;
        for (int i = 0; i < iLen - 1; i++) {
            int x = nums[i];
            for (int j = i + 1; j < iLen; j++) {
                int y = nums[j];
                total += Integer.bitCount(x ^ y);
            }
        }
        return total;
    }

    public int totalHammingDistance2(int[] nums) {
        Stopwatch stopwatch = Stopwatch.createStarted();
        int iLen = nums.length;

        int iGroupLen = iLen * (iLen - 1) / 2; // 两两组合后的个数。Cn2 = n*(n-1)/2*(2-1)
        int[] groups = new int[iGroupLen];

        int total = 0, iGroup = 0;
        for (int i = 0; i < iLen - 1; i++) {
            int x = nums[i];
            for (int j = i + 1; j < iLen; j++) {
                int y = nums[j];
                groups[iGroup++] = x ^ y;
            }
        }

        logger.debug("x xor y spend: {}ms", stopwatch.elapsed(TimeUnit.MILLISECONDS));

        for (int i = 0; i < groups.length; i++) {
            total += Integer.bitCount(groups[i]);
        }

        logger.debug("total spend: {}ms", stopwatch.elapsed(TimeUnit.MILLISECONDS));

        return total;
    }

}
