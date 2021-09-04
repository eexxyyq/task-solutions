package ru.eexxyyq.solutions.tasks.week2;

/**
 * Given an unsorted integer array nums, return the smallest missing positive integer.
 * You must implement an algorithm that runs in O(n) time and uses constant extra space.
 * Input: nums = [1,2,0]
 * Output: 3
 */
public class Task10 {

    public static int solution(int[] arr) {
        var compute = new int[500001];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] < compute.length) {
                compute[arr[i]]++;
            }
        }
        for (int i = 1; i < 500001; i++) {
            if (compute[i] == 0) {
                return i;
            }
        }
        return compute.length;
    }

}
