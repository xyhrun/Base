package xyz.minelife.code;

import xyz.minelife.code.algorithm.top.MinStackByStack;
import xyz.minelife.code.util.StringUtil;

public class MyClass {
    public static void main(String[] args) {
        MinStackByStack minStack = new MinStackByStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        StringUtil.println(minStack.getMin());  // 返回 -3.
        minStack.pop();
        StringUtil.println(minStack.top());      // 返回 0.
        StringUtil.println(minStack.getMin());   // 返回 -2.

    }
}
