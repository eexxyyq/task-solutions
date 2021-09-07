package ru.eexxyyq.solutions.tasks.week3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Task5Test {

    @Test
    void intersect() {
        assertArrayEquals(new int[]{1}, Task5.intersection(new int[]{1}, new int[]{1}));
        assertArrayEquals(new int[]{1, 2, 3}, Task5.intersection(new int[]{6, 4, 3, 2, 2, 1}, new int[]{1, 2, 2, 80, 3}));
    }
}