package com.famous.algorithm.week4;

import java.util.Arrays;

/**
 * @author zhengdalong
 * @version V1.0
 * @date 2021/2/28 11:00 PM
 */
public class AssignCookies {

  /**
   * 利用排序
   */
  public int findContentChildren(int[] g, int[] s) {
    //排序
    Arrays.sort(g);
    Arrays.sort(s);

    int count = 0;
    for (int i = 0; count < g.length && i < s.length; i++) {
      //如果当前饼干能满足当前孩子的胃口值，count就加1，否则就继续查找更大的饼干
      if (g[count] <= s[i]) {
        count++;
      }
    }
    return count;
  }
}
