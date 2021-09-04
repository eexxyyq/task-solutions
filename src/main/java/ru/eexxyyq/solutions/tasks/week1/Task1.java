package ru.eexxyyq.solutions.tasks.week1;

/**
 * Написать функцию, которая по строке определяет количество инверсий в ней.
 * Инверсия - когда больший символ стоит в строке раньше меньшего
 */
public class Task1 {

    public static int solution(String str) {
        int result = 0;
        char[] arr = str.toCharArray();
        int[] compute = new int[(int) ('z' - 'a' + 1)];
        for (int i = 0; i < arr.length; i++) {
            compute[arr[i] - 'a']++;
            for (int j = arr[i] + 1; j <= 'z'; j++) {
                result += compute[j - (int) 'a'];
            }
        }
        return result;
    }
}
