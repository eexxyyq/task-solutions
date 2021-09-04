package ru.eexxyyq.solutions.tasks.week2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void solution() {
        assertEquals(" мама мыла раму ", Task2.solution(" амам алым умар "));
        assertEquals("  ", Task2.solution("  "));
        assertEquals(" a", Task2.solution(" a"));
        assertEquals("ba", Task2.solution("ab"));
        assertEquals("b ", Task2.solution("b "));
        assertEquals("b t", Task2.solution("b t"));
    }
}