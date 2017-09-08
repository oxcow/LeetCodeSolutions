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

        int maxInc = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != maxIdx) {
                maxInc = Math.max(max - nums[i], maxInc);
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
        int loop = 0;
        while (true) {
            loop++;
            int move = move(nums);
            if (move == 0) {
                break;
            } else {
                minMove += move;
            }
        }
        System.out.println("final loop: " + loop);
        return minMove;
    }

    /**
     * Step-1. 找出数组中最大的元素max及其位置maxIdx
     * Step-2. 除maxIdx位置外的所有元素与max求差，结果保存为新的数组A[len-1]
     * Step-3. 如果 A 中所有元素相同，则最小移动数为　A[0] * A.length;
     * Step-4. 如果 A 中所有元素不同，则当前移动数为　Max(A), 然后继续调用 Step-4
     */

    public int[] newArray(int max, int maxIdx, int... nums) {
        int newArray[] = new int[nums.length - 1];
        int ni = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != maxIdx) {
                newArray[ni++] = max - nums[i];
            }
        }
        return newArray;
    }

    public int[] getInfo(int... nums) {
        int[] info = new int[]{1, nums[0], 0}; // 0: isAllSame 1: max 2: maxIdx
        for (int i = 1; i < nums.length; i++) {
            if (info[1] < nums[i]) {
                info[1] = nums[i];
                info[2] = i;
            }
            if (info[1] != nums[i] && info[0] == 1) {
                info[0] = 0;
            }
        }
        return info;
    }

    public static void main(String[] args) {
        MinimumMovesToEqualArrayElements f = new MinimumMovesToEqualArrayElements();
        int info[] = f.getInfo(new int[]{8, 1, 1, 1});
        IntStream.of(info).forEach(System.out::println);
    }
}
