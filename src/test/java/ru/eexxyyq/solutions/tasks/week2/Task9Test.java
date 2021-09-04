package ru.eexxyyq.solutions.tasks.week2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task9Test {

    @Test
    void solution() {
        assertArrayEquals(new int[]{}, Task9.solution(new int[]{}));
        assertNull(Task9.solution(null));
        assertArrayEquals(new int[]{1, 1, 1, 1, 1}, Task9.solution(new int[]{1, 1, 1, 1, 1}));
        assertArrayEquals(new int[]{2, 2, 4, 4}, Task9.solution(new int[]{2, 4, -1, -1}));
        assertArrayEquals(new int[]{2, 2, 1, 4, 4}, Task9.solution(new int[]{2, 1, 4, -1, -1}));
    }
}