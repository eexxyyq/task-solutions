package ru.eexxyyq.solutions.tasks.week1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {

    @Test
    void solution() {
        var no = "NO";
        var yes = "YES";
        assertEquals(no, Task7.solution(""));
        assertEquals(no, Task7.solution(null));
        assertEquals(yes, Task7.solution("a"));
        assertEquals(no, Task7.solution("ab"));
        assertEquals(yes, Task7.solution("aba"));
        assertEquals(yes, Task7.solution("abba"));
        assertEquals(no, Task7.solution("abbaxc"));
    }
}