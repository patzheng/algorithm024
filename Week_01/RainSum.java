package com.eloancn.back.submitted.algorithm.les1;

import com.alibaba.fastjson.JSON;

/**
 * @author zhengdalong
 * @version V1.0
 * @date 2021/1/27 10:48 PM
 */
public class RainSum {

  public static void main(String[] args) {
    int[] nums = new int[]{1,3,1};

    RainSum twoSum = new RainSum();

    int result = twoSum.rainSum(nums);
    System.out.println(JSON.toJSONString(result));

  }

  public int rainSum(int[] height) {
    int sum = 0;
    int length = height.length;

    System.out.println("i:" + 0 + "x:" + 0);
    for (int i = 1; i < length - 1; i++) {
      int maxLeft = 0;
      for (int left = 0; left < i; left++) {
        maxLeft = Math.max(maxLeft, height[left]);
      }

      int maxRight = 0;
      for (int right = i + 1; right < length; right++) {
        maxRight = Math.max(maxRight, height[right]);
      }

      int min = Math.min(maxLeft, maxRight);

      int x = min - height[i];

      x = x > 0 ? x : 0;
      sum += x;
      System.out.println("i:" + i + "x:" + x);
    }
    System.out.println("i:" + length + "x:" + 0);
    return sum;
  }

}
