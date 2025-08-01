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
    
    public int kthSmallest(TreeNode root, int k) {
       
        ArrayList <Integer> path = new ArrayList <>(); 
        int kthSmallest = 0;
        
        inorder(root , path);

        return  kthSmallest = path.get(k - 1);
        
    }

    public static void inorder(TreeNode root, ArrayList <Integer> path){
        if(root==null) return  ;

        inorder(root.left , path );
        path.add(root.val);
        inorder(root.right , path);
    }
}