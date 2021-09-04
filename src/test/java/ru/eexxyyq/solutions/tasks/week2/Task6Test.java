package ru.eexxyyq.solutions.tasks.week2;

import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {

    @Test
    void solution() {
        var expected = "1, 3->6, 9";
        var resultList = Task6.solution(new int[]{1, 3, 4, 5, 6, 9});
        var actualResult = String.join(", ", resultList);
        assertEquals(expected, actualResult);
    }
}