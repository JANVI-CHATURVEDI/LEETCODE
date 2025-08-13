class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int l = 0 , zero = 0 , maxLen= 0; 

        for(int r = 0 ; r < n ; r ++){
           
           if(nums[r] == 0){
             
             zero ++;

             while (zero > 1) {
                if (nums[l] == 0) zero--;
                l++;
            }
      
             
            }

            maxLen = Math.max(maxLen, r - l);

        }

        
        
        return maxLen;
    }
}