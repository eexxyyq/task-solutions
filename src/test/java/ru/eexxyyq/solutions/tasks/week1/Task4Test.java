package ru.eexxyyq.solutions.tasks.week1;

import org.junit.jupiter.api.Test;
import ru.eexxyyq.solutions.tasks.week1.Task4;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void solutionFirst() {
        var startArray = new int[]{10};
        Task4.solution(startArray);
        assertArrayEquals(new int[]{10}, startArray);
    }

    @Test
    void solutionSecond() {
        var startArray = new int[]{10, 3, 1};
        Task4.solution(startArray);
        assertArrayEquals(new int[]{1, 3, 10}, startArray);
    }

    @Test
    void solutionThird() {
        var startArray = new int[]{};
        Task4.solution(startArray);
        assertArrayEquals(new int[]{}, startArray);
    }

    @Test
    void solutionFourth() {
        var startArray = new int[]{10, 3, 1, 34, 145};
        Task4.solution(startArray);
        assertArrayEquals(new int[]{1, 3, 10, 34, 145}, startArray);
    }
}