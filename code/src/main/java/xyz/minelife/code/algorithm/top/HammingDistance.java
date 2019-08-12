package xyz.minelife.code.algorithm.top;

import java.util.ArrayList;
import java.util.List;

import xyz.minelife.code.util.CollectionUtil;
import xyz.minelife.code.util.StringUtil;

/**
 * description: https://leetcode-cn.com/problems/hamming-distance/
 * created by salen on 2019/8/7
 * blog: https://www.minelife.xyz
 */
public class HammingDistance {
    public static void main(String[] args) {
        int result = hammingDistance(1, 4);
        StringUtil.println(result);
    }

    public static int hammingDistance(int x, int y) {
        int n = x ^ y;
        //思想：用1（1自身左移运算，其实后来就不是1了）和n的每位进行位与，来判断1的个数
        int count = 0;
        int flag = 1;
        while (flag != 0) {
            if ((n & flag) != 0) {
                count++;
            }
            flag = flag << 1;
            StringUtil.println(flag);
        }
        return count;
    }
}
