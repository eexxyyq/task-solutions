package ru.eexxyyq.solutions.tasks.week1;

import org.junit.jupiter.api.Test;
import ru.eexxyyq.solutions.tasks.week1.Task2;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void solution() {
        assertEquals(0, Task2.solution(new int[]{0, 0, 0, 0, 0, 0, 0}));
        assertEquals(0, Task2.solution(new int[]{0}));
        assertEquals(1, Task2.solution(new int[]{1}));
        assertEquals(4, Task2.solution(new int[]{1,1,0,1,1}));
        assertEquals(5, Task2.solution(new int[]{1,1,0,1,1,0,1,1,1}));
    }
}