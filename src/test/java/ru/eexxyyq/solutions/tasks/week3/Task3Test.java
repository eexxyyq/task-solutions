package ru.eexxyyq.solutions.tasks.week3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void strStr() {
        assertEquals(0, Task3.strStr("asd", ""));
        assertEquals(0, Task3.strStr("", ""));
        assertEquals(-1, Task3.strStr("", "sdf"));
        assertEquals(3, Task3.strStr("ssssdfsdf", "sdf"));
    }
}