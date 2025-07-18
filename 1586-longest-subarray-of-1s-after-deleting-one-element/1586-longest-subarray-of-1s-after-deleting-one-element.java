class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int left =0 ,right =0 , count =0 , max =0 ;

        while(left <= right && right <n){

            if(nums[right] == 0){
                count++;
            } 

            if(count > 1) {
            if(nums[left] == 0) count --;
            left ++;
            }
           
                
            max = Math.max(right - left , max);   
            right ++ ;
             
        }

          return max;
    }
}