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
    Map<Integer , Integer > map = new  HashMap<>();

    public void help(TreeNode root , int level){
        if(root == null) return;
        map.put(level, map.getOrDefault(level, 0) + root.val);

        help(root.left , level+1);
        help(root.right , level+1);

    }
    public int maxLevelSum(TreeNode root) {
        help(root , 1);

         int maxSum = Integer.MIN_VALUE;
        int resultLevel = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int level = entry.getKey();
            int sum = entry.getValue();

            if (sum > maxSum) {
                maxSum = sum;
                resultLevel = level;
            }
        }

        return resultLevel;


    }
}