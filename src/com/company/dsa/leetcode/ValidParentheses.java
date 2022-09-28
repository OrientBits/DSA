package com.company.dsa.leetcode;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()"));//"([}}])"
    }

    public static boolean isValid(String s) {

        if (s == null || s.isEmpty()) {
            return true;
        }
        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.add(c);
            } else {
                if (stack.isEmpty()) return false;
                if (stack.contains(map.get(c))) {
                    if (stack.get(stack.size() - 1) == map.get(c)) {
                        stack.pop();
                    }
                }else return false;
            }
            System.out.println(stack);
        }

        return stack.isEmpty();

    }


}
