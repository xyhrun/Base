package xyz.minelife.code.algorithm.top;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * description: leetcode https://leetcode-cn.com/problems/two-sum/
 * created by salen on 2019/7/8
 * blog: https://www.minelife.xyz
 */
public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
//        int[] nums = {0,1,0,3,12};
        System.out.println(Arrays.toString(nums));
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    // 效率太低
//    public static void moveZeroes(int[] nums) {
//        if (nums == null || nums.length <= 0) {
//            throw new IllegalArgumentException("nums is invalid");
//        }
//
//        if (nums.length == 1) {
//            return;
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            boolean isOk = true;
//            for (int j = i; j < nums.length; j++) {
//                if (nums[j] != 0) {
//                    isOk = false;
//                }
//            }
//
//            if (nums[i] == 0 && !isOk) {
//                for (int j = i; j < nums.length - 1; j++) {
//                    nums[j] = nums[j + 1];
//                }
//                nums[nums.length - 1] = 0;
//                System.out.println(Arrays.toString(nums));
//                i--;
//            }
//        }
//    }

    public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length <= 0) {
            throw new IllegalArgumentException("nums is invalid");
        }

        int i = 0;
        int j = 0;

        // 把非0数字按照既有顺序放到数组前面，j的长度即为非0数字的个数
        while (i < nums.length) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
            i++;
        }
        // 剩余全为0，放到数组后面
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
    }
}
