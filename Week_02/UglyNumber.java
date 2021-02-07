package com.eloancn.back.submitted.algorithm.les2;

/**
 * @author zhengdalong
 * @version V1.0
 * @date 2021/1/27 10:48 PM
 */
public class UglyNumber {

  public int nthUglyNumber(int n) {
    int[] dp = new int[n];
    dp[0] = 1;

    int a = 0, b = 0, c = 0;

    for (int i = 1; i < n; i++) {
      int n2 = dp[a] * 2, n3 = dp[b] * 3, n5 = dp[c] * 5;
      dp[i] = Math.min(Math.min(n2, n3), n5);
      if (dp[i] == n2) {
        a++;
      }
      if (dp[i] == n3) {
        b++;
      }
      if (dp[i] == n5) {
        c++;
      }
    }
    return dp[n - 1];
  }
}
