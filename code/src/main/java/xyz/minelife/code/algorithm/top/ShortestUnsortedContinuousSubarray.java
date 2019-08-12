package xyz.minelife.code.algorithm.top;

import java.util.Arrays;

import xyz.minelife.code.util.CollectionUtil;
import xyz.minelife.code.util.StringUtil;

/**
 * description: https://leetcode-cn.com/problems/shortest-unsorted-continuous-subarray/
 * created by salen on 2019/8/7
 * blog: https://www.minelife.xyz
 */
public class ShortestUnsortedContinuousSubarray {
    public static void main(String[] args) {
        int[] nums = {2, 6, 4, 8, 10, 9, 15};
        int result = shortestUnsortedContinuousSubarray(nums);
        StringUtil.println(result);
    }

    public static int shortestUnsortedContinuousSubarray(int[] nums) {

        int[] t = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            t[i] = nums[i];
        }
//        for (int i = 0; i < t.length - 1; i++) {
//            for (int j = 0; j < t.length - i - 1; j++) {
//                if (t[j] > t[j + 1]) {
//                    int temp = t[j];
//                    t[j] = t[j + 1];
//                    t[j + 1] = temp;
//                }
//            }
//        }
        Arrays.sort(t);
        CollectionUtil.printArr(t);
        CollectionUtil.printArr(nums);
        int start = -1;
        int end = -1;
        for (int i = 0; i < t.length; i++) {
            if (t[i] != nums[i]) {
                if (start == -1) {
                    start = i;
                }
                end = i;
            }
        }
        StringUtil.println("start = " + start + ", end = " + end + ", count = " + (end - start));
        if (start == -1) {
            return nums.length;
        }
        return end - start + 1;
    }
}
