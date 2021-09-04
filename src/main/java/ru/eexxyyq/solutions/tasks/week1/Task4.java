package ru.eexxyyq.solutions.tasks.week1;

/**
 * Дан массив из n чисел. 1 <= n <= 1000000.
 * Числа в массиве - целые от 1 до 1000.
 * Отсортировать его за линейное время.
 */
public class Task4 {

    public static void solution(int[] arr) {
        int[] compute = new int[1001];
        for (int i = 0; i < arr.length; i++) {
            compute[arr[i]]++;
        }
        int index = 0;
        for (int i = 0; i < compute.length; i++) {
            for (int j = 0; j < compute[i]; j++) {
                arr[index++] = i;
            }
        }
    }
}
