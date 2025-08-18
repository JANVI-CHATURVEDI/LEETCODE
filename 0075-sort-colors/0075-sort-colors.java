class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int zero = 0 , one = 0 , two = 0 ;

        for(int i = 0 ; i < n ; i ++){
            if(nums[i] == 0) zero ++;
            if(nums[i] == 1) one ++;
            if(nums[i] == 2) two ++;
        }
        
        int i = 0;
        while( i < n ){
             
             while(i< n && zero > 0){
                nums[i] = 0 ;
                zero--; 
                i++;
             }

              while(i< n && one > 0){
                nums[i] = 1 ;
                one --;
                i++;
             }

              while(i< n && two > 0){
                nums[i] = 2 ;
                two--;
                i++;
             }
        }



    }
}