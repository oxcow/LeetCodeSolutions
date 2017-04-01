package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://leetcode.com/problems/detect-capital/">Detect Capital</a>
 * <p>
 * Given a word, you need to judge whether the usage of capitals in it is right or not.
 * <p>
 * We define the usage of capitals in a word to be right when one of the following cases holds:
 * <p>
 * All letters in this word are capitals, like "USA".
 * All letters in this word are not capitals, like "leetcode".
 * Only the first letter in this word is capital if it has more than one letter, like "Google".
 * Otherwise, we define that this word doesn't use capitals in a right way.
 * Example 1:
 * Input: "USA"
 * Output: True
 * Example 2:
 * Input: "FlaG"
 * Output: False
 * Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.
 * <p>
 * Created by leeyee on 2017/4/1.
 */
public class DetectCapital {

    public boolean detectCapitalUse(String word) {

        if (word.length() == 1) return true;

        boolean isUpper = false, isLower = false;

        for (int i = 1; i < word.toCharArray().length; i++) {

            char c = word.toCharArray()[i];

            if (Character.isUpperCase(c)) {
                isUpper = true;
            } else {
                isLower = true;
            }

            if (isUpper && isLower) return false;

        }

        return isLower || Character.isUpperCase(word.charAt(0));

    }
}
