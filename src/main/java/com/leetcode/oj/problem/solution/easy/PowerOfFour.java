package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://leetcode.com/problems/power-of-four/description/">Power of Four</a>
 * <p>
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.
 * <p>
 * Example:
 * Given num = 16, return true. Given num = 5, return false.
 * <p>
 * Follow up: Could you solve it without loops/recursion?
 * <p>
 * Created by wli on 2017-08-31.
 */
public class PowerOfFour {

    public boolean isPowerOfFour(int num) {
        if (num == 0) return false;
        while (num % 4 == 0) {
            num /= 4;
        }
        return num == 1;
    }

    public boolean isPowerOfFourNoLoop(int num) {
        if (num == 0) return false;
        // 2^(2*n)
        // 2的n次幂的数，符合 num & num-1 = 0,所以先判断是否是2的次幂
        if ((num & (num - 1)) != 0) return false;
        // 4的n次幂的数，二进制最高位是1，并且后面跟偶数个0，所以只要判断二进制1的位置是否在奇数位即可
        // num & 0x55555555 !=0 或者 num & 0xAAAAAAAA == 0
        // [32bit] 0x55555555 -> 01010101010101010101010101010101
        // [32bit] 0xAAAAAAAA -> 10101010101010101010101010101010
        return (num & 0xAAAAAAAA) == 0;
    }
}
