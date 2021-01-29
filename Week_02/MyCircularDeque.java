package com.eloancn.back.submitted.algorithm.les1;

/**
 * @author zhengdalong
 * @version V1.0
 * @date 2021/1/28 9:59 PM
 */
public class MyCircularDeque {

  public static void main(String[] args) {
    MyCircularDeque myCircularDeque = new MyCircularDeque(8);
    myCircularDeque.insertFront(5);
    myCircularDeque.getFront();
    myCircularDeque.isEmpty();
    myCircularDeque.deleteFront();
    myCircularDeque.insertLast(3);
    myCircularDeque.getRear();
    myCircularDeque.insertLast(7);
    myCircularDeque.insertFront(7);
    myCircularDeque.deleteLast();
    myCircularDeque.insertLast(4);
    myCircularDeque.isEmpty();
  }

  private int capacity;

  private int size;

  private Node first;

  private Node last;

  class Node {

    int value;
    Node next;
    Node prev;

    Node(int value) {
      this.value = value;
    }
  }

  /**
   * Initialize your data structure here. Set the size of the deque to be k.
   */
  public MyCircularDeque(int k) {
    this.capacity = k;
  }

  /**
   * Adds an item at the front of Deque. Return true if the operation is successful.
   */
  public boolean insertFront(int value) {
    if (isFull()) {
      return false;
    }
    Node node = new Node(value);

    if (isEmpty()) {
      first = node;
      last = node;
    } else {
      Node currentFirst = first;
      first = node;
      node.next = currentFirst;
      currentFirst.prev = node;
    }
    size++;
    return true;
  }

  /**
   * Adds an item at the rear of Deque. Return true if the operation is successful.
   */
  public boolean insertLast(int value) {
    if (isFull()) {
      return false;
    }

    Node node = new Node(value);
    if (first == null && last == null) {
      first = node;
      last = node;
    } else {
      Node currentLast = last;
      last = node;
      last.prev = currentLast;
      currentLast.next = node;
    }
    size++;
    return true;
  }

  /**
   * Deletes an item from the front of Deque. Return true if the operation is successful.
   */
  public boolean deleteFront() {
    if (isEmpty()) {
      return false;
    }

    Node next = first.next;
    if (next == null) {
      last = null;
    } else {
      next.prev = null;
      first.next = null;
    }
    first = next;

    size--;
    return true;
  }

  /**
   * Deletes an item from the rear of Deque. Return true if the operation is successful.
   */
  public boolean deleteLast() {
    if (isEmpty()) {
      return false;
    }

    Node prev = last.prev;
    if (prev == null) {
      first = null;
      last = null;
    } else {
      prev.next = null;
      last.prev = null;
    }

    last = prev;
    size--;
    return true;
  }

  /**
   * Get the front item from the deque.
   */
  public int getFront() {
    return first == null ? -1 : first.value;
  }

  /**
   * Get the last item from the deque.
   */
  public int getRear() {
    return last == null ? -1 : last.value;
  }

  /**
   * Checks whether the circular deque is empty or not.
   */
  public boolean isEmpty() {
    return size == 0;
  }

  /**
   * Checks whether the circular deque is full or not.
   */
  public boolean isFull() {
    return size == capacity;
  }
}
