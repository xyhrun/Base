package xyz.minelife.code.algorithm.top;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * description: leetcode https://leetcode-cn.com/problems/two-sum/
 * created by salen on 2019/7/8
 * blog: https://www.minelife.xyz
 */
public class TwoNumbers {
    public static void main(String[] args) {
        int[] nums = {2, 7, 4, 8, 11, -1, 5};
        int[] result = twoSum(nums, 13);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("nums is invalid");
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("cannot find two numbers sum is target from nums array");
    }
}
