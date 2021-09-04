package ru.eexxyyq.solutions.tasks.week2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task10Test {

    @Test
    void solution() {
        assertEquals(1, Task10.solution(new int[]{0}));
        assertEquals(2, Task10.solution(new int[]{1}));
        assertEquals(2, Task10.solution(new int[]{1, 3}));
        assertEquals(1, Task10.solution(new int[]{2, 3}));
        assertEquals(1, Task10.solution(new int[]{234234, 3423, 23242, 1213123213}));
        assertEquals(1, Task10.solution(new int[]{-234234, -3423, -23242, -1213123213}));
    }
}