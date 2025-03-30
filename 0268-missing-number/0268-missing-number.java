class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length,tsum=0,sum=0;
     tsum=n*(n+1)/2; 

     for(int i=0;i<n;i++){
        sum+=nums[i];
     } 

     return tsum-sum;
    }
}