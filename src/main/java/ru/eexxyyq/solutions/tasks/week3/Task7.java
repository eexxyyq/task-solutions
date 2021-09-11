package ru.eexxyyq.solutions.tasks.week3;

/**
 * Задача тяжёлой группы AA(Advanced Algorithms),
 * которая была у меня на собеседовании, и которую я сам решил с несколькими подсказками собеседующего.
 * Даны строки A и B, состоящие из строчных латинских букв.
 * Вывести одно число - сумму количеств вхождений строки B,
 * а так же всех её гибридов в строку A.
 * Гибридом строки Х является любая строка, получення перестановкой букв в строке Х. Время O(N).
 */
public class Task7 {

    public static void main(String[] args) {
        System.out.println(solution("aaaaaaa", "aa"));
    }
    public static int solution(String a, String b) {
        var result = 0;
        for (int i = 0; i < a.length() - b.length() +  1; i++) {
            var seq = new StringBuilder(a.substring(i, i + b.length()));
            for (int j = 0; j < b.length(); j++) {
                if (seq.indexOf(String.valueOf(b.charAt(j))) == -1) {
                    break;
                } else {
                    seq.deleteCharAt(seq.indexOf(String.valueOf(b.charAt(j))));
                }
                if (seq.isEmpty()) {
                    result++;
                }
            }
        }
        return result;
    }
}
