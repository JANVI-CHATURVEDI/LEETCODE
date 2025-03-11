class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length; int sum=0,maxsum=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            sum +=nums[i];

            maxsum=Math.max(maxsum,sum);

            if(sum<0){
                sum=0;
            }

           
        }

       return  maxsum;
    }
}