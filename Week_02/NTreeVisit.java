package com.eloancn.back.submitted.algorithm.les2;

import java.util.ArrayList;
import java.util.List;

/** N 叉树的前序遍历（
 * @author zhengdalong
 * @version V1.0
 * @date 2021/2/3 11:23 AM
 */
public class NTreeVisit {

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

  List<Integer> res = new ArrayList<Integer>();

  public List<Integer> preorder(Node root) {
    if (root == null) {
      return res;
    }
    res.add(root.val);

    for (Node node : root.children) {
      preorder(node);
    }
    return res;
  }


}
