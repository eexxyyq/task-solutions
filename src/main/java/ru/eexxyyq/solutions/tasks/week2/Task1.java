package ru.eexxyyq.solutions.tasks.week2;

/**
 * Дан массив из n натуральных чисел и число k. Найти число пар чисел в массиве, модуль разности которых <=k
 * Вариант А) N <= 10^3. Решение за O(N^2)
 * Вариант Б) N <= 10^6. Числа - Long`и. Решение за O(N * logN)
 * Вариант С) N <= 10^6, числа в массиве <=10^6. Ограничение O(N)
 */
public class Task1 {

    public static int brutForce(int[] arr, int k) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) <= k) {
                    res++;
                }
            }
        }
        return res;
    }

    public static int solutionA(int[] arr, int k) {
        int result = 0;
        bubbleSort(arr);
        var j = 0;
        for (int i = 0; i < arr.length; i++) {
            while (j < arr.length && arr[j] - arr[i] <= k) {
                j++;
            }
            result += j - i - 1;
        }
        return result;
    }

    public static int solutionB(int[] arr, int k) {
        int result = 0;
        arr = mergeSort(arr);
        var j = 0;
        for (int i = 0; i < arr.length; i++) {
            while (j < arr.length && arr[j] - arr[i] <= k) {
                j++;
            }
            result += j - i - 1;
        }
        return result;
    }

    public static int solutionC(int[] arr, int k) {
        int result = 0;
        int[] compute = new int[1000001];
        for (int i = 0; i < arr.length; i++) {
            compute[arr[i]]++;
        }
        int index = 0;
        for (int i = 0; i < compute.length; i++) {
            for (int j = 0; j < compute[i]; j++) {
                arr[index++] = i;
            }
        }
        var j = 0;
        for (int i = 0; i < arr.length; i++) {
            while (j < arr.length && arr[j] - arr[i] <= k) {
                j++;
            }
            result += j - i - 1;
        }
        return result;
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    var tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    private static int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int index1 = 0;
        int index2 = 0;
        int indexResult = 0;
        while (index1 < arr1.length && index2 < arr2.length) {
            if (arr1[index1] < arr2[index2]) {
                result[indexResult] = arr1[index1];
                ++index1;
            } else {
                result[indexResult] = arr2[index2];
                ++index2;
            }
            ++indexResult;
        }
        while (index1 < arr1.length) {
            result[indexResult] = arr1[index1];
            ++index1;
            ++indexResult;
        }
        while (index2 < arr2.length) {
            result[indexResult] = arr2[index2];
            ++index2;
            ++indexResult;
        }
        return result;
    }

    private static int[] mergeSort(int[] array) {
        if (array.length < 2) {
            return array;
        }
        int[] firstHalf = new int[array.length / 2];
        int[] secondHalf = new int[array.length - array.length / 2];
        System.arraycopy(array, 0, firstHalf, 0, array.length / 2);
        System.arraycopy(array, array.length / 2, secondHalf, 0, array.length - array.length / 2);
        firstHalf = mergeSort(firstHalf);
        secondHalf = mergeSort(secondHalf);
        return merge(firstHalf, secondHalf);
    }
}
