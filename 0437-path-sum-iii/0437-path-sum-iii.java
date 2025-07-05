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
    public int pathSum(TreeNode root, int targetSum) {
        HashMap<Long, Integer> map = new HashMap<>();
        map.put(0L, 1);
        return findpathsum(root, 0L, targetSum, map);
    }

    public int findpathsum(TreeNode root, long sum, int targetSum, HashMap<Long, Integer> map) {
        if (root == null) return 0;

        sum += root.val;

        int total = map.getOrDefault(sum - targetSum, 0);

        map.put(sum, map.getOrDefault(sum, 0) + 1);

        total += findpathsum(root.left, sum, targetSum, map);
        total += findpathsum(root.right, sum, targetSum, map);

        map.put(sum, map.get(sum) - 1); // backtrack

        return total;
    }
}

