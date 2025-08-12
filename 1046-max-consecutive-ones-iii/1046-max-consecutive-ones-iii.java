class Solution {
    public int longestOnes(int[] nums, int k) {
       int n = nums.length;
       int zerocount = 0 , left = 0 , maxlength = Integer.MIN_VALUE;

       for(int right = 0 ; right < n ; right ++){
           
           if(nums[right] == 0){
            zerocount ++ ;
              
              if ( zerocount > k ){
                  while(nums[left] != 0){
                    left ++ ; 

                  }

                  if(nums[left] == 0){
                     left ++ ;
                     zerocount -- ; 
                  }
              }

           }

           maxlength = Math.max(maxlength , right - left + 1 );

       }

       return maxlength ;
    }
}