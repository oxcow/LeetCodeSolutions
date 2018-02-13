package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wli on 2018-02-12.
 */
public class ReverseStringIITest {
    @Test
    public void reverseStr() throws Exception {
        ReverseStringII stringII = new ReverseStringII();
        Assert.assertEquals("bacdfeg", stringII.reverseStr("abcdefg", 2));
        Assert.assertEquals("cbadeflg", stringII.reverseStr("abcdefgl", 3));
        Assert.assertEquals("cbadefg", stringII.reverseStr("abcdefg", 3));
        Assert.assertEquals("dcbaefg", stringII.reverseStr("abcdefg", 4));

        Assert.assertEquals("gfedcba", stringII.reverseStr("abcdefg", 7));
        Assert.assertEquals("gfedcba", stringII.reverseStr("abcdefg", 8));


        Assert.assertEquals("fdcqkmxwholhytmhafpesaentdvxginrjlyqzyhehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqllgsqddebemjanqcqnfkjmi"
                , stringII.reverseStr("hyzqyljrnigxvdtneasepfahmtyhlohwxmkqcdfehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqlimjkfnqcqnajmebeddqsgl"
                        , 39));

    }


}