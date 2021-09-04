package ru.eexxyyq.solutions.tasks.week1;

import org.apache.commons.lang3.StringUtils;

import java.util.Set;

/**
 * На вход дана строка из строчных латинских букв.
 * Вывести 'YES', если в ней можно переставить буквы таким образом, чтобы она стала палиндромом.
 * И 'NO' в противном случае.
 */
public class Task7 {

    public static String solution(String str) {
        if (StringUtils.isEmpty(str)) {
            return "NO";
        }
        int[] compute = new int[(int) 'z' - 'a' + 1];
        for (int i = 0; i < str.length(); i++) {
            compute[(int) str.charAt(i) - 'a']++;
        }
        int counter = 0;
        for (int i : compute) {
            if (i % 2 != 0) {
                counter++;
            }
        }

        if (counter > 1) {
            return "NO";
        } else {
            return "YES";
        }
    }
}
