/*

import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

 /*
class Solution {
  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int height = 0;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
      int size = queue.size();
      height++;
      while (size-- > 0) {
        TreeNode cur = queue.poll();
        if (cur.left != null) queue.offer(cur.left);
        if (cur.right != null) queue.offer(cur.right);
      }
    }
    return height;
  }
}



class Solution {
  public int maxDepth(TreeNode root) {
    if (root == null) {
        return 0;
    }
    return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
  }
}

*/