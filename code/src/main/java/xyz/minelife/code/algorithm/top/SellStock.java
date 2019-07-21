package xyz.minelife.code.algorithm.top;


import xyz.minelife.code.util.StringUtil;

/**
 * description: leetcode https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 * created by salen on 2019/7/20
 * blog: https://www.minelife.xyz
 */
public class SellStock {
    public static void main(String[] args) {
//        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] prices = {2, 4, 1};
        int result = maxProfit(prices);
        StringUtil.println(result);
    }

    /**
     * 需求：利益最大化
     * 规则：卖出价格需要大于买入价格，假如股市后续价格都大于买入价格，则不卖，即收益0
     * 结题思路：
     * 1. 定义一个变量为 最小买入价格
     * 2. 定义一个变量为 最大买入价格，需要在买入之后
     * 3. 如何确定买入是最小的？
     */


    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int buyPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            int currPrice = prices[i];
            // 如果买入价格大于当前价格 则 重置买入价格
            // 否则 重置卖入价格，并计算当前 利益
            if (buyPrice > currPrice) {
                buyPrice = currPrice;
            } else {
                // 如果当前利益大于 当前最大利益则重置 当前最大利益
                if (currPrice - buyPrice > maxProfit) {
                    maxProfit = currPrice - buyPrice;
                }
            }
        }

        return maxProfit;
    }


}
