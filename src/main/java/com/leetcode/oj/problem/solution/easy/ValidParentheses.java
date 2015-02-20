package com.leetcode.oj.problem.solution.easy;

import java.util.Stack;

/**
 * URL: <a href="https://oj.leetcode.com/problems/valid-parentheses/">valid-parentheses</a>
 * <p/>
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p/>
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * <p/>
 * <p/>
 * Created by leeyee.li on 2015/1/15.
 */
public class ValidParentheses {

    public final static String SYMBOL_STRING = "()[]{}"; //40, 41, 91, 93, 123, 125

    public static boolean isValid(String str) {

        if (null == str || "".equals(str.trim()))
            return false;

        Stack<Character> stack = new Stack();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) return false;
                switch (ch) {
                    case ')':
                        ch = '(';
                        break;
                    case ']':
                        ch = '[';
                        break;
                    case '}':
                        ch = '{';
                        break;
                }
                if (stack.peek() != ch) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
