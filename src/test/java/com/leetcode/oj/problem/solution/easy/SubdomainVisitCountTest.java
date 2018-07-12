package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SubdomainVisitCountTest {

    @Test
    public void subdomainVisits() {
        SubdomainVisitCount count = new SubdomainVisitCount();

        String[] cpdomains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};

        List<String> result = count.subdomainVisits(cpdomains);

        Assert.assertEquals(7, result.size());
        Assert.assertTrue(result.contains("951 com"));
        Assert.assertTrue(result.contains("900 google.mail.com"));
        Assert.assertTrue(result.contains("1 intel.mail.com"));
        Assert.assertTrue(result.contains("5 org"));
        Assert.assertTrue(result.contains("5 wiki.org"));
        Assert.assertTrue(result.contains("901 mail.com"));
        Assert.assertTrue(result.contains("50 yahoo.com"));


        cpdomains = new String [] {"9001 discuss.leetcode.com"};

        result = count.subdomainVisits(cpdomains);
        Assert.assertEquals(3, result.size());
        Assert.assertTrue(result.contains("9001 discuss.leetcode.com"));
        Assert.assertTrue(result.contains("9001 leetcode.com"));
        Assert.assertTrue(result.contains("9001 com"));

    }
}