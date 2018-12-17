package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

public class UniqueEmailAddressesTest {

    @Test
    public void numUniqueEmails() {
        UniqueEmailAddresses addresses = new UniqueEmailAddresses();

        Assert.assertEquals(2, addresses.numUniqueEmails(
                new String[]{"test.email+alex@leetcode.com",
                        "test.e.mail+bob.cathy@leetcode.com",
                        "testemail+david@lee.tcode.com"}));
    }
}