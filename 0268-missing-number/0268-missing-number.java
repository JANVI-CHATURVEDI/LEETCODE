class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int total=0;
      int  sum=n*(n+1)/2;
        for (int i=0;i<n;i++){
          total +=nums[i];
        }

        int m=sum-total;
        return m;
        
    }
}