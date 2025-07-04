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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();

         helper(root1 , leaves1);
         helper(root2 , leaves2);

         return leaves1.equals(leaves2);
        
    }

    public void helper (TreeNode node , List<Integer> leaves ){

        if(node ==null){
            return ;
        }

         if (node.left == null && node.right == null) {
            leaves.add(node.val);
        }

        helper(node.left , leaves);
         helper(node.right , leaves);


    }
}