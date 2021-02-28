package com.famous.algorithm.week4;

/**
 * @author zhengdalong
 * @version V1.0
 * @date 2021/2/28 11:07 PM
 */
public class JumpGame {

  public boolean canJump(int[] nums) {
    //记录能抵达终点的最小下标
    int minFlag = nums.length - 1;
    for (int i = nums.length - 2; i >= 1; i--) {
      //能抵达最小下标时，交换下标
      if (i + nums[i] >= minFlag) {
        minFlag = i;
      }
    }
    //判断起始点能否抵达最小下标，能则返回true，反之
    if (nums[0] >= minFlag) {
      return true;
    }
    return false;
  }

}
