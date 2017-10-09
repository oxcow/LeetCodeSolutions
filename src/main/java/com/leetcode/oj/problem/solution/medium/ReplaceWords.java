package com.leetcode.oj.problem.solution.medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * URL: <a href="https://leetcode.com/problems/replace-words/description/">Replace Words</a>
 * <p>
 * In English, we have a concept called root, which can be followed by some other words to form another longer word - let's call this word successor. For example, the root an, followed by other, which can form another word another.
 * <p>
 * Now, given a dictionary consisting of many roots and a sentence. You need to replace all the successor in the sentence with the root forming it. If a successor has many roots can form it, replace it with the root with the shortest length.
 * <p>
 * You need to output the sentence after the replacement.
 * <p>
 * Example 1:
 * Input: dict = ["cat", "bat", "rat"]
 * sentence = "the cattle was rattled by the battery"
 * Output: "the cat was rat by the bat"
 * Note:
 * The input will only have lower-case letters.
 * 1 <= dict words number <= 1000
 * 1 <= sentence words number <= 1000
 * 1 <= root length <= 100
 * 1 <= sentence words length <= 1000
 * <p>
 * Created by wli on 2017-10-09.
 */
public class ReplaceWords {
    /**
     * 1. sorted dict. the shortest root is first. if match return (replace it with the root with the shortest length)
     * 2. loop sentence words. if match, return dict and loop next word. if not, go on.
     * 3. if the words mismatch any dict, return this word.
     *
     * Time complexity: O(dict.size * sentence words number).
     * <p>
     * Space complexity: O(n).
     *
     * @param dict
     * @param sentence
     * @return
     */
    public String replaceWords(List<String> dict, String sentence) {
        if (dict == null || dict.isEmpty()) return sentence;
        if (sentence == null || sentence.isEmpty()) return sentence;

        Collections.sort(dict);

        StringBuilder sb = new StringBuilder();
        for (String word : sentence.split(" ")) {
            for (int i = 0; i < dict.size(); i++) {
                if (word.startsWith(dict.get(i))) {
                    sb.append(dict.get(i));
                    break;
                }
                if (i == dict.size() - 1) {
                    sb.append(word);
                }
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
    }
}
