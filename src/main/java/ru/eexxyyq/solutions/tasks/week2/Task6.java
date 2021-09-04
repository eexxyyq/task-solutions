package ru.eexxyyq.solutions.tasks.week2;

import java.util.ArrayList;
import java.util.List;

/**
 * You are given a sorted unique integer array nums.
 * Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.
 * Each range [a,b] in the list should be output as:
 * "a->b" if a != b
 * "a" if a == b
 */
public class Task6 {

    public static List<String> solution(int[] nums) {
        var list = new ArrayList<String>();
        for (int i = 0; i < nums.length; i++) {
            var sb = new StringBuilder();
            sb.append(nums[i]);
            int index = i;
            while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1]) {
                i++;
            }
            if (i != index) {
                sb.append("->").append(nums[i]);
            }
            list.add(sb.toString());
        }
        return list;
    }
}
