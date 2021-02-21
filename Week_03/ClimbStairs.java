package com.eloancn.back.submitted.algorithm.les3;

/**
 * @author zhengdalong
 * @version V1.0
 * @date 2021/2/20 6:33 PM
 */
public class ClimbStairs {

  public static int climbStairs(int n) {
    int first = 0;
    int second = 0;
    int third = 1;
    for (int i = 1; i < n; i++) {
      first = second;
      second = third;
      third = first + second;
      System.out.println("third" + third);
    }
    return third;
  }

  public static void main(String[] args) {
    int steps1 = climbStairs(1);
    int steps2 = climbStairs(2);
    int steps3 = climbStairs(3);
    System.out.println("steps1" + steps1 + "steps2" + steps2 + "steps3" + steps3);
  }
}
