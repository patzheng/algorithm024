package com.eloancn.back.submitted.algorithm.les1;

import com.alibaba.fastjson.JSON;

/**合并两个有序数组
 * @author zhengdalong
 * @version V1.0
 * @date 2021/1/27 6:31 PM
 */
public class MergeTwoLists2 {

  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int[] x = new int[m + n];
    int left = 0;
    int rigjt = 0;
    int p = 0;

    while (left < m && rigjt < n) {
      int leftValue = nums1[left];
      int rightValue = nums2[rigjt];
      if (leftValue <= rightValue) {
        x[p] = leftValue;
        left++;
      } else {
        x[p] = rightValue;
        rigjt++;
      }
      p++;
    }

    while (left < m) {
      x[p++] = nums1[left++];
    }
    while (rigjt < n) {
      x[p++] = nums2[rigjt++];
    }
    for (int i = 0; i < p; i++) {
      nums1[i] = x[i];
    }

  }

  public static void main(String[] args) {
    MergeTwoLists2 linkedSort = new MergeTwoLists2();

    int[] a = new int[]{1, 2, 3, 0, 0, 0};

    int[] b = new int[]{2, 5, 6};

    System.out.println(JSON.toJSONString(a));

    linkedSort.merge(a, 3, b, 3);

    System.out.println(JSON.toJSONString(a));
  }

}
