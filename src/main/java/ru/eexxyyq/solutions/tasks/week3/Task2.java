package ru.eexxyyq.solutions.tasks.week3;

/**
 * 41. First Missing Positive
 * Given an unsorted integer array nums, return the smallest missing positive integer.
 * You must implement an algorithm that runs in O(n) time and uses constant extra space.
 */
public class Task2 {

    public static int firstMissingPositive(int[] nums) {
        var compose = new int[nums.length + 1];
        for (var i : nums) {
            if (i > 0 && i < compose.length) {
                compose[i]++;
            }
        }
        for (int i = 1; i < compose.length; i++) {
            if (compose[i] == 0) {
                return i;
            }
        }
        return compose.length;
    }
}
