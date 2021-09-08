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

    private static int solutionKMP(String haystack, String needle) {
        int[] pi = new int[needle.length()];
        int i = 1;
        int j = 0;
        pi[0] = 0;
        while (i < pi.length) {
            if (needle.charAt(i) != needle.charAt(j)) {
                if (j == 0) {
                    pi[i++] = 0;
                } else {
                    j = pi[j - 1];
                }
            } else {
                pi[i] = j + 1;
                j++;
                i++;
            }
        }
        int k = 0;
        int l = 0;
        while (k < haystack.length()) {
            if (haystack.charAt(k) == needle.charAt(l)) {
                l++;
                k++;
                if (l == needle.length()) {
                    return k - l;
                }
            } else {
                if (l == 0) {
                    k++;
                    if (k == haystack.length()) {
                        return -1;
                    }
                } else {
                    l = pi[l - 1];
                }
            }
        }
        return -1;
    }

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
