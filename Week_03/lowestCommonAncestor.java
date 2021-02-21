package com.eloancn.back.submitted.algorithm.les3;

/**
 * @author zhengdalong
 * @version V1.0
 * @date 2021/2/21 7:39 PM
 */
public class lowestCommonAncestor {

  public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null) {
      return root;
    }

    if (root == p || root == q) {
      return root;
    }
    TreeNode left = lowestCommonAncestor(root.left, p, q);

    TreeNode right = lowestCommonAncestor(root.right, p, q);

    if (left != null && right != null) {
      return root;
    } else if (left != null) {
      return left;
    } else if (right != null) {
      return right;
    }
    return null;
  }

}
