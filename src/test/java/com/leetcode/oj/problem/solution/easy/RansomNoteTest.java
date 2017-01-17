package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leeyee.li on 2017/1/17.
 */
public class RansomNoteTest {

    @Test
    public void testCanConstruct() throws Exception {
        RansomNote ransomNote = new RansomNote();

        Assert.assertFalse(ransomNote.canConstruct("ff","adasdf"));
        Assert.assertFalse(ransomNote.canConstruct("a","b"));
        Assert.assertFalse(ransomNote.canConstruct("aa","ab"));
        Assert.assertTrue(ransomNote.canConstruct("abc","cba"));

        Assert.assertTrue(ransomNote.canConstruct("aa","aab"));
        Assert.assertTrue(ransomNote.canConstruct("fffbfg","effjfggbffjdgbjjhhdegh"));
        Assert.assertTrue(ransomNote.canConstruct("bjaajgea","affhiiicabhbdchbidghccijjbfjfhjeddgggbajhidhjchiedhdibgeaecffbbbefiabjdhggihccec"));

    }
}