package ru.eexxyyq.solutions.tasks.week3;

import java.util.LinkedList;

/**
 * "Неправильная скобочная последовательность".
 * Есть строка -  последовательность скобок.
 * Возможные элементы: [,],(,).
 * Каждая открывающая скобка(неважно квадратная или круглая,
 * закрывается любой закрывающей(квадратной или круглой). Выяснить, является ли данная на вход строка
 * неправильной скобочной последовательностью. Ограничение O(N)
 */
public class Task6 {

    public static boolean isValidSequenceWithoutTypes(String str) {
        if (str == null || str.isBlank() || str.isEmpty()) {
            return false;
        }
        int balancer = 0;
        for (int i = 0; i < str.length(); i++) {
            var ch = str.charAt(i);
            if (ch == '(' || ch == '[') {
                balancer++;
            } else {
                balancer--;
                if (balancer < 0) {
                    return false;
                }
            }
        }
        return balancer == 0;
    }

    public static boolean isValidSequence(String str) {
        if (str == null || str.isBlank() || str.isEmpty()) {
            return false;
        }
        var stack = new LinkedList<Character>();
        for (int i = 0; i < str.length(); i++) {
            var ch = str.charAt(i);
            if (ch == '(' || ch == '[') {
                stack.add(ch);
            }
            if (stack.isEmpty()) {
                return false;
            }
            if (ch == ']' && stack.removeLast() != '[') {
                return false;
            }
            if (ch == ')' && stack.removeLast() != '(') {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
