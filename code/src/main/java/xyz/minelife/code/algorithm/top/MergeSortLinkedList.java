package xyz.minelife.code.algorithm.top;



import xyz.minelife.code.algorithm.bean.ListNode;
import xyz.minelife.code.util.CollectionUtil;

/**
 * Description ：https://leetcode-cn.com/problems/merge-two-sorted-lists/
 * Created by huqiang on 2019/7/9.
 */
public class MergeSortLinkedList {
    public static void main(String[] args) {
        ListNode l1 = makeListOne();
        ListNode l2 = makeListTwo();
        CollectionUtil.printLinkedList(l1);
        CollectionUtil.printLinkedList(l2);
        ListNode listNode = mergeTwoLists(l1, l2);
        CollectionUtil.printLinkedList(listNode);
    }

    private static ListNode makeListOne() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        return node1;
    }

    private static ListNode makeListTwo() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        return node1;
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null) {
            return null;
        } else if (l1 != null && l2 == null) {
            return l1;
        } else if (l1 == null && l2 != null) {
            return l2;
        }

        // 指定一个首节点
        ListNode result = null;
        ListNode temp = null;

        if (l1.val < l2.val) {
            temp = new ListNode(l1.val);
            l1 = l1.next;
        } else {
            temp = new ListNode(l2.val);
            l2 = l2.next;
        }

        result = temp;

        // 依次把小的结点存放到结果链表中，直到其中一个链表遍历完毕
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }

        // 把剩余的链表结点  添加到结果链表中
        while (l1 != null) {
            temp.next = l1;
            l1 = l1.next;
            temp = temp.next;
        }

        while (l2 != null) {
            temp.next = l2;
            l2 = l2.next;
            temp = temp.next;
        }
        return result;
    }
}
