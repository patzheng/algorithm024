package com.eloancn.back.submitted.algorithm.les1;

import com.alibaba.fastjson.JSON;

/**
 * @author zhengdalong
 * @version V1.0
 * @date 2021/1/27 10:48 PM
 */
public class RainSum3 {

  public static void main(String[] args) {
    int[] nums = new int[]{1, 3, 1};
    RainSum3 twoSum = new RainSum3();

    int result = twoSum.rainSum(nums);
    System.out.println(JSON.toJSONString(result));

  }

  public int rainSum(int[] height) {
    int left = 0;
    int right = height.length - 1;

    return -1;
  }

}
