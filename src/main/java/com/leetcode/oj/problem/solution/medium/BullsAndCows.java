package com.leetcode.oj.problem.solution.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * URL: <a href="https://leetcode.com/problems/bulls-and-cows/description/">Bulls and Cows</a>
 * <p>
 * You are playing the following Bulls and Cows game with your friend: You write down a number and ask your friend to guess what the number is. Each time your friend makes a guess, you provide a hint that indicates how many digits in said guess match your secret number exactly in both digit and position (called "bulls") and how many digits match the secret number but locate in the wrong position (called "cows"). Your friend will use successive guesses and hints to eventually derive the secret number.
 * <p>
 * Write a function to return a hint according to the secret number and friend's guess, use A to indicate the bulls and B to indicate the cows.
 * <p>
 * Please note that both secret number and friend's guess may contain duplicate digits.
 * <p>
 * Example 1:
 * <p>
 * Input: secret = "1807", guess = "7810"
 * <p>
 * Output: "1A3B"
 * <p>
 * Explanation: 1 bull and 3 cows. The bull is 8, the cows are 0, 1 and 7.
 * Example 2:
 * <p>
 * Input: secret = "1123", guess = "0111"
 * <p>
 * Output: "1A1B"
 * <p>
 * Explanation: The 1st 1 in friend's guess is a bull, the 2nd or 3rd 1 is a cow.
 * Note: You may assume that the secret number and your friend's guess only contain digits, and their lengths are always equal.
 */
public class BullsAndCows {
    public String getHint(String secret, String guess) {

        char[] secretChars = secret.toCharArray();
        char[] guessChars = guess.toCharArray();

        int bulls = 0;

        List<Character> guessCows = new ArrayList<>();

        Map<Character, Integer> secretCows = new HashMap<>();

        for (int i = 0; i < secretChars.length; i++) {
            if (secretChars[i] == guessChars[i]) {
                bulls++;
            } else {
                guessCows.add(guessChars[i]);
                secretCows.put(secretChars[i], secretCows.getOrDefault(secretChars[i], 0) + 1);
            }
        }

        int cows = 0;

        for (char guessChar : guessCows) {

            int secs = secretCows.getOrDefault(guessChar, 0);

            if (secs != 0) {
                cows++;
                secretCows.put(guessChar, secs - 1);
            }
        }

        return bulls + "A" + cows + "B";
    }
}
