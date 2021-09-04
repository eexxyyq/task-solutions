package ru.eexxyyq.solutions.tasks.week2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void brutForce() {
        assertEquals(0, Task1.brutForce(new int[]{}, 1));
        assertEquals(3, Task1.brutForce(new int[]{1, 4, 5, 6}, 2));
        assertEquals(5, Task1.brutForce(new int[]{1, 3, 7, 9, 12}, 5));
        assertEquals(11, Task1.brutForce(new int[]{1, 3, 7, 9, 12, 1, 3}, 5));
        assertEquals(89, Task1.brutForce(new int[]{
                2, 3, 35, 243, 132, 5, 7, 45, 3, 645, 245, 1,
                4, 16, 17, 134, 123, 235, 65, 2, 1, 1432, 36,
                435, 134, 123, 546, 54, 6673, 3245, 14, 32, 54
        }, 15));
    }

    @Test
    void solutionA() {
        assertEquals(0, Task1.solutionA(new int[]{}, 1));
        assertEquals(3, Task1.solutionA(new int[]{1, 4, 5, 6}, 2));
        assertEquals(5, Task1.solutionA(new int[]{1, 3, 7, 9, 12}, 5));
        assertEquals(11, Task1.solutionA(new int[]{1, 3, 7, 9, 12, 1, 3}, 5));
        assertEquals(89, Task1.solutionA(new int[]{
                2, 3, 35, 243, 132, 5, 7, 45, 3, 645, 245, 1,
                4, 16, 17, 134, 123, 235, 65, 2, 1, 1432, 36,
                435, 134, 123, 546, 54, 6673, 3245, 14, 32, 54
        }, 15));
    }

    @Test
    void solutionB() {
        assertEquals(0, Task1.solutionB(new int[]{}, 1));
        assertEquals(3, Task1.solutionB(new int[]{1, 4, 5, 6}, 2));
        assertEquals(5, Task1.solutionB(new int[]{1, 3, 7, 9, 12}, 5));
        assertEquals(11, Task1.solutionB(new int[]{1, 3, 7, 9, 12, 1, 3}, 5));
        assertEquals(89, Task1.solutionB(new int[]{
                2, 3, 35, 243, 132, 5, 7, 45, 3, 645, 245, 1,
                4, 16, 17, 134, 123, 235, 65, 2, 1, 1432, 36,
                435, 134, 123, 546, 54, 6673, 3245, 14, 32, 54
        }, 15));
    }

    @Test
    void solutionC() {
        assertEquals(0, Task1.solutionC(new int[]{}, 1));
        assertEquals(3, Task1.solutionC(new int[]{1, 4, 5, 6}, 2));
        assertEquals(5, Task1.solutionC(new int[]{1, 3, 7, 9, 12}, 5));
        assertEquals(11, Task1.solutionC(new int[]{1, 3, 7, 9, 12, 1, 3}, 5));
        assertEquals(89, Task1.solutionC(new int[]{
                2, 3, 35, 243, 132, 5, 7, 45, 3, 645, 245, 1,
                4, 16, 17, 134, 123, 235, 65, 2, 1, 1432, 36,
                435, 134, 123, 546, 54, 6673, 3245, 14, 32, 54
        }, 15));
    }
}