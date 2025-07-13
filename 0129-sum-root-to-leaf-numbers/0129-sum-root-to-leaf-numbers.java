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
class Solution {

    int totalsum =0 ;
    public int sumNumbers(TreeNode root) {
       
       helper(root , 0);

        return totalsum;
    }

    public void helper(TreeNode root, int currsum) {
        if (root == null) return;

        currsum = currsum * 10 + root.val;

        if (root.left == null && root.right == null) {
            totalsum += currsum;
            return;
        }

        helper(root.left, currsum);
        helper(root.right, currsum);
    }
}