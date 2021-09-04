package ru.eexxyyq.solutions.tasks.week2;

/**
 * Дано N - натуральное. Найти число m <= N такое, что у него максимальное число простых делителей.
 * Если таких чисел несколько, вывести любое.
 * N <= 10^18
 */
public class Task4 {

    public static long solution(long n) {
        if (n <= 1) {
            return 0;
        }
        long compute = 1;
        for (long i = 2; i <= Math.sqrt(n) + 1; i++) {
            if (isSimple(i)) {
                if (compute * i > n || compute * i < 0) {
                    return compute;
                }
                compute *= i;
            }
        }
        return compute;
    }

    private static boolean isSimple(long x) {
        if (x < 2) {
            return false;
        }
        if (x == 2) {
            return true;
        }
        long start = 2;
        long end = (long) Math.sqrt(x) + 1;
        while (start <= end) {
            if (x % start == 0 && x != start) {
                return false;
            }
            start++;
        }
        return true;
    }
}
