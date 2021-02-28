package com.famous.algorithm.week4;

/**
 * @author zhengdalong
 * @version V1.0
 * @date 2021/2/28 11:08 PM
 */
public class SearchA2dMatrix {

  public boolean searchMatrix(int[][] matrix, int target) {
    if (matrix.length == 0 || matrix[0].length == 0) {
      return false;
    }
    int row = matrix.length;
    int col = matrix[0].length;
    // 可以理解为二维数组转换为一个一维数组，right就是最后一个元素。
    int left = 0, right = row * col - 1;

    while (left < right) {
      int mid = (left + right) >>> 1;
      if (matrix[mid / col][mid % col] < target) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }
    return matrix[left / col][left % col] == target;
  }
}
