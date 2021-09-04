package ru.eexxyyq.solutions.tasks.week1;

import java.util.Set;

/**
 * Дана строка.
 * Нужно узнать, сколько в ней подстрок, состоящих только из символов {a, b, c, s, x, y, z}
 */
public class Task6 {

    public static int solution(String str) {
        Set<Character> set = Set.of('a', 'b', 'c', 's', 'x', 'y', 'z');
        int counter = 0;
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (set.contains(str.charAt(i))) {
                counter++;
            } else {
                result += counter * (counter + 1) / 2;
                counter = 0;
            }
        }
        result += counter * (counter + 1) / 2;
        return result;
    }
}
