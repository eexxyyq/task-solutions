package ru.eexxyyq.solutions.tasks.week1;

import org.junit.jupiter.api.Test;
import ru.eexxyyq.solutions.tasks.week1.Task1;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void solution() {
        assertEquals(0, Task1.solution(""));
        assertEquals(0, Task1.solution("a"));
        assertEquals(0, Task1.solution("abc"));
        assertEquals(3, Task1.solution("cba"));
        assertEquals(9, Task1.solution("abcdcba"));
    }
}