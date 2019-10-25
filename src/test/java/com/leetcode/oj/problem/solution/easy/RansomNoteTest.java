package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leeyee.li on 2017/1/17.
 */
public class RansomNoteTest {

    @Test
    public void testCanConstruct() {
        RansomNote ransomNote = new RansomNote();

        Assert.assertTrue(ransomNote.canConstruct("", "a"));
        Assert.assertTrue(ransomNote.canConstruct("", ""));
        Assert.assertFalse(ransomNote.canConstruct("a", ""));

        Assert.assertFalse(ransomNote.canConstruct("ff", "adasdf"));
        Assert.assertFalse(ransomNote.canConstruct("ff", "adasdf"));
        Assert.assertFalse(ransomNote.canConstruct("a", "b"));
        Assert.assertFalse(ransomNote.canConstruct("aa", "ab"));
        Assert.assertTrue(ransomNote.canConstruct("abc", "cba"));

        Assert.assertTrue(ransomNote.canConstruct("aa", "aab"));
        Assert.assertTrue(ransomNote.canConstruct("fffbfg", "effjfggbffjdgbjjhhdegh"));
        Assert.assertTrue(ransomNote.canConstruct("bjaajgea", "affhiiicabhbdchbidghccijjbfjfhjeddgggbajhidhjchiedhdibgeaecffbbbefiabjdhggihccec"));
        Assert.assertTrue(ransomNote.canConstruct("bg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));

    }

    @Test
    public void testCanConstruct1() {
        RansomNote ransomNote = new RansomNote();

        Assert.assertTrue(ransomNote.canConstruct1("", "a"));
        Assert.assertTrue(ransomNote.canConstruct1("", ""));
        Assert.assertFalse(ransomNote.canConstruct1("a", ""));

        Assert.assertFalse(ransomNote.canConstruct1("ff", "adasdf"));
        Assert.assertFalse(ransomNote.canConstruct1("ff", "adasdf"));
        Assert.assertFalse(ransomNote.canConstruct1("a", "b"));
        Assert.assertFalse(ransomNote.canConstruct1("aa", "ab"));
        Assert.assertTrue(ransomNote.canConstruct1("abc", "cba"));

        Assert.assertTrue(ransomNote.canConstruct1("aa", "aab"));
        Assert.assertTrue(ransomNote.canConstruct1("fffbfg", "effjfggbffjdgbjjhhdegh"));
        Assert.assertTrue(ransomNote.canConstruct1("bjaajgea", "affhiiicabhbdchbidghccijjbfjfhjeddgggbajhidhjchiedhdibgeaecffbbbefiabjdhggihccec"));
        Assert.assertTrue(ransomNote.canConstruct1("bg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));

    }
}