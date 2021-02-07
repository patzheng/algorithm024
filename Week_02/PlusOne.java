package com.eloancn.back.submitted.algorithm.les1;

import com.alibaba.fastjson.JSON;

/**
 * @author zhengdalong
 * @version V1.0
 * @date 2021/1/28 3:54 PM
 */
public class PlusOne {

  public static void main(String[] args) {
    int[] digits = new int[]{8, 9, 9, 9};
    PlusOne plusOne = new PlusOne();
    plusOne.plusOne(digits);
    System.out.println(JSON.toJSONString(digits));
  }

  public int[] plusOne(int[] digits) {
    if (digits == null || digits.length == 0) {
      return digits;
    }
    int length = digits.length;
    for (int k = length - 1; k >= 0; k--) {
      digits[k]++;
      digits[k] = digits[k] % 10;
      if (digits[k] != 0) {
        return digits;
      }
    }

    digits = new int[digits.length + 1];
    digits[0] = 1;
    return digits;
  }

}
