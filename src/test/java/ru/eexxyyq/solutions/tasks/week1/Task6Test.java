package ru.eexxyyq.solutions.tasks.week1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {

    @Test
    void solution() {
        assertEquals(0, Task6.solution(""));
        assertEquals(1, Task6.solution("a"));
        assertEquals(0, Task6.solution("g"));
        assertEquals(6, Task6.solution("abc"));
        assertEquals(12, Task6.solution("abcgxyz"));
    }
}