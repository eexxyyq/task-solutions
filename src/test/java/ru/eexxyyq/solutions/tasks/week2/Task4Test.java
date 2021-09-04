package ru.eexxyyq.solutions.tasks.week2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void solution() {
        assertEquals(0, Task4.solution(1));
        assertEquals(0, Task4.solution(0));
        assertEquals(2, Task4.solution(2));
        assertEquals(2310, Task4.solution(10000));
        assertEquals(30030, Task4.solution(100000));
    }
}