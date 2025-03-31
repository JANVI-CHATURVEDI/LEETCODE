class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;int count=0,left=0,sum=0,ml=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){

             sum +=nums[i];
           count++;
          

           while(sum>=target) {
               sum -=nums[left];
               left++;
               
            ml=Math.min(ml,count);
               count--;
           }

          
        }
       return ml == Integer.MAX_VALUE ? 0 : ml; // If no subarray found, return 0
    }
}