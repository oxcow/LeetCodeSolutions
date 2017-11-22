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
        assertFalse(iso.isIsomorphic("ac", "b"));
        assertFalse(iso.isIsomorphic(null, "bar"));
        assertFalse(iso.isIsomorphic("", "bar"));
        assertFalse(iso.isIsomorphic("foo", "bar"));
        assertTrue(iso.isIsomorphic("egg", "add"));
        assertTrue(iso.isIsomorphic("a", "b"));
        assertTrue(iso.isIsomorphic("paper", "title"));
    }

    @Test
    public void isIsomorphicByBigData() throws Exception {
        IsomorphicStrings iso = new IsomorphicStrings();
        assertFalse(iso.isIsomorphic(bigData.get(0), bigData.get(1)));
    }
}