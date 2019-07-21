package xyz.minelife.code.algorithm.top;

/**
 * Description ：https://leetcode-cn.com/problems/min-stack/
 * Created by huqiang on 2019/7/21.
 */

public class MinStack {

    // 执行用时 : 416 ms, 在所有 Java 提交中击败了7.26%的用户
    // 内存消耗 : 61.1 MB, 在所有 Java 提交中击败了5.38%的用户

    public static final int DEFAULT_SIZE = 10;
    private Integer[] elements = new Integer[DEFAULT_SIZE];
    private int size;
    private Integer[] sortElements = new Integer[DEFAULT_SIZE];

    /**
     * initialize your data structure here.
     */
    public MinStack() {

    }

    public void push(int x) {
        ensureCapacity(1 + size);

        if (size == 0) {
            sortElements[0] = x;
        } else {
            insertToSortElement(x);
        }

        elements[size++] = x;
    }

    private void insertToSortElement(int x) {
        int pos = 0;
        for (; pos < size; pos++) {
            if (x < sortElements[pos]) {
                break;
            }
        }

        for (int i = size; i > pos; i--) {
            sortElements[i] = sortElements[i - 1];
        }

        sortElements[pos] = x;
    }

    public void pop() {
        if (size > 0) {
            removeSortElementsByElement(top());
            elements[--size] = null;
        } else {
            throw new IllegalArgumentException("elements is empty");
        }
    }

    private void removeSortElementsByElement(int top) {
        int i = 0;
        for (; i < size; i++) {
            if (sortElements[i] == top) {
                break;
            }
        }

        removeSortElementsByPos(i);
    }

    private void removeSortElementsByPos(int pos) {
        for (int i = pos; i < size - 1; i++) {
            sortElements[i] = sortElements[i + 1];
        }

        sortElements[size - 1] = null;
    }

    public int top() {
        if (size > 0) {
            return elements[size - 1];
        }
        throw new IllegalArgumentException("elements is empty");
    }

    public int getMin() {
        if (size > 0) {
            return sortElements[0];
        }
        throw new IllegalArgumentException("elements is empty");
    }

    private void ensureCapacity(int newSize) {
        if (newSize > elements.length) {
            elements = makeNewElements(newSize);
        }
    }

    private Integer[] makeNewElements(int newSize) {
        int oldCapacity = elements.length;
        int finalSize = oldCapacity + (oldCapacity >> 1);
        if (finalSize < newSize) {
            finalSize = newSize > Integer.MAX_VALUE ? Integer.MAX_VALUE : newSize;
        }

        Integer[] newElements = new Integer[finalSize];
        Integer[] newSortElements = new Integer[finalSize];
        for (int i = 0; i < oldCapacity; i++) {
            newElements[i] = elements[i];
            newSortElements[i] = sortElements[i];
        }
        sortElements = newSortElements;
        return newElements;
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