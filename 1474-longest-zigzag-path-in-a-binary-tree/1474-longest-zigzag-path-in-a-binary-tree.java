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
    int maxPath = 0;

    // public void solve(TreeNode root, int left, int right) {
    //     if (root == null) return;

    //     maxPath = Math.max(maxPath, Math.max(left, right));

    //     solve(root.left, right + 1, 0);
    //     solve(root.right, 0, left + 1); 
    // }

    public int longestZigZag(TreeNode root) {
        // solve(root, 0, 0);

        solve(root ,0 ,true);
        solve(root , 0,false);
        return maxPath;
    }

    public void solve(TreeNode root , int steps , boolean isleft){
          if (root == null) return;
          
          maxPath = Math.max(maxPath, steps );
          if(isleft){
          solve(root.left , steps+1 ,false);
          solve(root.right ,1, true);
          }

          else{
            solve(root.left , 1 ,false);
          solve(root.right ,steps+1 , true );
          }
    }
}
