package com.leetcode.oj.problem.solution.medium;

/**
 * URL: <a href="https://leetcode.com/problems/integer-replacement/description/">Integer Replacement</a>
 * <p>
 * Given a positive integer n and you can do operations as follow:
 * <p>
 * If n is even, replace n with n/2.
 * If n is odd, you can replace n with either n + 1 or n - 1.
 * What is the minimum number of replacements needed for n to become 1?
 * <p>
 * Example 1:
 * <p>
 * Input:
 * 8
 * <p>
 * Output:
 * 3
 * <p>
 * Explanation:
 * 8 -> 4 -> 2 -> 1
 * Example 2:
 * <p>
 * Input:
 * 7
 * <p>
 * Output:
 * 4
 * <p>
 * Explanation:
 * 7 -> 8 -> 4 -> 2 -> 1
 * or
 * 7 -> 6 -> 3 -> 2 -> 1
 */
public class IntegerReplacement {

    public int integerReplacement(int nm) {
        int step = 0;
        Long n = Long.valueOf(nm);
        while (n != 1) {
            if (n % 2 == 0) {
                step++;
                n = n / 2;
                //System.out.println("step: " + step + " n is " + n);
                continue;
            }

            long plusOne = n + 1;
            long reduceOne = n - 1;

            long plusOneHalf = plusOne / 2;
            long reduceOneHalf = reduceOne / 2;

            if (plusOneHalf == 1 || reduceOneHalf == 1) {
                step++;
                //System.out.println("step: " + step + " n-1 is " + reduceOne);
                step++;
                //System.out.println("step: " + step + " n is " + reduceOneHalf);
                break;
            }

            if (plusOneHalf % 2 == 0 && 0 == reduceOneHalf % 2
                    || reduceOneHalf % 2 == 0) {
                step++;
                //System.out.println("step: " + step + " n-1 is " + reduceOne);
                step++;
                //System.out.println("step: " + step + " n is " + reduceOneHalf);
                n = reduceOneHalf;
                continue;
            }


            step++;
            //System.out.println("step: " + step + " n+1 is " + plusOne);
            step++;
            //System.out.println("step: " + step + " n is " + plusOneHalf);
            n = plusOneHalf;
        }
        return step;
    }
}
