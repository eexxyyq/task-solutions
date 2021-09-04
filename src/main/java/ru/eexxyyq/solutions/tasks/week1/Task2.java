package ru.eexxyyq.solutions.tasks.week1;

/**
 * Дан массив из 0 и 1. Разрешается удалить из него любой элемент.
 * Какой максимальной длины подмассив из единиц мы можем получить в лучшем случае?
 */
public class Task2 {

    public static int solution(int[] arr) {
        int result = 0;
        int cur = 0;
        int pred = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                cur++;
            } else {
                result = Math.max(cur + pred, result);
                pred = cur;
                cur = 0;
            }
        }
        result = Math.max(cur + pred, result);
        return result;
    }
}
