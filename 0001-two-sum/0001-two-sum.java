class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // Loop until the second-last element
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i,j}; // Return immediately when the pair is found
                }
            }
        }
        
        // Return empty array if no solution is found
        return null;
    }
}
