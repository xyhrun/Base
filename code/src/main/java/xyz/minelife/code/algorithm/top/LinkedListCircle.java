package xyz.minelife.code.algorithm.top;


import xyz.minelife.code.algorithm.bean.ListNode;
import xyz.minelife.code.util.StringUtil;

/**
 * Description ：https://leetcode-cn.com/problems/linked-list-cycle/
 * Created by huqiang on 2019/7/21.
 */

public class LinkedListCircle {
    public static void main(String[] args) {
        ListNode l1 = makeList();

        StringUtil.println(hasCycle(l1));
    }

    private static ListNode makeList() {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;
        return node1;
    }


    public static boolean hasCycle(ListNode head) {
        // 快指针移动速度是慢指针的两倍
        ListNode fastNode = head;
        ListNode slowNode = head;

        // 如果有环 他们必定相遇 然后退出，否则移动到结尾退出
        while (fastNode != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next;
            if (fastNode == null) {
                return false;
            } else {
                fastNode = fastNode.next;
            }
            if (slowNode == fastNode) {
                return true;
            }
        }

        return false;
    }

}
