class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length; int temp = 0 ;
        boolean t = true;
        
        for(int i = n-1 ; i > 0 ; i -- ){         
            if(nums[i-1] < nums[i]){
               
            if (i >= 0) {
              int j = n - 1;
              while (j>0 && nums[j] <= nums[i-1]) j--; 
                temp = nums[j];
                nums[j] = nums[i-1];
                nums[i-1] = temp ;

             }

              int s= i , e = n-1;
         
            while(s < e){
                temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp ;
                s++;
                e--;
            }
            t = false;
            break;
            
            }

            

        }

        if(t){
            int s = 0 , e = n-1;
            
            while(s < e){
                temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp ;
                s++;
                e--;
            }

        }
       
    }
}