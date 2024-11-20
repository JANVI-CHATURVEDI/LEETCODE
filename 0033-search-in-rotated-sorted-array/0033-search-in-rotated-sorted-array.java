class Solution {
    public int search(int[] nums, int target) {
       int n= nums.length;
    int s=0;
    int e= n-1;
    
    while(s<=e){
        int mid=s+(e-s)/2;
      if (nums[mid] == target) return mid;

            // Check which side is sorted
            if (nums[s] <= nums[mid]) { // Left half sorted
                if (target >= nums[s] && target < nums[mid]) e = mid - 1;
                else s = mid + 1;
            }
 else { // right half sorted
                if (target <= nums[e] && target > nums[mid]) s= mid + 1;
                else e = mid - 1;
            }



    } return -1;    
    }
}