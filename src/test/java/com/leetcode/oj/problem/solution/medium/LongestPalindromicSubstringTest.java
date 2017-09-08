package com.leetcode.oj.problem.solution.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.*;

/**
 * Created by wli on 2017-08-08.
 */
public class LongestPalindromicSubstringTest {

    String caseStr = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";

    String caseStr1 = "aaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffgggggggggghhhhhhhhhhiiiiiiiiiijjjjjjjjjjkkkkkkkkkkllllllllllmmmmmmmmmmnnnnnnnnnnooooooooooppppppppppqqqqqqqqqqrrrrrrrrrrssssssssssttttttttttuuuuuuuuuuvvvvvvvvvvwwwwwwwwwwxxxxxxxxxxyyyyyyyyyyzzzzzzzzzzyyyyyyyyyyxxxxxxxxxxwwwwwwwwwwvvvvvvvvvvuuuuuuuuuuttttttttttssssssssssrrrrrrrrrrqqqqqqqqqqppppppppppoooooooooonnnnnnnnnnmmmmmmmmmmllllllllllkkkkkkkkkkjjjjjjjjjjiiiiiiiiiihhhhhhhhhhggggggggggffffffffffeeeeeeeeeeddddddddddccccccccccbbbbbbbbbbaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffgggggggggghhhhhhhhhhiiiiiiiiiijjjjjjjjjjkkkkkkkkkkllllllllllmmmmmmmmmmnnnnnnnnnnooooooooooppppppppppqqqqqqqqqqrrrrrrrrrrssssssssssttttttttttuuuuuuuuuuvvvvvvvvvvwwwwwwwwwwxxxxxxxxxxyyyyyyyyyyzzzzzzzzzzyyyyyyyyyyxxxxxxxxxxwwwwwwwwwwvvvvvvvvvvuuuuuuuuuuttttttttttssssssssssrrrrrrrrrrqqqqqqqqqqppppppppppoooooooooonnnnnnnnnnmmmmmmmmmmllllllllllkkkkkkkkkkjjjjjjjjjjiiiiiiiiiihhhhhhhhhhggggggggggffffffffffeeeeeeeeeeddddddddddccccccccccbbbbbbbbbbaaaa";

    String caseStr2 = "321012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210123210012321001232100123210123";

    String caseStr2_r = "321012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210123";

    String caseStr3 = "esbtzjaaijqkgmtaajpsdfiqtvxsgfvijpxrvxgfumsuprzlyvhclgkhccmcnquukivlpnjlfteljvykbddtrpmxzcrdqinsnlsteonhcegtkoszzonkwjevlasgjlcquzuhdmmkhfniozhuphcfkeobturbuoefhmtgcvhlsezvkpgfebbdbhiuwdcftenihseorykdguoqotqyscwymtjejpdzqepjkadtftzwebxwyuqwyeegwxhroaaymusddwnjkvsvrwwsmolmidoybsotaqufhepinkkxicvzrgbgsarmizugbvtzfxghkhthzpuetufqvigmyhmlsgfaaqmmlblxbqxpluhaawqkdluwfirfngbhdkjjyfsxglsnakskcbsyafqpwmwmoxjwlhjduayqyzmpkmrjhbqyhongfdxmuwaqgjkcpatgbrqdllbzodnrifvhcfvgbixbwywanivsdjnbrgskyifgvksadvgzzzuogzcukskjxbohofdimkmyqypyuexypwnjlrfpbtkqyngvxjcwvngmilgwbpcsseoywetatfjijsbcekaixvqreelnlmdonknmxerjjhvmqiztsgjkijjtcyetuygqgsikxctvpxrqtuhxreidhwcklkkjayvqdzqqapgdqaapefzjfngdvjsiiivnkfimqkkucltgavwlakcfyhnpgmqxgfyjziliyqhugphhjtlllgtlcsibfdktzhcfuallqlonbsgyyvvyarvaxmchtyrtkgekkmhejwvsuumhcfcyncgeqtltfmhtlsfswaqpmwpjwgvksvazhwyrzwhyjjdbphhjcmurdcgtbvpkhbkpirhysrpcrntetacyfvgjivhaxgpqhbjahruuejdmaghoaquhiafjqaionbrjbjksxaezosxqmncejjptcksnoq";


    @Test
    public void testLongestPalindrome() throws Exception {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        Assert.assertNull(lps.longestPalindrome(null));
        Assert.assertEquals("a", lps.longestPalindrome("abcda"));
        Assert.assertEquals("cccc", lps.longestPalindrome("bccccd"));
        Assert.assertEquals("ccc", lps.longestPalindrome("ccc"));
        Assert.assertEquals("", lps.longestPalindrome(""));
        Assert.assertEquals("a", lps.longestPalindrome("a"));
        Assert.assertEquals("bb", lps.longestPalindrome("cbbd"));
        Assert.assertEquals("aa", lps.longestPalindrome("aa"));
        Assert.assertEquals("aba", lps.longestPalindrome("babad")); // return bab also is right
        Assert.assertEquals("bacdcab", lps.longestPalindrome("bacdcab"));
        Assert.assertEquals("ranynar", lps.longestPalindrome(caseStr));
        Assert.assertEquals(caseStr1, lps.longestPalindrome(caseStr1));
        Assert.assertEquals(caseStr2_r, lps.longestPalindrome(caseStr2));
        Assert.assertEquals("yvvy", lps.longestPalindrome(caseStr3));
    }

    @Test
    public void testLongestPalindrome2() throws Exception {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        Assert.assertNull(lps.longestPalindrome2(null));
        Assert.assertEquals("cccc", lps.longestPalindrome2("bccccd"));
        Assert.assertEquals("ccc", lps.longestPalindrome2("ccc"));
        Assert.assertEquals("", lps.longestPalindrome2(""));
        Assert.assertEquals("a", lps.longestPalindrome2("a"));
        Assert.assertEquals("bb", lps.longestPalindrome2("cbbd"));
        Assert.assertEquals("aa", lps.longestPalindrome2("aa"));
        Assert.assertEquals("aba", lps.longestPalindrome2("babad")); // return bab also is right
        Assert.assertEquals("bacdcab", lps.longestPalindrome2("bacdcab"));
        Assert.assertEquals("ranynar", lps.longestPalindrome2(caseStr));
        Assert.assertEquals(caseStr1, lps.longestPalindrome2(caseStr1));
        Assert.assertEquals(caseStr2_r, lps.longestPalindrome2(caseStr2));
        Assert.assertEquals("yvvy", lps.longestPalindrome2(caseStr3));
    }

    @Test
    public void testLongestPalindrome3() throws Exception {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();

        Assert.assertEquals("anana", lps.longestPalindrome3("bananas"));
        Assert.assertEquals("abbaabba", lps.longestPalindrome3("abbaabba"));

        Assert.assertNull(lps.longestPalindrome3(null));
        Assert.assertEquals("bb", lps.longestPalindrome3("abb"));
        Assert.assertEquals("aba", lps.longestPalindrome3("caba"));
        Assert.assertEquals("aba", lps.longestPalindrome3("babad")); // return bab also is right
        Assert.assertEquals("bacdcab", lps.longestPalindrome3("bacdcab"));
        Assert.assertEquals("aaaaaa", lps.longestPalindrome3("aaaaaa"));
        Assert.assertEquals("aa", lps.longestPalindrome3("aa"));
        Assert.assertEquals("cc", lps.longestPalindrome3("ccd"));
        Assert.assertEquals("a", lps.longestPalindrome3("abcda"));
        Assert.assertEquals("cccc", lps.longestPalindrome3("bccccd"));
        Assert.assertEquals("ccc", lps.longestPalindrome3("ccc"));
        Assert.assertEquals("", lps.longestPalindrome3(""));
        Assert.assertEquals("a", lps.longestPalindrome3("a"));
        Assert.assertEquals("bb", lps.longestPalindrome3("cbbd"));
        Assert.assertEquals("ranynar", lps.longestPalindrome3(caseStr));
        Assert.assertEquals(caseStr1, lps.longestPalindrome3(caseStr1));
        Assert.assertEquals("yvvy", lps.longestPalindrome2(caseStr3));
        Assert.assertEquals(caseStr2_r, lps.longestPalindrome3(caseStr2));
    }
}