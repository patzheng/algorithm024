package com.eloancn.back.submitted.algorithm.les1;

/**
 * @author zhengdalong
 * @version V1.0
 * @date 2021/1/29 8:35 PM
 */
public class ListNodeSum {

  public class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    public ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode first = l1;
    ListNode second = l2;
    ListNode header = null;
    ListNode tail = null;
    int carry = 0;
    while (first != null || second != null) {
      if (first == null) {
        first = new ListNode(0);
      }
      if (second == null) {
        second = new ListNode(0);
      }
      int value = first.val + second.val + carry;
      carry = value / 10;
      ListNode listNode = new ListNode(value % 10);
      if (header == null) {
        header = listNode;
        tail = listNode;
      } else {
        tail.next = listNode;
        tail = listNode;
      }
      first = first.next;
      second = second.next;
    }
    if (carry > 0) {
      tail.next = new ListNode(carry);
    }
    return header;
  }
}
