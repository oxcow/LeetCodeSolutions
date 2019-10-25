package com.leetcode.oj.problem.solution.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * URL: <a href="https://leetcode.com/problems/ransom-note/">Ransom Note</a>
 * <p/>
 * Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.
 * <p/>
 * Each letter in the magazine string can only be used once in your ransom note.
 * <p/>
 * Note:
 * You may assume that both strings contain only lowercase letters.
 * <p/><pre>
 * <code>
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 * </code></pre>
 * <p/>
 * Created by leeyee.li on 2017/1/17.
 */
public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote == null || magazine == null) return false;
        if (ransomNote.length() > magazine.length()) return false;

        Map<Character, Integer> magazineCounter = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            if (magazineCounter.containsKey(c)) {
                magazineCounter.put(c, magazineCounter.get(c) + 1);
            } else {
                magazineCounter.put(c, 1);
            }
        }
        Map<Character, Integer> ransomNoteCounter = new HashMap<>();
        for (char c : ransomNote.toCharArray()) {
            if (ransomNoteCounter.containsKey(c)) {
                ransomNoteCounter.put(c, ransomNoteCounter.get(c) + 1);
            } else {
                ransomNoteCounter.put(c, 1);
            }
        }

        if (magazineCounter.keySet().size() < ransomNoteCounter.keySet().size()) {
            return false;
        }

        for (Map.Entry<Character, Integer> characterIntegerEntry : ransomNoteCounter.entrySet()) {
            Character noteChar = characterIntegerEntry.getKey();
            Integer counter = characterIntegerEntry.getValue();
            if (!magazineCounter.containsKey(noteChar) || magazineCounter.get(noteChar) < counter) {
                return false;
            }
        }
        return true;
    }

    public boolean canConstruct1(String ransomNote, String magazine) {
        if (ransomNote == null || magazine == null) return false;

        int rLen = ransomNote.length();
        int mLen = magazine.length();

        if (rLen == 0) return true;
        if (mLen == 0 || rLen > mLen) return false;

        char[] ransomNotes = ransomNote.toCharArray();
        Arrays.sort(ransomNotes);

        char[] magazines = magazine.toCharArray();
        Arrays.sort(magazines);

        int i = 0, j = 0, match = 0;

        while (i < rLen && j < mLen) {
            if (ransomNotes[i] == magazines[j]) {
                ++match;
                ++i;
            } else if (j == mLen - 1) {
                return false;
            }
            ++j;
        }
        return match == rLen;
    }
}
