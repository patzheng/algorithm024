package com.eloancn.back.submitted.algorithm.les1;

import com.alibaba.fastjson.JSON;

/**
 * @author zhengdalong
 * @version V1.0
 * @date 2021/1/27 10:48 PM
 */
public class RainSum2 {

  public static void main(String[] args) {
    int[] nums = new int[]{1, 3, 1};
    RainSum2 twoSum = new RainSum2();

    int result = twoSum.rainSum(nums);
    System.out.println(JSON.toJSONString(result));

  }

  public int rainSum(int[] height) {
    if (height == null || height.length < 3) {
      return 0;
    }
    int length = height.length;

    int[] leftMax = new int[height.length];
    leftMax[0] = height[0];
    for (int i = 1; i < length; i++) {
      leftMax[i] = Math.max(height[i], leftMax[i - 1]);
    }

    int[] rightMax = new int[height.length];
    rightMax[length - 1] = height[length - 1];
    for (int i = length - 2; i >= 0; i--) {
      rightMax[i] = Math.max(height[i], rightMax[i + 1]);
    }
    int sum = 0;
    for (int i = 0; i < length; i++) {
      sum += Math.min(leftMax[i], rightMax[i]) - height[i];
    }
    return sum;
  }

}
