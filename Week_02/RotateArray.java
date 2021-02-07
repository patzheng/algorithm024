package com.eloancn.back.submitted.algorithm.les1;

import com.alibaba.fastjson.JSON;

/**
 * @author zhengdalong
 * @version V1.0
 * @date 2021/1/28 11:33 AM
 */
public class RotateArray {

  public static void main(String[] args) {
    int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
    System.out.println(JSON.toJSONString(array));
    RotateArray rotateArray = new RotateArray();
    rotateArray.rotate(array, 3);
    System.out.println(JSON.toJSONString(array));
  }

  public void rotate(int[] nums, int k) {
    if (nums == null) {
      return;
    }

    int length = nums.length;
    if (length == 0) {
      return;
    }

    if (k <= 0) {
      return;
    }

    int steps = k % length;
    if (steps == 0) {
      return;
    }

    k = steps;
    if (k <= 0) {
      return;
    }
    int[] newArrays = new int[length];
    for (int i = 0; i < nums.length; i++) {
      int newIndex = (i + steps) % length;
      newArrays[newIndex] = nums[i];
    }

    for (int i = 0; i < newArrays.length; i++) {
      nums[i] = newArrays[i];
    }
  }

}
