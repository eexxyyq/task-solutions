package ru.eexxyyq.solutions.tasks.week1;

/**
 * Петя стоит у основания лестницы с n ступеньками.
 * На каждой ступеньке лежит a[i] монет.
 * Петя высокий, и делает шаг только на 2 ступеньки, либо на 3 вверх.
 * Какое максимальное количество монет Петя может собрать, ступив на последнюю ступеньку?
 */
public class Task3 {

    public static int solution(int[] arr) {
        if (arr.length < 2) {
            return 0;
        }
        if (arr.length == 2) {
            return arr[1];
        }
        int[] compute = new int[arr.length];
        compute[0] = Integer.MIN_VALUE;
        compute[1] = arr[1];
        compute[2] = arr[2];
        for (int i = 3; i < arr.length; i++) {
            compute[i] = arr[i] + Math.max(compute[i - 2], compute[i - 3]);
        }
        return compute[compute.length - 1];
    }
}
