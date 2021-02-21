package com.eloancn.back.submitted.algorithm.les3;

import java.util.Arrays;

/**
 * @author zhengdalong
 * @version V1.0
 * @date 2021/2/21 7:40 PM
 */
public class TreeBuild {

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

  public TreeNode buildTree(int[] preorder, int[] inorder) {
    if (preorder.length == 0 || inorder.length == 0) {
      return null;
    }

    TreeNode root = new TreeNode(preorder[0]);

    for (int i = 0; i < preorder.length; ++i) {
      if (preorder[0] == inorder[i]) {
        int[] pre_left = Arrays.copyOfRange(preorder, 1, i + 1);

        int[] pre_right = Arrays.copyOfRange(preorder, i + 1, preorder.length);

        int[] in_left = Arrays.copyOfRange(inorder, 0, i);
        int[] in_right = Arrays.copyOfRange(inorder, i + 1, inorder.length);

        root.left = buildTree(pre_left, in_left);
        root.right = buildTree(pre_right, in_right);
        break;
      }
    }
    return root;
  }

}
