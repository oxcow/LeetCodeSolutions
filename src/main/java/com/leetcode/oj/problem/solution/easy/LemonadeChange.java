package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://leetcode.com/problems/lemonade-change/description/">Lemonade Change</a>
 * <p>
 * At a lemonade stand, each lemonade costs $5.
 * <p>
 * Customers are standing in a queue to buy from you, and order one at a time (in the order specified by bills).
 * <p>
 * Each customer will only buy one lemonade and pay with either a $5, $10, or $20 bill.  You must provide the correct change to each customer, so that the net transaction is that the customer pays $5.
 * <p>
 * Note that you don't have any change in hand at first.
 * <p>
 * Return true if and only if you can provide every customer with correct change.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: [5,5,5,10,20]
 * Output: true
 * Explanation:
 * From the first 3 customers, we collect three $5 bills in order.
 * From the fourth customer, we collect a $10 bill and give back a $5.
 * From the fifth customer, we give a $10 bill and a $5 bill.
 * Since all customers got correct change, we output true.
 * Example 2:
 * <p>
 * Input: [5,5,10]
 * Output: true
 * Example 3:
 * <p>
 * Input: [10,10]
 * Output: false
 * Example 4:
 * <p>
 * Input: [5,5,10,10,20]
 * Output: false
 * Explanation:
 * From the first two customers in order, we collect two $5 bills.
 * For the next two customers in order, we collect a $10 bill and give back a $5 bill.
 * For the last customer, we can't give change of $15 back because we only have two $10 bills.
 * Since not every customer received correct change, the answer is false.
 * <p>
 * <p>
 * Note:
 * <p>
 * 0 <= bills.length <= 10000
 * bills[i] will be either 5, 10, or 20.
 */
public class LemonadeChange {

    public boolean lemonadeChange(int[] bills) {

        int bill5 = 0, bill10 = 0;

        for (int bill : bills) {

            switch (bill) {
                case 5:
                    ++bill5;
                    break;
                case 10:
                    if (bill5 == 0) return false;
                    if (bill5 > 0) {
                        --bill5;
                        ++bill10;
                    }
                    break;
                case 20:
                    if (bill5 > 0 && bill10 > 0) {
                        --bill5;
                        --bill10;
                    } else if (bill5 > 3) {
                        bill5 -= 3;
                    } else {
                        return false;
                    }
                    break;
            }
        }

        return true;
    }
}
