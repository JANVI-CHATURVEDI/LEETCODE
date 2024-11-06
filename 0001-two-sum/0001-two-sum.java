class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        
        // Loop until the second-last element
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result; // Return immediately when the pair is found
                }
            }
        }
        
        // Return empty array if no solution is found
        return new int[0];
    }
}
