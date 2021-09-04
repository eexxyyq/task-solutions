package ru.eexxyyq.solutions.tasks.week2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void solution() {
        assertEquals(-1, Task3.solution(new int[]{}, 1));
        assertEquals(1, Task3.solution(new int[]{1}, 1));
        assertEquals(-1, Task3.solution(new int[]{2}, 1));
        assertEquals(8, Task3.solution(new int[]{2, 1, 2, 3, 1, 1, 1, 2, 3, 3, 1}, 3));
    }
}