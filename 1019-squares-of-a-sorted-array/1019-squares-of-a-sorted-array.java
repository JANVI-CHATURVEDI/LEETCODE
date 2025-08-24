class Solution {
    public int[] sortedSquares(int[] nums) {
       int n  = nums.length;
       int[] result = new int[n];

       int l = 0 , r = n-1 ,  pos = n-1;

        while (l <= r) {
            if (Math.abs(nums[l]) > Math.abs(nums[r])) {
                result[pos] = nums[l] * nums[l];
                l++;
            } else {
                result[pos] = nums[r] * nums[r];
                r--;
            }
            pos--;
        }
        
        return result;
    }
}