package com.leetcode.oj.problem.solution.easy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * URL: <a href="https://leetcode.com/problems/most-common-word/description/">Most Common Word</a>
 * <p>
 * Given a paragraph and a list of banned words, return the most frequent word that is not in the list of banned words.  It is guaranteed there is at least one word that isn't banned, and that the answer is unique.
 * <p>
 * Words in the list of banned words are given in lowercase, and free of punctuation.  Words in the paragraph are not case sensitive.  The answer is in lowercase.
 * <p>
 * Example:
 * Input:
 * paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
 * banned = ["hit"]
 * Output: "ball"
 * Explanation:
 * "hit" occurs 3 times, but it is a banned word.
 * "ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph.
 * Note that words in the paragraph are not case sensitive,
 * that punctuation is ignored (even if adjacent to words, such as "ball,"),
 * and that "hit" isn't the answer even though it occurs more because it is banned.
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= paragraph.length <= 1000.
 * 1 <= banned.length <= 100.
 * 1 <= banned[i].length <= 10.
 * The answer is unique, and written in lowercase (even if its occurrences in paragraph may have uppercase symbols, and even if it is a proper noun.)
 * paragraph only consists of letters, spaces, or the punctuation symbols !?',;.
 * Different words in paragraph are always separated by a space.
 * There are no hyphens or hyphenated words.
 * Words only consist of letters, never apostrophes or other punctuation symbols.
 */
public class MostCommonWord {

    private static final Logger LOGGER = LoggerFactory.getLogger(MostCommonWord.class);

    public String mostCommonWord(String paragraph, String[] banned) {

        Map<String, Integer> wordCountMap = new HashMap<>();

        String word = "";

        for (char c : (paragraph + " ").toCharArray()) {
            if (Character.isLetter(c)) {
                word += c;
            } else if (word != "") {
                wordCountMap.put(word.toLowerCase(), wordCountMap.getOrDefault(word.toLowerCase(), 0) + 1);
                word = "";
            }
        }

        LOGGER.debug("Word frequency statistics: {}", wordCountMap);

        Arrays.stream(banned).forEach(wordCountMap::remove);

        LOGGER.debug("Remove baned words: {}", wordCountMap);

        String mostWord = null;
        Integer mostWordCount = 0;
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > mostWordCount) {
                mostWordCount = entry.getValue();
                mostWord = entry.getKey();
            }
        }

        LOGGER.debug("Most common word is [{}] and occurs {} times.", mostWord, mostWordCount);

        return mostWord;
    }
}
