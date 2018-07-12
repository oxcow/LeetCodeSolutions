package com.leetcode.oj.problem.solution.easy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Stack;

/**
 * URL: <a href="https://leetcode.com/problems/baseball-game/description/">Baseball Game</a>
 * <p>
 * You're now a baseball game point recorder.
 * <p>
 * Given a list of strings, each string can be one of the 4 following types:
 * <p>
 * Integer (one round's score): Directly represents the number of points you get in this round.
 * "+" (one round's score): Represents that the points you get in this round are the sum of the last two valid round's points.
 * "D" (one round's score): Represents that the points you get in this round are the doubled data of the last valid round's points.
 * "C" (an operation, which isn't a round's score): Represents the last valid round's points you get were invalid and should be removed.
 * Each round's operation is permanent and could have an impact on the round before and the round after.
 * <p>
 * You need to return the sum of the points you could get in all the rounds.
 * <p>
 * Example 1:
 * Input: ["5","2","C","D","+"]
 * Output: 30
 * Explanation:
 * Round 1: You could get 5 points. The sum is: 5.
 * Round 2: You could get 2 points. The sum is: 7.
 * Operation 1: The round 2's data was invalid. The sum is: 5.
 * Round 3: You could get 10 points (the round 2's data has been removed). The sum is: 15.
 * Round 4: You could get 5 + 10 = 15 points. The sum is: 30.
 * Example 2:
 * Input: ["5","-2","4","C","D","9","+","+"]
 * Output: 27
 * Explanation:
 * Round 1: You could get 5 points. The sum is: 5.
 * Round 2: You could get -2 points. The sum is: 3.
 * Round 3: You could get 4 points. The sum is: 7.
 * Operation 1: The round 3's data is invalid. The sum is: 3.
 * Round 4: You could get -4 points (the round 3's data has been removed). The sum is: -1.
 * Round 5: You could get 9 points. The sum is: 8.
 * Round 6: You could get -4 + 9 = 5 points. The sum is 13.
 * Round 7: You could get 9 + 5 = 14 points. The sum is 27.
 * Note:
 * The size of the input list will be between 1 and 1000.
 * Every integer represented in the list will be between -30000 and 30000.
 */
public class BaseballGame {

    private static final Logger logger = LoggerFactory.getLogger(BaseballGame.class);

    public int calPoints(String[] ops) {

        int round = 1, ope = 1; // for log

        Stack<Integer> scoreboard = new Stack<>();

        for (int i = 0; i < ops.length; i++) {

            switch (ops[i]) {
                case "C":
                    scoreboard.pop();
                    logger.debug("Operation {}: The round {}'s data was invalid. The scoreboard is: {}.", ope++, (round - 1), scoreboard);
                    break;
                case "D":
                    int lastScore = scoreboard.peek();
                    scoreboard.push(lastScore * 2);
                    logger.debug("Round {}: You could get {} * 2 = {} points. The scoreboard is: {}.", round++, lastScore, scoreboard.peek(), scoreboard);
                    break;
                case "+":
                    int lastRound = scoreboard.pop();
                    int secLastRound = scoreboard.peek();
                    int plusScore = lastRound + secLastRound;
                    scoreboard.push(lastRound);
                    scoreboard.push(plusScore);
                    logger.debug("Round {}: You could get {} + {} = {} points. The scoreboard is: {}.", round++, lastRound, secLastRound, plusScore, scoreboard);
                    break;
                default:
                    int score = Integer.valueOf(ops[i]);
                    scoreboard.push(score);
                    logger.debug("Round {}: You could get {} points. The scoreboard is: {}.", round++, score, scoreboard);
            }
        }

        int sum = scoreboard.stream().mapToInt(Integer::intValue).sum();

        logger.debug("The final total score is: {}", sum);

        return sum;
    }
}
