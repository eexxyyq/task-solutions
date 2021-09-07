package ru.eexxyyq.solutions.tasks.week3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void firstMissingPositive() {
        assertEquals(1, Task2.firstMissingPositive(new int[]{2, 3, 4}));
        assertEquals(5, Task2.firstMissingPositive(new int[]{1, 2, 3, 4}));
        assertEquals(1, Task2.firstMissingPositive(new int[]{}));
    }
}