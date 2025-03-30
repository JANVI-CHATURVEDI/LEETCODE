class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length,tsum=0,sum=0;
     for(int i=1;i<=n;i++){
        tsum+=i;
     }  

     for(int i=0;i<n;i++){
        sum+=nums[i];
     } 

     return tsum-sum;
    }
}