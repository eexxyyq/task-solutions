package ru.eexxyyq.solutions.tasks.week2;

/**
 * В массиве продубировать все четные числа
 * Дубликат встает сразу за оригиналом
 *
 * О(n) - time coplexity
 * O(1) - space complexity
 *
 */
public class Task9 {

    public static int[] solution(int[] arr) {
        if (arr == null) {
            return null;
        }
        var idx = arr.length - 1;
        for (int i = arr.length - 1; i >= 0 && idx > 0; i--) {
            if (arr[i] == -1) {
                i--;
                continue;
            }
            if (arr[i] % 2 == 0) {
                arr[idx--] = arr[i];
                arr[idx--] = arr[i];
            } else {
                arr[idx--] = arr[i];
            }
        }
        return arr;
    }

}
