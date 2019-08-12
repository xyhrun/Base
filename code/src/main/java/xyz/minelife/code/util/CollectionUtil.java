package xyz.minelife.code.util;


import java.util.List;

import xyz.minelife.code.algorithm.bean.ListNode;
import xyz.minelife.code.algorithm.bean.TreeNode;

/**
 * Description
 * Created by huqiang on 2019/7/9.
 */
public class CollectionUtil {
    public static void printLinkedList(ListNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (node != null) {
            sb.append(node.val + ",");
            node = node.next;
        }
        String s = sb.length() > 1 ? sb.substring(0, sb.length() - 1) : sb.toString();
        s += "]";
        System.out.println(s);
    }

    public static void printList(List list) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (Object o : list) {
            sb.append(o.toString() + ",");
        }

        String s = sb.length() > 1 ? sb.substring(0, sb.length() - 1) : sb.toString();
        s += "]";
        System.out.println(s);
    }

    public static void printTree(TreeNode node) {
        if (node == null) {
            return;
        }

        System.out.print(node.val + ", ");
        printTree(node.left);
        printTree(node.right);
    }

    public static void printArr(Object[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i].toString() + ",");
        }

        String s = sb.length() > 1 ? sb.substring(0, sb.length() - 1) : sb.toString();
        s += "]";
        System.out.println(s);

    }

    public static void printArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i] + ",");
        }

        String s = sb.length() > 1 ? sb.substring(0, sb.length() - 1) : sb.toString();
        s += "]";
        System.out.println(s);

    }

}
