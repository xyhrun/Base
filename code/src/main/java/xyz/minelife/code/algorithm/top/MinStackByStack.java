package xyz.minelife.code.algorithm.top;

import java.util.Stack;

/**
 * Description ：https://leetcode-cn.com/problems/min-stack/
 * Created by huqiang on 2019/7/21.
 */

public class MinStackByStack {
    // 执行用时 : 74 ms, 在所有 Java 提交中击败了97%的用户
    // 内存消耗 : 42 MB, 在所有 Java 提交中击败了85%的用户

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    /**
     * initialize your data structure here.
     */
    public MinStackByStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        // minStack按照从大到小存取元素
        if (minStack.empty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    // 若是弹出最小的元素 则 minStack也弹出元素 否则只弹出stack
    public void pop() {
        if (!minStack.empty() && minStack.peek().equals(stack.peek())) {
            stack.pop();
            minStack.pop();
        } else {
            stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */