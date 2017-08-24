package com.leetcode.oj.problem.solution.easy;


import org.junit.Assert;
import org.junit.Test;


/**
 * Created by wli on 2017-08-23.
 */
public class MinimumIndexSumOfTwoListsTest {
    @Test
    public void findRestaurant() throws Exception {
        MinimumIndexSumOfTwoLists minIdx = new MinimumIndexSumOfTwoLists();

        Assert.assertArrayEquals(new String[]{"Shogun"}
                , minIdx.findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"}
                        , new String[]{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"}));

        Assert.assertArrayEquals(new String[]{"Shogun"}
                , minIdx.findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"}
                        , new String[]{"KFC", "Shogun", "Burger King"}));
    }

}