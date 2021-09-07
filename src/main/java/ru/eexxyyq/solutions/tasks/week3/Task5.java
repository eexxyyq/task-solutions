package ru.eexxyyq.solutions.tasks.week3;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * 349. Intersection of Two Arrays
 * Given two integer arrays nums1 and nums2,
 * return an array of their intersection.
 * Each element in the result must be unique
 * and you may return the result in any order.
 */
public class Task5 {

    public static int[] intersection(int[] nums1, int[] nums2) {
        var compute = new int[1001];
        for (var i : nums1) {
            compute[i]++;
        }
        var list = new ArrayList<Integer>();
        for (var i : nums2) {
            if (compute[i] > 0) {
                list.add(i);
                compute[i] = 0;
            }
        }
        var result = new int[list.size()];
        var idx = 0;
        for (var i : list) {
            result[idx++] = i;
        }
        return result;
    }
}
