package ru.eexxyyq.solutions.tasks.week1;

import org.junit.jupiter.api.Test;
import ru.eexxyyq.solutions.tasks.week1.Task3;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void solution() {
        assertEquals(0, Task3.solution(new int[]{0}));
        assertEquals(0, Task3.solution(new int[]{1}));
        assertEquals(0, Task3.solution(new int[]{1, 0}));
        assertEquals(1, Task3.solution(new int[]{1, 1}));
        assertEquals(1, Task3.solution(new int[]{1, 5, 1}));
        assertEquals(1, Task3.solution(new int[]{1000, 5, 1}));
        assertEquals(5, Task3.solution(new int[]{1, 1, 5}));
        assertEquals(112, Task3.solution(new int[]{1, 2, 3, 100, 7, 10}));
    }
}