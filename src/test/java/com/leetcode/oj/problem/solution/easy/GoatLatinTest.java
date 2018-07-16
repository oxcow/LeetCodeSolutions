package com.leetcode.oj.problem.solution.easy;

import junit.framework.Assert;
import org.junit.Test;

public class GoatLatinTest {


    @Test
    public void isVowel() {
        String vowels = "aeiouAEIOU";
        for (char c : vowels.toCharArray()) {
            Assert.assertTrue(GoatLatin.isVowel(c));
        }
        String notVowels = "bcdfgxyzBCDFGXYZ";
        for (char c : notVowels.toCharArray()) {
            Assert.assertFalse(GoatLatin.isVowel(c));
        }
    }

    @Test
    public void toGoatLatin() {

        GoatLatin goatLatin = new GoatLatin();
        Assert.assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
                , goatLatin.toGoatLatin("I speak Goat Latin"));
        Assert.assertEquals("heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
                , goatLatin.toGoatLatin("The quick brown fox jumped over the lazy dog"));
    }

}