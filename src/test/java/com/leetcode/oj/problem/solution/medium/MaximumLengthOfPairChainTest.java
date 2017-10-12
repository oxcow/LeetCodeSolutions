package com.leetcode.oj.problem.solution.medium;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by wli on 2017-10-10.
 */
public class MaximumLengthOfPairChainTest {
    @Test
    public void findLongestChain() throws Exception {
        MaximumLengthOfPairChain chain = new MaximumLengthOfPairChain();

        Assert.assertEquals(1, chain.findLongestChain(new int[][]{{-4, 5}, {-8, 2}, {-8, 9}, {-4, 2}, {-5, 2}, {-4, 2}}));
        Assert.assertEquals(3, chain.findLongestChain(new int[][]{{3, 9}, {-4, 6}, {-8, 7}, {-10, 3}, {-7, -6}, {-1, 5}, {-10, 10}, {-7, 4}, {1, 4}, {9, 10}}));
        Assert.assertEquals(2, chain.findLongestChain(new int[][]{{-10, -1}, {1, 9}, {4, 8}, {2, 6}, {-4, 0}, {-4, 0}, {-6, 6}, {-5, 10}, {3, 4}}));
        Assert.assertEquals(4, chain.findLongestChain(new int[][]{{-10, -8}, {8, 9}, {-5, 0}, {6, 10}, {-6, -4}, {1, 7}, {9, 10}, {-4, 7}}));
        Assert.assertEquals(3, chain.findLongestChain(new int[][]{{-6, 9}, {1, 6}, {8, 10}, {-1, 4}, {-6, -2}, {-9, 8}, {-5, 3}, {0, 3}}));
        Assert.assertEquals(2, chain.findLongestChain(new int[][]{{1, 2}, {2, 3}, {3, 4}}));
        Assert.assertEquals(3, chain.findLongestChain(new int[][]{{1, 5}, {1, 2}, {5, 6}, {3, 4}}));
    }

}