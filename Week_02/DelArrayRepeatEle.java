package com.eloancn.back.submitted.algorithm.les1;

import com.alibaba.fastjson.JSON;

/**
 * @author zhengdalong
 * @version V1.0
 * @date 2021/1/27 8:56 PM
 */
public class DelArrayRepeatEle {

  public static void main(String[] args) {
    int[] array = new int[]{1, 1, 2};
    System.out.println(JSON.toJSONString(array));
    DelArrayRepeatEle delArrayRepeatEle = new DelArrayRepeatEle();
    int size = delArrayRepeatEle.removeDuplicates(array);
    System.out.println(size + JSON.toJSONString(array));
  }

  /**
   * 删除排序数组中的重复项
   */
  public int removeDuplicates(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
      if (nums[j] != nums[i]) {
        i++;
        nums[i] = nums[j];
      }
    }
    return i;
  }

}
