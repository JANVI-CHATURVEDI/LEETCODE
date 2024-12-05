class Solution {
    public int singleNumber(int[] nums) {
        int result = 0; // Initialize result to 0
        for (int num : nums) {
            result ^= num; // XOR each number with result
        }
        return result; // The single number remains
    }
}
