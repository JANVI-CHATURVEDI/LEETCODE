class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int i=0,j=1;

        while(i<n && j<n){
            if(nums[i]==0){
                if(nums[j] != 0){
                    nums[i]=nums[j];
                    nums[j]=0;
                   
                    i++;
                    j++;
                }
                else{
                   j++;
                   

                }

            }
            else{
                i++;
                j++;
            }
        }


        // while(i<n && count>=0 ){
        //     nums[i]=0;
        //     i++;
        //     count--;
           
        // }

        
    }
}