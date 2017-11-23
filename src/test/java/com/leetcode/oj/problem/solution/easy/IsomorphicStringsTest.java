package com.leetcode.oj.problem.solution.easy;

import com.leetcode.oj.problem.solution.common.BigDataReader;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by wli on 2017-11-22.
 */
public class IsomorphicStringsTest {
    String filePath = "D:\\WorkSpace\\myWorkspace\\LeetCodeSolutions\\src\\test\\java\\com\\leetcode\\oj\\problem\\solution\\easy\\";

    List<String> bigData = null;

    @Before
    public void init() throws Exception {
        filePath += "IsomorphicStrings.txt";
        bigData = BigDataReader.readAllLines(filePath);
    }

    @Test
    public void isIsomorphic() throws Exception {
        IsomorphicStrings iso = new IsomorphicStrings();
        assertFalse(iso.isIsomorphic("aba", "baa"));
        assertFalse(iso.isIsomorphic("ab", "aa"));
        assertFalse(iso.isIsomorphic("ac", "b"));
        assertFalse(iso.isIsomorphic(null, "bar"));
        assertFalse(iso.isIsomorphic("", "bar"));
        assertFalse(iso.isIsomorphic("foo", "bar"));
        assertFalse(iso.isIsomorphic("bar", "foo"));
        assertTrue(iso.isIsomorphic("egg", "add"));
        assertTrue(iso.isIsomorphic("a", "b"));
        assertTrue(iso.isIsomorphic("paper", "title"));
    }

    @Test
    public void isIsomorphicUseBigData() throws Exception {
        IsomorphicStrings iso = new IsomorphicStrings();
        assertFalse(iso.isIsomorphic(bigData.get(0), bigData.get(1)));
    }

    @Test
    public void isIsomorphicByMap() throws Exception {
        IsomorphicStrings iso = new IsomorphicStrings();
        assertFalse(iso.isIsomorphicByMap("aba", "baa"));
        assertFalse(iso.isIsomorphicByMap("ab", "aa"));
        assertFalse(iso.isIsomorphicByMap("ac", "b"));
        assertFalse(iso.isIsomorphicByMap(null, "bar"));
        assertFalse(iso.isIsomorphicByMap("", "bar"));
        assertFalse(iso.isIsomorphicByMap("foo", "bar"));
        assertFalse(iso.isIsomorphicByMap("bar", "foo"));
        assertTrue(iso.isIsomorphicByMap("egg", "add"));
        assertTrue(iso.isIsomorphicByMap("a", "b"));
        assertTrue(iso.isIsomorphicByMap("paper", "title"));
    }

    @Test
    public void isIsomorphicByMapUseBigData() throws Exception {
        IsomorphicStrings iso = new IsomorphicStrings();
        assertFalse(iso.isIsomorphicByMap(bigData.get(0), bigData.get(1)));
    }

}