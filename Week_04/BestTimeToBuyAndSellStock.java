package com.famous.algorithm.week4;

/**
 * @author zhengdalong
 * @version V1.0
 * @date 2021/2/28 10:56 PM
 */
public class BestTimeToBuyAndSellStock {

  private int res;

  /**
   * 贪心算法
   */
  public int maxProfit(int[] prices) {
    int profit = 0;
    for (int i = 1; i < prices.length; i++) {
      int tmp = prices[i] - prices[i - 1];
      if (tmp > 0) {
        profit += tmp;
      }
    }
    return profit;
  }
}
