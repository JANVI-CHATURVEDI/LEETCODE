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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
       int msum=Integer.MIN_VALUE; int maxlevel = 0;

      que.add(root);
      int currLevel=1;

      while(!que.isEmpty()){
        int n =que.size();
        int sum =0;

        for(int i=1 ; i<=n ; i++){
             TreeNode node = que.poll();
                sum += node.val;

                if( node.left != null) que.add(node.left);
                 if( node.right != null) que.add(node.right);
        }

        if (sum > msum) {
                msum = sum;
                maxlevel = currLevel;
            }

            currLevel++;
      }
       
      return maxlevel;
    }
}