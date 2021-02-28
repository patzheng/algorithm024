package com.famous.algorithm.week4;

/**
 * @author zhengdalong
 * @version V1.0
 * @date 2021/2/28 11:09 PM
 */
public class FindMinimumInRotatedSortedArray {

  public int findMin(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] > nums[i + 1]) {
        return nums[i + 1];
      }
    }
    return nums[0];
  }
}
