package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leeyee on 2017/9/6 23:19.
 */
public class IntersectionOfTwoArraysIITest {
    @Test
    public void intersect() throws Exception {
        IntersectionOfTwoArraysII intersection = new IntersectionOfTwoArraysII();

        Assert.assertArrayEquals(new int[]{-2147483648, 1},
                intersection.intersect(new int[]{-2147483648, 1, 2, 3}, new int[]{1, -2147483648, -2147483648}));
        Assert.assertArrayEquals(new int[]{}, intersection.intersect(new int[]{3}, new int[]{4}));
        Assert.assertArrayEquals(new int[]{2, 2}, intersection.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
        Assert.assertArrayEquals(new int[]{2, 2}, intersection.intersect(new int[]{2, 2}, new int[]{1, 2, 2, 1}));
        Assert.assertArrayEquals(new int[]{3, 4, 5}, intersection.intersect(new int[]{3, 4, 5}, new int[]{3, 4, 5}));
        Assert.assertArrayEquals(new int[]{2, 4, 5, 6, 7, 21, 22, 24, 24, 25, 26, 27, 27, 33, 37, 38, 39, 45, 47, 49, 55, 56, 57, 58, 58, 64, 65, 66, 69, 72, 73, 74, 74, 74, 75, 78, 79, 80, 80, 80, 85, 87, 88, 89, 89, 93, 93, 98},
                intersection.intersect(new int[]{21, 47, 80, 4, 3, 24, 87, 12, 22, 11, 48, 6, 89, 80, 74, 71, 74, 55, 58, 56, 4, 98, 40, 66, 49, 53, 62, 27, 3, 66, 78, 24, 48, 69, 88, 12, 80, 63, 98, 65, 46, 35, 72, 5, 64, 72, 7, 29, 37, 3, 2, 75, 44, 93, 79, 78, 13, 39, 85, 26, 15, 41, 87, 47, 29, 93, 41, 74, 6, 48, 17, 89, 27, 61, 2, 68, 99, 57, 45, 73, 25, 33, 38, 32, 58}
                        , new int[]{1, 39, 6, 81, 85, 10, 38, 22, 0, 89, 57, 93, 58, 69, 65, 80, 84, 24, 27, 54, 37, 36, 26, 88, 2, 7, 24, 36, 51, 5, 74, 57, 45, 56, 55, 67, 25, 33, 78, 49, 16, 79, 74, 80, 36, 27, 89, 49, 64, 73, 96, 60, 92, 31, 98, 72, 22, 31, 0, 93, 70, 87, 80, 66, 75, 69, 81, 52, 94, 90, 51, 90, 74, 36, 58, 38, 50, 9, 64, 55, 4, 21, 49, 60, 65, 47, 67, 8, 38, 83}));

        Assert.assertArrayEquals(new int[]{0, 4, 5, 6, 7, 34, 38, 44, 45, 57, 61, 77, 79, 85, 88, 89, 92},
                intersection.intersect(new int[]{61, 24, 20, 58, 95, 53, 17, 32, 45, 85, 70, 20, 83, 62, 35, 89, 5, 95, 12, 86, 58, 77, 30, 64, 46, 13, 5, 92, 67, 40, 20, 38, 31, 18, 89, 85, 7, 30, 67, 34, 62, 35, 47, 98, 3, 41, 53, 26, 66, 40, 54, 44, 57, 46, 70, 60, 4, 63, 82, 42, 65, 59, 17, 98, 29, 72, 1, 96, 82, 66, 98, 6, 92, 31, 43, 81, 88, 60, 10, 55, 66, 82, 0, 79, 11, 81}
                        , new int[]{5, 25, 4, 39, 57, 49, 93, 79, 7, 8, 49, 89, 2, 7, 73, 88, 45, 15, 34, 92, 84, 38, 85, 34, 16, 6, 99, 0, 2, 36, 68, 52, 73, 50, 77, 44, 61, 48}));

    }

}
