package ru.eexxyyq.solutions.tasks.week1;

/**
 * Найти количество простых чисел в отрезке [a, b].
 * a и b - натуральные от 1 до 1000000.
 * Время: n * корень из n
 */
public class Task5 {

    public static int solution(int start, int end) {
        int result = 0;
        for (int i = start; i <= end; i++) {
            if (isSimple(i)) {
                result++;
            }
        }
        return result;
    }

    private static boolean isSimple(int x) {
        if (x < 2) {
            return false;
        }
        int start = 2;
        int end = (int) Math.sqrt(x) + 1;
        while (start <= end) {
            if (x % start == 0 && x != start) {
                return false;
            }
            start++;
        }
        return true;
    }
}
