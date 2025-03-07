class Solution {
    public int majorityElement(int[] nums) {
           int candidate = 0, count = 0;

        // Step 1: Find potential majority candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;  // Increase count if same as candidate
            } else {
                count--;  // Decrease count if different
            }
        }
        return candidate;
    }

}