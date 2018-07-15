package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryNumberWithAlternatingBitsTest {

    @Test
    public void hasAlternatingBits() {

        BinaryNumberWithAlternatingBits bits = new BinaryNumberWithAlternatingBits();

        Assert.assertTrue(bits.hasAlternatingBits(1));
        Assert.assertFalse(bits.hasAlternatingBits(3));
        Assert.assertTrue(bits.hasAlternatingBits(5));
        Assert.assertFalse(bits.hasAlternatingBits(9));
        Assert.assertTrue(bits.hasAlternatingBits(10));
        Assert.assertFalse(bits.hasAlternatingBits(12));
        Assert.assertFalse(bits.hasAlternatingBits(27));

    }

    @Test
    public void hasAlternatingBitsByTwoWayLoop() {

        BinaryNumberWithAlternatingBits bits = new BinaryNumberWithAlternatingBits();

        Assert.assertTrue(bits.hasAlternatingBitsByTwoWayLoop(1));
        Assert.assertFalse(bits.hasAlternatingBitsByTwoWayLoop(3));
        Assert.assertTrue(bits.hasAlternatingBitsByTwoWayLoop(5));
        Assert.assertFalse(bits.hasAlternatingBitsByTwoWayLoop(9));
        Assert.assertTrue(bits.hasAlternatingBitsByTwoWayLoop(10));
        Assert.assertFalse(bits.hasAlternatingBitsByTwoWayLoop(12));
        Assert.assertFalse(bits.hasAlternatingBitsByTwoWayLoop(27));

    }

    @Test
    public void loopTest() {
        BinaryNumberWithAlternatingBits bits = new BinaryNumberWithAlternatingBits();

        // 1010101010101010101010101010101
        Assert.assertTrue(bits.hasAlternatingBits(1431655765));
        // 1010101010101011101010101010101
        Assert.assertFalse(bits.hasAlternatingBits(1431688533));
        // 1010101010101010101010101010100
        Assert.assertFalse(bits.hasAlternatingBits(1431655764));

        // 1010101010101010101010101010101
        Assert.assertTrue(bits.hasAlternatingBitsByTwoWayLoop(1431655765));
        // 1010101010101011101010101010101
        Assert.assertFalse(bits.hasAlternatingBitsByTwoWayLoop(1431688533));
        // 1010101010101010101010101010100
        Assert.assertFalse(bits.hasAlternatingBitsByTwoWayLoop(1431655764));
    }
}