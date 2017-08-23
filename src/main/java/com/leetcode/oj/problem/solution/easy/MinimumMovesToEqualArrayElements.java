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
        Integer secMax = null;
        for (int i = 0; i < nums.length; i++) {
            if (i != maxIdx && nums[i] != max) {
                if (secMax == null || nums[i] > secMax) {
                    secMax = nums[i];
                }
            }
        }

        int minMove = secMax == null ? 0 : max - secMax;
        System.out.println(String.format("Max: %d, secMax: %d, move: %d", max, secMax, minMove));
        if (minMove != 0) {
            for (int i = 0; i < nums.length; i++) {
                if (i != maxIdx) {
                    nums[i] += minMove;
                }
            }
        }
        System.out.print("[");
        IntStream.of(nums).forEach(i -> {
            System.out.print(i + ",");
        });
        System.out.print("]\n");
        return minMove;
    }

    public int minMoves(int[] nums) {
        if (nums == null || nums.length <= 1) return 0;
        if (nums.length == 2) return Math.abs(nums[0] - nums[1]);

        int minMove = 0;
        while (true) {
            int move = move(nums);
            if (move == 0) {
                break;
            } else {
                minMove += move;
            }
        }
        return minMove;
    }
}
