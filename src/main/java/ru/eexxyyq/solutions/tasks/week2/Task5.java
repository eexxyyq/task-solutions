package ru.eexxyyq.solutions.tasks.week2;

import java.util.Arrays;

/**
 * 6) (Со звёздочкой *) Конь хочет на свободу.
 * Он двигается по доске n*n, по границам которой проведены координатные оси.
 * Начинает с клетки (0,0). Ходит буквой Г(как в шахматах), причём только вперёд
 * (то есть каждая из координат может только увеличиться в результате хода).
 * Для каждой точки мы знаем натуральное число - количество сил, которое конь оставит, попав в неё.
 * Конь достигает свободу, попав в любую клетку на границе доски.
 * Найти число - минимальное количество сил, которое конь может потратить чтобы выбраться на свободу.
 */
public class Task5 {

    public static int solution(int[][] desk) {
        if (desk.length < 2 || desk[0].length < 2) {
            return -1;
        }
        for (int i = 0; i < desk.length; i++) {
            for (int j = 0; j < desk[i].length; j++) {
                if (i + j == 0) {
                    continue;
                }
                var firstPred = i - 2 >= 0 && j - 1 >= 0 && desk[i - 2][j - 1] != -1;
                var secondPred = i - 1 >= 0 && j - 2 >= 0 && desk[i - 1][j - 2] != -1;
                if (firstPred || secondPred) {
                    if (firstPred && !secondPred) {
                        desk[i][j] += desk[i - 2][j - 1];
                    }
                    if (!firstPred && secondPred) {
                        desk[i][j] += desk[i - 1][j - 2];
                    }
                    if (firstPred && secondPred) {
                        desk[i][j] += Math.min(desk[i - 1][j - 2], desk[i - 2][j - 1]);
                    }
                } else {
                    desk[i][j] = -1;
                }
            }
        }
        for (var ar : desk) {
            System.out.println(Arrays.toString(ar));
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < desk[0].length; i++) {
            if (desk[desk.length - 1][i] != -1) {
                min = Math.min(min, desk[desk.length - 1][i]);
            }
        }
        for (int i = 0; i < desk.length; i++) {
            if (desk[i][desk[i].length - 1] != -1) {
                min = Math.min(min, desk[i][desk[i].length - 1]);
            }
        }
        return min;
    }
}
