package xyz.minelife.code.algorithm.top;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import xyz.minelife.code.util.CollectionUtil;

/**
 * description: leetcode https://leetcode-cn.com/problems/find-all-anagrams-in-a-string/
 * created by salen on 2019/7/8
 * blog: https://www.minelife.xyz
 */
//s: "cbaebabacd" p: "abc"

public class FindAllAnagramsString {
    public static void main(String[] args) {
        String s = "aaaaaaaaaaaaaaabaaaaaaaabcaaaaaaaaaaaabxcabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String p = "abc";
//
//        String s = "abab";
//        String p = "ab";

        System.out.println(s);
        System.out.println(p);
        List result = findAnagrams(s, p);
        CollectionUtil.printList(result);
    }

    public static List<Integer> findAnagrams(String s, String p) {
        if (s == null || s.length() == 0) {
            return Collections.EMPTY_LIST;
        }

        if (p == null || p.length() == 0) {
            return Collections.EMPTY_LIST;
        }

        if (s.length() < p.length()) {
            return Collections.EMPTY_LIST;
        }

        List<Integer> result = new ArrayList<>();
        String sortP = sortString(p);
        int pLength = p.length();
        if (s.length() == pLength) {
            if (s.equals(p)) {
                result.add(0);
                return result;
            }
        }

        for (int i = 0; i < s.length() - pLength + 1; i++) {
            String sub = sortString(s.substring(i, i + pLength));
            // 如果相等  代表属于异位字符串
            if (sub.equals(sortP)) {
                result.add(i);
            }
        }
        return result;
    }

    // 排序字符串
    public static String sortString(String string) {
        char[] chars = string.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }
}
