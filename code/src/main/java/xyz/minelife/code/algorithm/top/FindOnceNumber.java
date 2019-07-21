package xyz.minelife.code.algorithm.top;


import xyz.minelife.code.util.StringUtil;

/**
 * description: leetcode https://leetcode-cn.com/problems/single-number/
 * created by salen on 2019/7/20
 * blog: https://www.minelife.xyz
 */
public class FindOnceNumber {
    public static void main(String[] args) {
        int[] nums = {7, 7, 6, 6, 1, 7, 7, 8, 9, 9, 8};
//        int[] nums = {2, 4, 1};
        int result = findOnceNumber(nums);
        StringUtil.println(result);
    }


    // 第一种方法
    // 执行用时 : 2 ms, 在所有 Java 提交中击败了69.08%的用户
    // 内存消耗 : 42.3 MB, 在所有 Java 提交中击败了26.47%的用户

    public static int findOnceNumber(int[] nums) {
        if (nums == null || nums.length <= 0) {
            throw new IllegalArgumentException("nums is invalid !");
        }
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }

    /* 第二种方法
      执行用时 : 24 ms, 在所有 Java 提交中击败了17%的用户
      内存消耗 : 45.8 MB, 在所有 Java 提交中击败了5%的用户
    public static int findOnceNumber(int[] nums) {

        if (nums == null || nums.length <= 0) {
            throw new IllegalArgumentException("nums is invalid !");
        }
        Map<Integer, Integer> map = new HashMap<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], 2);
            } else {
                map.put(nums[i], 1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entrySet =  map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        throw new IllegalArgumentException("can not find single number");
    }*/




}
