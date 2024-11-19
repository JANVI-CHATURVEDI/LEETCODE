class Solution {
    public int maxSubArray(int[] nums) {
        int maxi = Integer.MIN_VALUE, sum = 0;

        for (int num : nums) {
            sum = Math.max(num, sum + num); // Either continue the subarray or start fresh
            maxi = Math.max(maxi, sum);    // Update the maximum found so far
        }

        return maxi;
    }
}