package com.eloancn.back.submitted.algorithm.les1;

import cn.hutool.core.util.RandomUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author zhengdalong
 * @version V1.0
 * @date 2021/1/27 9:10 PM
 */
public class MoveZeroes {

  public void moveZeroes(int[] nums) {
    int k = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        nums[k++] = nums[i];
      }
    }
    for (int i = k; k < nums.length; k++) {
      nums[k] = 0;
    }
  }


  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    IntStream.range(0, 10).forEach(i ->
        list.add(RandomUtil.randomInt(0, 100))
    );

    int[] array = list.stream().mapToInt(i -> i).toArray();
    MoveZeroes moveZeroes = new MoveZeroes();
    moveZeroes.moveZeroes(array);
  }

}
