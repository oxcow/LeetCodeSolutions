package com.leetcode.oj.problem.solution.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * URL: <a href="https://leetcode.com/problems/keyboard-row">Keyboard Row</a>
 * <p>
 * Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.
 * <p>
 * <p>
 * American keyboard
 * <p>
 * <p>
 * Example 1:
 * Input: ["Hello", "Alaska", "Dad", "Peace"]
 * Output: ["Alaska", "Dad"]
 * Note:
 * You may use one character in the keyboard more than once.
 * You may assume the input string will only contain letters of alphabet.
 * <p>
 * Created by leeyee on 2017/3/31.
 */
public class KeyboardRow {

    String wordString1 = "qwertyuiop";
    String wordString = "asdfghjkl";
    String wordString2 = "zxcvbnm";

    private boolean match(String word, String target) {
        boolean isMatch = true;
        word = word.toLowerCase();
        for (char c : word.toCharArray()) {
            if (target.indexOf(c) == -1) {
                isMatch = false;
                break;
            }
        }
        return isMatch;
    }

    public String[] findWords(String[] words) {
        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (match(word, wordString)
                    || match(word, wordString1)
                    || match(word, wordString2)) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }
}
