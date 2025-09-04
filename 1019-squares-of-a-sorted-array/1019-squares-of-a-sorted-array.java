class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length; int s = 0 , l = n - 1 ; 
        int[] result = new int[n];
        int pos = n - 1 ;

        for(int i = 0 ; i < n ; i ++){
            
           if (Math.abs(nums[s]) > Math.abs(nums[l])) {
                result[pos] = nums[s] * nums[s];
                s++;
           }
           else{
                result[pos] = nums[l] * nums[l];
                l--; 
           }

           pos -- ;

        }

        return result ;

    }
}