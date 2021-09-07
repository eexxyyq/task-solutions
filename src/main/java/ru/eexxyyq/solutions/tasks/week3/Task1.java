package ru.eexxyyq.solutions.tasks.week3;

import java.util.ArrayList;
import java.util.Objects;

/**
 * 234. Palindrome Linked List
 * Given the head of a singly linked list, return true if it is a palindrome.
 */
public class Task1 {

    public static boolean isPalindrome(ListNode head) {
        var resArr = new ArrayList<Integer>();
        while (head != null) {
            resArr.add(head.val);
            head = head.next;
        }
        var start = 0;
        var end = resArr.size() - 1;
        while (start < end) {
            if (!Objects.equals(resArr.get(start++), resArr.get(end--))) {
                return false;
            }
        }
        return true;
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
