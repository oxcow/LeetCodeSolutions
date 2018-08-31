package com.leetcode.oj.problem.solution.hard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * URL: <a href="https://leetcode.com/problems/longest-consecutive-sequence/description/">Longest Consecutive Sequence</a>
 * <p>
 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
 * <p>
 * For example,
 * Given [100, 4, 200, 1, 3, 2],
 * The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.
 * <p>
 * Your algorithm should run in O(n) complexity.
 * <p>
 * Created by wli on 2017-08-22.
 */
public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        if (nums == null) return 0;
        if (nums.length <= 1) return nums.length;

        int maxConsecutiveLen = 0;
        Arrays.sort(nums);

        int base = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == base) continue;
            if (nums[i] - base == 1) {
                ++count;
            } else {
                maxConsecutiveLen = Math.max(maxConsecutiveLen, count);
                count = 1;
            }
            base = nums[i];
        }
        return Math.max(maxConsecutiveLen, count);
    }

    // 0(N)
    public int longestConsecutiveNotSort(int... nums) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (!map.containsKey(n)) {
                int left = (map.containsKey(n - 1)) ? map.get(n - 1) : 0;
                int right = (map.containsKey(n + 1)) ? map.get(n + 1) : 0;
                // sum: length of the sequence n is in
                int sum = left + right + 1;
                map.put(n, sum);
                // keep track of the max length
                res = Math.max(res, sum);
                // extend the length to the boundary(s)
                // of the sequence
                // will do nothing if n has no neighbors
                map.put(n - left, sum);
                map.put(n + right, sum);
            } else {
                // duplicates
                continue;
            }
        }
        return res;
    }

    /**
     * 利用数组下标改造使用Map的longestConsecutiveNotSort方法。
     * 理论上要比使用Map快，不过如果数组中存在太大的数，那么内存空间将不够用。
     * 因此这种方法算是一种“残废算法”。
     */
    public int restrictedMethod(int... nums) {
        if (nums == null) return 0;

        int max = nums[0]; // WARNING: Too big will throws exception
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }

        int longest = 0;
        int[] positive = new int[max + 2]; // gt 0
        int[] negative = new int[max + 2]; // le 0

        for (int n : nums) {
            // double check
            if (n < 0 && negative[-n] != 0
                    || n > 0 && positive[n] != 0) {
                continue;
            }

            int pre, next;
            if (n < 0) {
                pre = negative[-(n - 1)];
                next = n + 1 < 0 ? negative[-(n + 1)] : positive[-(n + 1)];
            } else {
                pre = n - 1 > 0 ? positive[n - 1] : negative[-(n - 1)];
                next = positive[n + 1];
            }

            int sum = pre + next + 1;

            if (n < 0) {
                negative[-n] = sum;
                negative[-(n - pre)] = sum;
                if (n + next < 0) {
                    negative[-(n + next)] = sum;
                } else {
                    positive[n + next] = sum;
                }
            } else {
                positive[n] = sum;
                positive[n + next] = sum;
                if (n - pre < 0) {
                    negative[-(n - pre)] = sum;
                } else {
                    positive[n - pre] = sum;
                }
            }

            longest = Math.max(longest, sum);
        }
        return longest;
    }
}
