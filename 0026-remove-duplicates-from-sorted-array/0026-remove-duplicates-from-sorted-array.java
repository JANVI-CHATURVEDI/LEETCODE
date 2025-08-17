class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int s= 0; 

        if (n == 0) return 0;

        for(int e = 1 ; e < n ; e ++){
           if(nums[e] != nums[s]){
               s++;
               nums[s] = nums[e];

           }
        }
        return s+1 ;
    }
}