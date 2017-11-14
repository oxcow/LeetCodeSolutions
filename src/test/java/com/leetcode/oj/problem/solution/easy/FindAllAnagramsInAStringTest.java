package com.leetcode.oj.problem.solution.easy;

import com.google.common.collect.Lists;
import com.leetcode.oj.problem.solution.common.BigDataReader;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by wli on 2017-11-14.
 */
public class FindAllAnagramsInAStringTest {

    String filePath = "D:\\WorkSpace\\myWorkspace\\LeetCodeSolutions\\src\\test\\java\\com\\leetcode\\oj\\problem\\solution\\easy\\";

    List<String> bigData = null;

    @Before
    public void init() throws Exception {
        filePath += "FindAllAnagramsInAString.txt";
        bigData = BigDataReader.readAllLines(filePath);
    }


    @Test
    public void findAnagrams() throws Exception {
        FindAllAnagramsInAString inAString = new FindAllAnagramsInAString();

        Assert.assertArrayEquals(Lists.newArrayList().toArray(), inAString.findAnagrams("ad", "add").toArray());
        Assert.assertArrayEquals(Lists.newArrayList(0).toArray(), inAString.findAnagrams("adc", "cda").toArray());

        Assert.assertArrayEquals(Lists.newArrayList(0, 6).toArray(), inAString.findAnagrams("cbaebabacd", "abc").toArray());

        Assert.assertArrayEquals(Lists.newArrayList(0, 1, 2).toArray(), inAString.findAnagrams("abab", "ab").toArray());

        List<Integer> expectList = Lists.newArrayList();
        for (int i = 0; i < 93; i++) {
            expectList.add(i);
        }
        Assert.assertArrayEquals(Lists.newArrayList(expectList).toArray()
                , inAString.findAnagrams("abababababababababababababababababababababababababababababababababababababababababababababababab", "abab").toArray());

    }

    @Test
    public void findAnagramsUseBigDate() throws Exception {
        FindAllAnagramsInAString inAString = new FindAllAnagramsInAString();
        Assert.assertArrayEquals(Lists.newArrayList(0, 10001).toArray()
                , inAString.findAnagrams(bigData.get(0), bigData.get(1)).toArray());
    }

}