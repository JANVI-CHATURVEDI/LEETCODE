class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int l=0 ;

        for(int r = 0 ; r < n ; r ++){
            if(nums[r] !=0){
                nums[l] = nums[r];
                l++;
            }
        }

        while(l<n){
            nums[l] = 0 ;
            l++;
        }
    }
}