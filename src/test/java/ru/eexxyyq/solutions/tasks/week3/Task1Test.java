package ru.eexxyyq.solutions.tasks.week3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    Task1.ListNode listNode;

    @Test
    void isPalindrome() {
        assertTrue(Task1.isPalindrome(listNode));
        listNode = new Task1.ListNode(5);
        assertTrue(Task1.isPalindrome(listNode));
        listNode.next = new Task1.ListNode(6);
        assertFalse(Task1.isPalindrome(listNode));
        listNode.next.next = new Task1.ListNode(5);
        assertTrue(Task1.isPalindrome(listNode));
    }
}