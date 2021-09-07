package ru.eexxyyq.solutions.tasks.week3;

/**
 * 28. Implement strStr()
 * Implement strStr().
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * Clarification:
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 */
public class Task3 {

    public static int strStr(String haystack, String needle) {
        if (haystack.equals(needle) || needle.isBlank()) {
            return 0;
        }
        int result = -1;
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.startsWith(needle, i)) {
                result = i;
                break;
            }
        }
        return result;
    }
}
