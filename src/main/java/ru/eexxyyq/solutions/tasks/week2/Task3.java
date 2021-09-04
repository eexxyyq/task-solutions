package ru.eexxyyq.solutions.tasks.week2;

/**
 * Дана строка, состоящая из слов, разделённых пробелами. Пробелов между словами может быть более одного.
 * Вывести ту же строку, только слова в ней должны быть перевёрнуты. Время O(N)
 */
public class Task3 {

    public static String solution(String s) {
        var sb = new StringBuilder();
        var start = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (start != -1) {
                    for (int j = i - 1; j >= start ; j--) {
                        sb.append(s.charAt(j));
                    }
                    sb.append(' ');
                    start = -1;
                } else {
                    sb.append(' ');
                }
            } else {
                if (start == -1) {
                    start = i;
                }
            }
        }
        if (start != -1) {
            for (int j = s.length() - 1; j >= start; j--) {
                sb.append(s.charAt(j));
            }
        }
        return sb.toString();
    }
}
