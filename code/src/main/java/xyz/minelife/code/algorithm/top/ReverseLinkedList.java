package xyz.minelife.code.algorithm.top;


import xyz.minelife.code.algorithm.bean.ListNode;
import xyz.minelife.code.util.CollectionUtil;
import xyz.minelife.code.util.StringUtil;

/**
 * Description ：https://leetcode-cn.com/problems/linked-list-cycle/
 * Created by huqiang on 2019/7/21.
 */

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode l = makeList();

        CollectionUtil.printLinkedList(makeList());
        CollectionUtil.printLinkedList(reverseList(l));
    }

    private static ListNode makeList() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        return node1;
    }


    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

}
