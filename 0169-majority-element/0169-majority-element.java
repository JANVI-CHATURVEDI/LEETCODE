class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length; int count = 1 ; int j = 0 ;
       
       int candidate = nums[0];

       for(int i = 1 ; i < n ; i ++){

           
           if(nums[i] == candidate){
                count ++;
                j = i ;
           }
           else{
               count--;

               if(count == 0 ){
                  candidate = nums[i];
                  count++;
                  j = i;
               }
           }
       }

       return nums[j];

    }
}