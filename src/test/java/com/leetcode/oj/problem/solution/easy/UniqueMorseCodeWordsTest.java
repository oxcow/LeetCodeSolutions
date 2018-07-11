package com.leetcode.oj.problem.solution.easy;

import com.google.common.base.Stopwatch;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class UniqueMorseCodeWordsTest {

    String limitWords[] = new String[100];
    String simpleWords[] = new String[]{"gin", "zen", "gig", "msg"};

    @Before
    public void init() {
        for (int i = 0; i < 100; i++) {
            limitWords[i] = RandomStringUtils.randomAlphabetic(12).toLowerCase();
        }
    }

    @After
    public void destroy() {
        limitWords = null;
        simpleWords = null;
    }

    @Test
    public void uniqueMorseRepresentations() {
        Stopwatch stopwatch = Stopwatch.createStarted();
        UniqueMorseCodeWords uniqueMorseCodeWords = new UniqueMorseCodeWords();
        assertEquals(2, uniqueMorseCodeWords.uniqueMorseRepresentations(simpleWords));
        System.out.println(stopwatch.stop().elapsed(TimeUnit.NANOSECONDS));
    }

    @Test
    public void limitTest() {
        Stopwatch stopwatch = Stopwatch.createStarted();
        UniqueMorseCodeWords uniqueMorseCodeWords = new UniqueMorseCodeWords();
        assertEquals(100, uniqueMorseCodeWords.uniqueMorseRepresentations(limitWords));
        System.out.println(stopwatch.stop().elapsed(TimeUnit.NANOSECONDS));
    }
}