class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0, count = 0;

        // Step 1: Find the candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num; // Update the candidate
            }
            count += (num == candidate) ? 1 : -1; // Adjust count
        }

        // Step 2: Return the candidate
        return candidate;
    }
}