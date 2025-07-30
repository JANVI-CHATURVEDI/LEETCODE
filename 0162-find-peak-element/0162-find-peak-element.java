class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int s = 0 , e = n - 1;

        if( n == 1){
            return 0;
        }

        while( s <= e ){
            int mid = s + (e - s) / 2 ;

            if((mid == 0 || nums[mid - 1] < nums[mid]) && (mid == n - 1 || nums[mid] > nums[mid+1])){
                return mid;
            }
            else if(nums[mid] < nums[mid+1]){
                s = mid+1 ;
            }
            else{
                e = mid-1 ;
            }
        }
       return -1;
    }
}