class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int loop = 0 ; 

        for(int i=0;i<n-1;i++){
        
        if(nums[i] > nums[i+1]){
            loop ++;
        }
        
        }

        if(nums[0] < nums[n-1]){
            loop++;
        }

        return loop <=1;
      
    }
}