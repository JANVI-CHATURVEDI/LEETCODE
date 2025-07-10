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
        int currlevel = 1;int maxlevel = 1;int maxsum=Integer.MIN_VALUE;
       Queue <TreeNode> que = new LinkedList<>();
       que.add(root);

        while(!que.isEmpty()){
          int n= que.size();
          int sum = 0;
          
          for(int i=0 ; i<n ;i++){
            TreeNode curr = que.poll();
            sum+=curr.val;

            if(curr.left != null) que.add(curr.left);
            if(curr.right != null) que.add(curr.right);
          }
         
          if(sum > maxsum){
            maxlevel = currlevel ;
            maxsum = sum;
          }
         
          currlevel++;

        }
       return maxlevel;
    }
}