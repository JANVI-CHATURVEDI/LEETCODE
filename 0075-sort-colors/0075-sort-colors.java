class Solution {
    public void sortColors(int[] nums) {
       int n = nums.length;
        int s = 0 , i = 0  , e = n-1;

        while (i <= e){     

            if(nums[i] == 0){
               int temp = nums[s];
                nums[s]=0;
                nums[i] = temp;
                s++;
                i++;
            }

            else if(nums[i] == 1){
                i++;
            }

            
            else if(nums[i] == 2 ){
               int temp = nums[e];
                nums[e] = 2 ;
                nums[i] = temp;
                e--;
            }

            

        }
    }
}