package com.eloancn.back.submitted.algorithm.les2;

import cn.hutool.core.util.RandomUtil;
import com.alibaba.fastjson.JSON;
import java.util.stream.IntStream;

/**
 * @author zhengdalong
 * @version V1.0
 * @date 2021/2/2 6:10 PM
 */
public class HeapSort2 {

  /**
   * 固定系数
   */
  private final static int mod = 2;

  public HeapSort2() {

  }

  public void buildMaxHeap(double[] data) {
    int lastIndex = data.length - 1;
    int lastNoLeafNode = getParent(lastIndex);

    for (int i = lastNoLeafNode; i >= 0; i--) {
      upp(data, i, data.length - 1);
    }

    for (int i = data.length - 1; i > 0; i--) {
      swap(data, 0, i);
      upp(data, 0, i - 1);
    }
  }

  public void upp(double[] data, int index, int indexLimit) {

    int leftIndex = getLeft(index);
    int rightIndex = getRight(index);

    if (leftIndex > indexLimit) {
      return;
    }

    int maxIndex;
    Double maxValue;
    if (rightIndex > indexLimit) {
      maxIndex = leftIndex;
      maxValue = data[leftIndex];
    } else {
      maxIndex = data[leftIndex] > data[rightIndex] ? leftIndex : rightIndex;
      maxValue = data[maxIndex];
    }
    Double value = data[index];
    if (value < maxValue) {
      swap(data, index, maxIndex);
      //子节点继续判断
      upp(data, maxIndex, indexLimit);
    }
  }


  public int getParent(int i) {
    return (i - 1) / mod;
  }

  public int getLeft(int i) {
    return i * mod + 1;
  }

  public int getRight(int i) {
    return i * mod + 2;
  }

  private static void swap(double[] arr, int i, int j) {
    double temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void main(String[] args) {
    double[] data = new double[20];

    IntStream.range(0, 20).forEach(i -> {
      data[i] = RandomUtil.randomInt(0, 100);
    });

    System.out.println(JSON.toJSONString(data));

    HeapSort2 heapSort2 = new HeapSort2();
    heapSort2.buildMaxHeap(data);

    System.out.println(JSON.toJSONString(data));
  }
}
