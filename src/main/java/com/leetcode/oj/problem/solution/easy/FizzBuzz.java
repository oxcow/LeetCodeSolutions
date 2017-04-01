package com.leetcode.oj.problem.solution.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * URL: <a href="https://leetcode.com/problems/fizz-buzz/">Fizz Buzz</a>
 * <p>
 * Write a program that outputs the string representation of numbers from 1 to n.
 * <p>
 * But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
 * <p>
 * Example:
 * <p>
 * n = 15,
 * <p>
 * Return:
 * [
 * "1",
 * "2",
 * "Fizz",
 * "4",
 * "Buzz",
 * "Fizz",
 * "7",
 * "8",
 * "Fizz",
 * "Buzz",
 * "11",
 * "Fizz",
 * "13",
 * "14",
 * "FizzBuzz"
 * ]
 * Subscribe to see which companies asked this question.
 * <p>
 * Created by leeyee on 2017/4/1.
 */
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> outputs = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            String output;
            if (i % 15 == 0) output = "FizzBuzz";
            else if (i % 5 == 0) output = "Buzz";
            else if (i % 3 == 0) output = "Fizz";
            else output = Integer.toString(i);

            outputs.add(output);
        }
        return outputs;
    }
}
