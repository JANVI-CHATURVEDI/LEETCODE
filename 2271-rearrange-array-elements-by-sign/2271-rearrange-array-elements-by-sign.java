class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int pos = 0 , neg = 0 ;
        int[] arr = new int[n];
        int odd = 1 , even = 0 ;
        

       for(int i = 0 ; i < n ; i++){

          if(nums[i] > 0){
            arr[even] = nums[i];
            even +=2;
          }

          if(nums[i] < 0){
            arr[odd] = nums[i];
            odd +=2;
          }

       }

       return arr;


    }
}