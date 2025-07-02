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
    public List<Integer> postorderTraversal(TreeNode root) {
          List<Integer> nodes = new ArrayList<>();

         helperfn(root , nodes);

         return nodes;

    }

    public void helperfn(TreeNode root , List<Integer> nodes){

         if(root == null){
            return ;
         }

         helperfn(root.left,nodes);
         
         helperfn(root.right , nodes);

         nodes.add(root.val);
   
    }
}