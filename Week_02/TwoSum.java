package com.eloancn.back.submitted.algorithm.les2;

import com.alibaba.fastjson.JSON;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhengdalong
 * @version V1.0
 * @date 2021/1/27 10:48 PM
 */
public class TwoSum {

  public static void main(String[] args) {
    int[] nums = new int[]{2, 5, 5, 1};
    TwoSum twoSum = new TwoSum();
    int[] result = twoSum.twoSum(nums, 10);
    System.out.println(JSON.toJSONString(result));

  }

  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> temp = new HashMap<>();
    int[] result = new int[2];

    for (int i = 0; i < nums.length; i++) {
      int num = nums[i];

      int need = target - num;

      Integer value = temp.get(need);
      if (value != null) {
        result[0] = value;
        result[1] = i;
        break;
      } else {
        temp.put(num, i);
      }
    }
    return result;
  }
}
