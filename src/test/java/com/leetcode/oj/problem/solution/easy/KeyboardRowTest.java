package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by leeyee on 2017/3/31.
 */
public class KeyboardRowTest {
    @Test
    public void findWords() throws Exception {
        KeyboardRow keyboardRow = new KeyboardRow();
        Assert.assertArrayEquals(new String[]{"Alaska", "Dad"}, keyboardRow.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"}));
        Assert.assertArrayEquals(new String[]{"a", "b", "t"}, keyboardRow.findWords(new String[]{"a", "b", "t"}));
    }

}