package ru.eexxyyq.solutions.tasks.week2;

/**
 * Дана матрица n*n.
 * 0 - вода
 * 1 - остров
 * Если две соседнии ячейки 1 - это один остров
 * [ [1,0]
 *   [0,1] ] - вернет 2
 * [ [1,1]
 *   [0,1] ] - вернет 1
 * [ [0,1]
 *   [0,1] ] - вернет 1
 *
 */
public class Task8 {

    public static int solution(int[][] desk) {
        if (desk.length == 0 || desk[0].length == 0) {
            return 0;
        }
        int count = 0;
        int height = desk.length;
        int width = desk[0].length;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (desk[i][j] == 1) {
                    checkVisit(desk, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private static void checkVisit(int[][] desk, int i, int j) {
        desk[i][j] = -1;
        if (i + 1 < desk.length && desk[i + 1][j] == 1) {
            checkVisit(desk, i + 1, j);
        }
        if (j + 1 < desk[0].length && desk[i][j + 1] == 1) {
            checkVisit(desk, i, j + 1);
        }
        if (j - 1 >= 0 && desk[i][j - 1] == 1) {
            checkVisit(desk, i, j - 1);
        }
        if (i - 1 >= 0 && desk[i - 1][j] == 1) {
            checkVisit(desk, i - 1, j);
        }
    }

}
