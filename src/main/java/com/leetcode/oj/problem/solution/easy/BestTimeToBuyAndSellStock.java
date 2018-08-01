package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="Best Time to Buy and Sell Stock">Best Time to Buy and Sell Stock</a>
 * <p>
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * <p>
 * If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 * <p>
 * Note that you cannot sell a stock before you buy one.
 * <p>
 * Example 1:
 * <p>
 * Input: [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Not 7-1 = 6, as selling price needs to be larger than buying price.
 * Example 2:
 * <p>
 * Input: [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
 */
public class BestTimeToBuyAndSellStock {

    // O(n*n)
    public int maxProfit(int[] prices) {

        int days = prices.length;

        int maxProfit = 0;

        for (int i = 0; i < days - 1; i++) {
            for (int j = i + 1; j < days; j++) {
                if (prices[i] > prices[j]) {
                    continue;
                }
                maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
            }
        }

        return maxProfit;
    }

    // O(n)
    public int maxProfit1(int[] prices) {

        if (prices.length < 2) return 0;

        int maxProfit = 0, minBuyPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (minBuyPrice > prices[i]) {
                minBuyPrice = prices[i];
                continue;
            }
            maxProfit = Math.max(maxProfit, prices[i] - minBuyPrice);
        }

        return maxProfit;
    }
}
