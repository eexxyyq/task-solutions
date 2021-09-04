package ru.eexxyyq.solutions.tasks.week2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    void solution() {
        assertEquals(-1, Task5.solution(new int[][]{}));
        assertEquals(-1, Task5.solution(new int[][]{{}}));
        assertEquals(-1, Task5.solution(new int[][]{{1}}));
        assertEquals(65, Task5.solution(new int[][]{
                {10, 200, 3, 1, 60},
                {12, 10, 50, 16, 70},
                {155, 100, 1, 11, 5},
                {133, 1, 11, 351, 7},
                {98, 13, 65, 31, 2}
        }));
    }
}