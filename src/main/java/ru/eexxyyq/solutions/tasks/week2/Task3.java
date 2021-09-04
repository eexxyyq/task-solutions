package ru.eexxyyq.solutions.tasks.week2;

/**
 * На болоте есть n островков, выстроенных в линию. Лягушка находится на первом, но хочет попасть на последний.
 * Дан массив из n-1 натуральных чисел - расстояние в метрах между островками. Лягушка может прыгать на k метров.
 * Найти минимальное количество прыжков, которое надо сделать лягушке.
 * N <= 10^6
 */
public class Task3 {

    public static int solution(int[] arr, int k) {
        if (arr.length == 0) {
            return -1;
        }
        int result = 0;
        int sum = 0;
        int index = 0;
        while (index < arr.length) {
            if (arr[index] > k) {
                return -1;
            }
            if (sum <= k) {
                sum += arr[index];
                if (sum <= k) {
                    index++;
                }
            } else {
                result++;
                sum = 0;
            }
        }
        if (sum != 0) {
            result++;
        }
        return result;
    }
}
