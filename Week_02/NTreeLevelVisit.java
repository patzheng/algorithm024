package com.eloancn.back.submitted.algorithm.les2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * N 叉树的前序遍历（
 *
 * @author zhengdalong
 * @version V1.0
 * @date 2021/2/3 11:23 AM
 */
public class NTreeLevelVisit {

  class Node {

    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
      val = _val;
    }

    public Node(int _val, List<Node> _children) {
      val = _val;
      children = _children;
    }
  }

  List<List<Integer>> res = new ArrayList<>();

  public List<List<Integer>> levelOrder(Node root) {
    List<List<Integer>> result = new ArrayList<>();

    if (root == null) {
      return result;
    }

    Queue<Node> queue = new LinkedList<>();

    queue.add(root);
    while (!queue.isEmpty()) {
      List<Integer> subList = new ArrayList<>();
      int size = queue.size();

      for (int i = 0; i < size; i++) {
        Node node = queue.poll();
        subList.add(node.val);
        queue.addAll(node.children);
      }
      result.add(subList);
    }
    return result;
  }

}
