package com.famous.algorithm.week4;

/**
 * @author zhengdalong
 * @version V1.0
 * @date 2021/2/28 11:14 PM
 */
public class jumpGame2 {

  public int jump(int[] nums) {
    int n = nums.length;
    int[] f = new int[n];
    for (int i = 0, last = 0; i < n; i++) {
      if (i == 0) {
        f[i] = 0;
      } else {
        while (last < n && last + nums[last] < i) {
          last++;
        }
        f[i] = f[last] + 1; // 使用第一个能到i的点更新f[i]
      }
    }
    return f[n - 1];
  }
}
