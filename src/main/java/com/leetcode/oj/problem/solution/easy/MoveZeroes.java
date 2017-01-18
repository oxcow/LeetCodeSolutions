package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://leetcode.com/problems/move-zeroes/">Move Zeroes</a>
 * <p/>
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * <p/>
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 * <p/>
 * Note:
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 * Credits:
 * <p/>
 * Created by leeyee.li on 2017/1/18.
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        moveZerosOptimal(nums);
    }

    /**
     * 时间复杂度O(N)、空间复杂度O(1)
     * <p/>
     * 数组操作元素最优，等于 0 的个数
     * <p/>
     * 最坏情况下还是所有0元素都在最前端
     *
     * @param nums
     */
    public void moveZerosOptimal(int[] nums) {
        for (int lastNonZeroFoundAt = 0, cur = 0; cur < nums.length; cur++) {
            if (nums[cur] != 0) {
                int current = nums[cur];
                nums[cur] = nums[lastNonZeroFoundAt];
                nums[lastNonZeroFoundAt++] = current;
            }
        }
    }

    /**
     * 比起常规方式减少了外循环次数：时间复杂度O(N*N)、空间复杂度O(2)
     * <p/>
     * 外循环次数等于数组中0的个数
     * 内循环次数为数组长度-当前0所在位置-外循环次数
     * <p/>
     * 最坏情况下，所有的0都在数组前面，此时需要进行 n*n
     * <p/>
     * 因此对于大数组需要考虑在进行移动前先将数组元素做随机排序处理
     *
     * @param nums
     */
    public void moveZerosNormal_1(int[] nums) {
        int iLen = nums.length;
        if (iLen < 2) return;
        while (iLen-- > 0) {
            boolean haveMove = false;
            for (int i = 0; i < iLen; i++) { // 冒泡
                int current = nums[i];
                if (current == 0) {
                    int next = nums[i + 1];
                    if (current == 0) {
                        nums[i] = next;
                        nums[i + 1] = current;
                    }
                }
            }
            if (!haveMove) break;
        }
    }

    /**
     * 常规方式。
     * 外循环次数等于数组长度
     * 内循环次数为数组长度-当前0所在位置-外循环次数
     *
     * @param nums
     */
    public void moveZeroesNormal(int[] nums) {
        int iLen = nums.length;
        if (iLen < 2) return;
        while (iLen-- > 0) {
            for (int i = 0; i < iLen; i++) {  // 冒泡
                int current = nums[i];
                if (current == 0) {
                    int next = nums[i + 1];
                    nums[i] = next;
                    nums[i + 1] = current;
                }
            }
        }
    }
}
