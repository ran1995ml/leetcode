package com.ran.leetcode.stack;

import java.util.Stack;

/**
 * ValidParentheses_20
 *
 * @author rwei
 * @since 2023/9/16 23:07
 */
public class ValidParentheses_20 {
    public boolean isValid(String s) {
        char[] ch = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : ch) {
            if (!stack.isEmpty()) {
                if (c == ']' && stack.peek() == '[') {
                    stack.pop();
                } else if (c == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
