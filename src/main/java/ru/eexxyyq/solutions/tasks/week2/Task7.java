package ru.eexxyyq.solutions.tasks.week2;

/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 */
public class Task7 {

    public static ListNode reverseList(ListNode head) {
        var cur = head;
        ListNode prev = null;
        ListNode tmp;
        while (cur != null) {
            tmp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tmp;
        }
        return prev;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
