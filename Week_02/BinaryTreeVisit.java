package com.eloancn.back.submitted.algorithm.les2;

import java.util.ArrayList;
import java.util.List;

/**
 * N 叉树的前序遍历（
 *
 * @author zhengdalong
 * @version V1.0
 * @date 2021/2/3 11:23 AM
 */
public class BinaryTreeVisit {

  public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }

  List<Integer> res = new ArrayList<Integer>();

  public List<Integer> inorderTraversal(TreeNode root) {
    if (root != null) {
      inorderTraversal(root.left);
      res.add(root.val);
      inorderTraversal(root.right);
    }
    return res;
  }

}
