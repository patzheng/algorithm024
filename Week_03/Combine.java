package com.eloancn.back.submitted.algorithm.les3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhengdalong
 * @version V1.0
 * @date 2021/2/21 7:42 PM
 */
public class Combine {

  private List<List<Integer>> ans = new ArrayList<>();

  public List<List<Integer>> combine(int n, int k) {
    getCombine(n, k, 1, new ArrayList<>());
    return ans;
  }

  public void getCombine(int n, int k, int start, List<Integer> list) {
    if (k == 0) {
      ans.add(new ArrayList<>(list));
      return;
    }
    for (int i = start; i <= n - k + 1; i++) {
      list.add(i);
      getCombine(n, k - 1, i + 1, list);
      list.remove(list.size() - 1);
    }
  }

}