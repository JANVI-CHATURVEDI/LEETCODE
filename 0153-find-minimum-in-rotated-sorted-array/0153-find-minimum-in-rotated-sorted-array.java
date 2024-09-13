class Solution {
  public int findMin(int[] nums) {
    int s = 0;
    int e = nums.length - 1;

    // If the array is not rotated (already sorted), return the first element
    if (nums[s] <= nums[e]) {
        return nums[s];
    }

    while (s <= e) {
        int mid = s + (e - s) / 2;

        // Check if mid is the smallest element
        if (mid > 0 && nums[mid] < nums[mid - 1]) {
            return nums[mid];
        }

        // Check if mid+1 is the smallest element
        if (mid < nums.length - 1 && nums[mid] > nums[mid + 1]) {
            return nums[mid + 1];
        }

        // Decide whether to search left half or right half
        if (nums[mid] > nums[e]) {
            // Minimum is in the right half
            s = mid + 1;
        } else {
            // Minimum is in the left half
            e = mid - 1;
        }
    }

    return -1; // This shouldn't be reached for a valid rotated sorted array
}

    
   
}