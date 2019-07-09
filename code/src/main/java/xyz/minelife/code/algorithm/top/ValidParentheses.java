package xyz.minelife.code.algorithm.top;

import java.util.Stack;

/**
 * description: https://leetcode-cn.com/problems/valid-parentheses/
 * created by salen on 2019/7/8
 * blog: https://www.minelife.xyz
 */
public class ValidParentheses {
    public static void main(String[] args) {
        String s = "{[{()[]{{}}}]}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        if (s == null && s.equals("")) {
            return false;
        }

        if (s.length() % 2 == 1) {
            return false;
        }

        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if (stack.isEmpty()) {
                stack.push(chars[i]);
            } else {
                // 如果字符数组当前元素和栈顶元素匹配  则直接弹出栈顶元素
                if (isMatch(stack.peek(), chars[i])) {
                    stack.pop();
                } else {
                    // 不匹配则将字符压进栈
                    stack.push(chars[i]);
                }
            }
        }
        // 遍历完后 假如栈空则代表字符全部匹配
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }

    // 匹配字符
    private static boolean isMatch(char c1, Character c2) {
        if (c1 == '{' && c2 == '}') {
            return true;
        }
        if (c1 == '(' && c2 == ')') {
            return true;
        }
        if (c1 == '[' && c2 == ']') {
            return true;
        }
        return false;
    }
}
