class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length; int totalsum=0,leftsum=0;
          
        for(int i=0;i<n;i++){
           totalsum+=nums[i];
        }

        for(int i=0;i<n;i++){
           if( leftsum == totalsum-leftsum-nums[i]){
                 return i;
           }

           leftsum+=nums[i];
        }

      return -1;
       
    }
}