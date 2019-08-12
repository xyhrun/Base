package xyz.minelife.code.algorithm.top;

import java.util.ArrayList;
import java.util.List;

import xyz.minelife.code.util.CollectionUtil;

/**
 * description: https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array/comments/
 * created by salen on 2019/8/5
 * blog: https://www.minelife.xyz
 */
public class FindDisappearedNumbers {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 2, 3, 7, 8, 1};

        List<Integer> result = findDisappearedNumbers(nums);
        CollectionUtil.printList(result);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        // nums[nums[i]-1] 代表数组的第i个数出现过 出现过就把他变成负数，
        // 然后我们再遍历一遍数组中大于0的数字 下标加一就是我们消失的数字
        List<Integer> res = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
//            [-4,3,2,-7,8,2,-3,-1]
//            [-4,-3,-2,-7,8,2,-3,-1]
        }
        CollectionUtil.printArr(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res.add(i + 1);
            }
        }
        return res;

    }
}
