package xyz.minelife.code.algorithm.top;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * description:
 * created by salen on 2019/7/22
 * blog: https://www.minelife.xyz
 */
public class MajorityNum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 4, 8, 11, -1, 5};
        int result = majorityElement(nums);
        System.out.println(result);
    }

    public static int majorityElement(int[] nums) {

        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("nums is invalid");
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (map.containsKey(val)) {
                map.put(val, map.get(val) + 1);
            } else {
                map.put(val, 1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entrySet =  map.entrySet();
        int half = nums.length / 2;
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            if (entry.getValue() > half) {
                return entry.getKey();
            }
        }
        throw new IllegalArgumentException("cannot find two majorityElement from nums array");

    }

}
