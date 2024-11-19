class Solution {
    public int maxSubArray(int[] nums) {
       int n= nums.length;
       int sum=0,start=0,ansstart=-1,ansend=-1,maxi=Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
        sum+=nums[i];
       if (sum == 0) start = i;
        if(sum>maxi){
            maxi=sum;
            ansstart=start;
            ansend=i;
        }
        if(sum<0){
            sum=0;
        }

       } return maxi;
    }
}