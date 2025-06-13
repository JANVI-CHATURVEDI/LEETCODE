class Solution {
    public int longestOnes(int[] nums, int k) {
      int n=nums.length;int z=0;int i=0,max=0;
        int left = 0;
     
     while(i<n){
      
        if(nums[i]==0){
            z++;
            if(z>k){
              
              while (z > k) {
              if (nums[left] == 0) z--;
                 left++;
               }
                

            }
        }
         max = Math.max(max, i - left + 1);

        i++;

     }

     return max;
     
    }
}