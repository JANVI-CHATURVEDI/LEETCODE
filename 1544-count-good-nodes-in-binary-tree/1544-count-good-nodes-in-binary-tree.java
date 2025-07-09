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

    int good=0;
    public int goodNodes(TreeNode root) {
      

       int ans = match(root , root.val);
      
        return ans;

    }

    public int match(TreeNode root , int maxsofar){
         
          if (root == null) return 0;

          

          if(root.val >= maxsofar){
            good++;
          }

         

        int newMax = Math.max(maxsofar, root.val);

        match( root.left ,  newMax);
         match(root.right , newMax);

          return good;
    }
}