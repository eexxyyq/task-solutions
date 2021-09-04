package ru.eexxyyq.solutions.tasks.week2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {

    @Test
    void reverseList() {
        var expected = "1,2,3,4,5,";
        var head = new Task7.ListNode(5);
        head.next = new Task7.ListNode(4);
        head.next.next = new Task7.ListNode(3);
        head.next.next.next = new Task7.ListNode(2);
        head.next.next.next.next = new Task7.ListNode(1);
        var sb = new StringBuilder();
        var newHead = Task7.reverseList(head);
        while (newHead != null) {
            sb.append(newHead.val).append(",");
            newHead = newHead.next;
        }
        var result = sb.toString();
        assertEquals(expected, result);
    }
}