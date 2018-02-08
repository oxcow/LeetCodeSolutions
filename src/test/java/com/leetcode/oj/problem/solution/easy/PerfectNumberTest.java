package com.leetcode.oj.problem.solution.easy;

import com.google.common.base.Joiner;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;

/**
 * Created by wli on 2018-02-08.
 */
public class PerfectNumberTest {
    int[] perfectNums = new int[]{1, 6, 28, 496, 8128};

    @Rule
    public final ExpectedException expectedException = ExpectedException.none();

    @Test(expected = IllegalArgumentException.class)
    public void illegalArgumentException() {
        PerfectNumber pn = new PerfectNumber();
        pn.checkPerfectNumber(100_000_001);
    }

    @Test
    public void illegalArgumentException1() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("The input number n will not exceed 100,000,000");
        PerfectNumber pn = new PerfectNumber();
        pn.checkPerfectNumber(0);
    }

    @Test
    public void checkPerfectNumber() throws Exception {
        PerfectNumber pn = new PerfectNumber();
        Arrays.stream(perfectNums).forEach(num -> {
            Assert.assertTrue(pn.checkPerfectNumber(num));
        });
        for (int i = 30; i < 50; i++) {
            Assert.assertFalse(pn.checkPerfectNumber(i));
        }
        Assert.assertFalse(pn.checkPerfectNumber(99999993));
    }

    public static final Joiner JOINER_PLUS = Joiner.on(" + ").skipNulls();

    @Test
    public void getAllPositiveDivisorExceptSelf() {
        PerfectNumber pn = new PerfectNumber();
        Arrays.stream(perfectNums).forEach(num -> {
            System.out.println(num + " = " + JOINER_PLUS.join(pn.getAllPositiveDivisorExceptSelf(num)));
        });
        System.out.println(pn.getAllPositiveDivisorExceptSelf(99999993));
    }
}