package com.famous.algorithm.week4;

/**
 * @author zhengdalong
 * @version V1.0
 * @date 2021/2/25 2:18 PM
 */
public class LemonadeChange {

  int five;

  int ten;

  int twenty;

  public boolean lemonadeChange(int[] bills) {
    for (int bill : bills) {
      if (bill == 5) {
        five++;
      }
      if (bill == 10) {
        if (five == 0) {
          return false;
        }
        ten++;
        five--;
      }
      if (bill == 20) {
        if (ten > 0 && five > 0) {
          ten--;
          five--;
        } else if (five > 3) {
          five -= 3;
        } else {
          return false;
        }
      }

    }
    return true;
  }
}
