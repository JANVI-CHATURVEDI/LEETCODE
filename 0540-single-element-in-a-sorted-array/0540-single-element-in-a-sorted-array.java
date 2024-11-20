class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int s=0; int e=n-1;
        while(s<e){
        int mid=s +(e-s)/2;


         // Check if mid is the single element
        if ((mid == 0 || nums[mid] != nums[mid - 1]) &&
                (mid == n - 1 || nums[mid] != nums[mid + 1])) {
                return nums[mid];
            }


           // Ensure mid is even for comparison
          if( mid % 2 ==1 ){
            mid-=1;
          }
        
          // Decide the search space
        if( mid % 2 ==0){
            if (nums[mid] == nums[mid + 1]) {
                s = mid + 2; // Single element is on the right
            } else {
                e = mid; // Single element is on the left
            }
        }
        
        } return nums[s];
    }
}