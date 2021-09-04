package ru.eexxyyq.solutions.tasks.week1;

import org.junit.jupiter.api.Test;
import ru.eexxyyq.solutions.tasks.week1.Task5;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    void solution() {
        assertEquals(0, Task5.solution(0,0));
        assertEquals(0, Task5.solution(0,0));
        assertEquals(0, Task5.solution(0,1));
        assertEquals(1, Task5.solution(1,2));
        assertEquals(2, Task5.solution(1,3));
        assertEquals(4, Task5.solution(1,10));
        assertEquals(25, Task5.solution(1,100));
    }
}