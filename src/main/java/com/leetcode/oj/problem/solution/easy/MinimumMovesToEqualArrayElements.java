package com.leetcode.oj.problem.solution.easy;

import java.util.stream.IntStream;

public class MinimumMovesToEqualArrayElements {
    private int move(int... nums) {
        int max = nums[0];
        int maxIdx = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIdx = i;
            }
        }
        // TODO: 不需要对数组元素作出改变就可算出最小移动次数。最大元素与其他元素的差组成新的数组，然后继续计算与最大值的差，最大值和就是最小移动次数
        int maxInc = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != maxIdx) {
                maxInc = Math.max(max - nums[i],maxInc);
            }
        }

        System.out.println(String.format("Max: %d, maxInc: %d", max, maxInc));
        if (maxInc != 0) {
            for (int i = 0; i < nums.length; i++) {
                if (i != maxIdx) {
                    nums[i] += maxInc;
                }
            }
        }
        System.out.print("[");
        IntStream.of(nums).forEach(i -> {
            System.out.print(i + ",");
        });
        System.out.print("]\n");
        return maxInc;
    }

    public int minMoves(int[] nums) {
        if (nums == null || nums.length <= 1) return 0;
        if (nums.length == 2) return Math.abs(nums[0] - nums[1]);

        int minMove = 0;
        int loop =0;
        while (true) {
            loop++;
            int move = move(nums);
            if (move == 0) {
                break;
            } else {
                minMove += move;
            }
        }
        System.out.println("final loop: "+loop);
        return minMove;
    }
}
