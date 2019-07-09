package xyz.minelife.code.util;


import xyz.minelife.code.algorithm.bean.ListNode;

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
}
