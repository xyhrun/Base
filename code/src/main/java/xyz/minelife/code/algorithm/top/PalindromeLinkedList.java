package xyz.minelife.code.algorithm.top;


import java.util.Stack;

import xyz.minelife.code.algorithm.bean.ListNode;
import xyz.minelife.code.util.CollectionUtil;
import xyz.minelife.code.util.StringUtil;

/**
 * Description ：https://leetcode-cn.com/problems/linked-list-cycle/
 * Created by huqiang on 2019/7/21.
 */

public class PalindromeLinkedList {
    public static void main(String[] args) {
        ListNode l = makeList();
        CollectionUtil.printLinkedList(makeList());
        StringUtil.println(isPlindrome(l));
    }

    private static ListNode makeList() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        return node1;
    }


    public static boolean isPlindrome(ListNode head) {
        ListNode temp = head;
        Stack<ListNode> stack = new Stack<>();
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }

        while (head != null) {
            if (head.val != stack.pop().val) {
                return false;
            }
            head = head.next;
        }
        return true;
    }

}
