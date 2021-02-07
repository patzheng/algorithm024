package com.eloancn.back.submitted.algorithm.les1;

import com.alibaba.fastjson.JSON;

/**
 * @author zhengdalong
 * @version V1.0
 * @date 2021/1/27 6:31 PM
 */
public class MergeTwoLists {

  static class ListNode {

    int val;

    ListNode next;

    ListNode(int x) {
      val = x;
    }

    public int getVal() {
      return val;
    }

    public void setVal(int val) {
      this.val = val;
    }

    public ListNode getNext() {
      return next;
    }

    public void setNext(ListNode next) {
      this.next = next;
    }
  }

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if (l1 == null) {
      return l2;
    } else if (l2 == null) {
      return l1;
    } else if (l1.val <= l2.val) {
      l1.next = mergeTwoLists(l1.next, l2);
      return l1;
    } else {
      l2.next = mergeTwoLists(l2.next, l1);
      return l2;
    }
  }

  public static void main(String[] args) {
    MergeTwoLists linkedSort = new MergeTwoLists();

    ListNode left = new ListNode(1);
    left.next = new ListNode(2);
    left.next.next = new ListNode(4);

    ListNode right = new ListNode(1);
    right.next = new ListNode(3);
    right.next.next = new ListNode(4);

    ListNode result = linkedSort.mergeTwoLists(left, right);

    System.out.println(JSON.toJSONString(result));
  }

}
