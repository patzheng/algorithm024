package com.eloancn.back.submitted.algorithm.les3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author zhengdalong
 * @version V1.0
 * @date 2021/2/21 7:42 PM
 */
public class AllCombine {

  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> res = new ArrayList<List<Integer>>();

    List<Integer> output = new ArrayList<Integer>();
    for (int num : nums) {
      output.add(num);
    }

    int n = nums.length;
    backtrack(n, output, res, 0);
    return res;
  }

  public void backtrack(int n, List<Integer> output, List<List<Integer>> res, int first) {
    // 所有数都填完了
    if (first == n) {
      res.add(new ArrayList<>(output));
    }
    for (int i = first; i < n; i++) {
      // 动态维护数组
      Collections.swap(output, first, i);
      // 继续递归填下一个数
      backtrack(n, output, res, first + 1);
      // 撤销操作
      Collections.swap(output, first, i);
    }
  }

}