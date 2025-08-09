class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int sum = n*(n + 1) / 2 ; int fsum = 0 ; 

        for(int i = 0 ; i < n ; i++){
              fsum += nums[i];
        }
        
        int result = sum - fsum ;

        return result ; 
    }
}