package xyz.minelife.code.util;


import xyz.minelife.code.algorithm.bean.ListNode;
import xyz.minelife.code.algorithm.bean.TreeNode;

/**
 * Description ：
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
        String s = sb.substring(0, sb.length() - 1);
        s += "]";
        System.out.println(s);
    }

    public static void printTree(TreeNode node) {
        if (node == null) {
            return;
        }

        System.out.print(node.val +", ");
        printTree(node.left);
        printTree(node.right);
    }

//    private static String printBinaryTree(TreeNode node) {
//        if (node == null) {
//            return "";
//        }
//
//        return node.val;
//    }
}
