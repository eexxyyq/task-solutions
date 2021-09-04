package ru.eexxyyq.solutions.tasks.week2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task8Test {

    @Test
    void solution() {
        assertEquals(0, Task8.solution(new int[][]{}));
        assertEquals(0, Task8.solution(new int[][]{{0}}));
        assertEquals(1, Task8.solution(new int[][]{{1}}));
        assertEquals(3, Task8.solution(new int[][]{
                {1,1,0,1},
                {1,0,0,1},
                {0,0,0,1},
                {1,1,0,1}
        }));
    }
}