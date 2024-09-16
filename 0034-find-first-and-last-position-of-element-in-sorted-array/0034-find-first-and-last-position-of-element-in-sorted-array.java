class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);
        return result;
    }

    // Method to find the first occurrence of the target
    public int findFirst(int[] nums, int target) {
        int s = 0, e = nums.length - 1;
        int ans = -1;
        
        while (s <= e) {
            int mid = s + (e - s) / 2;
            
            if (nums[mid] == target) {
                ans = mid; // Record the index
                e = mid - 1; // Keep searching in the left half
            } else if (nums[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        
        return ans;
    }

    // Method to find the last occurrence of the target
    public int findLast(int[] nums, int target) {
        int s = 0, e = nums.length - 1;
        int ans = -1;
        
        while (s <= e) {
            int mid = s + (e - s) / 2;
            
            if (nums[mid] == target) {
                ans = mid; // Record the index
                s = mid + 1; // Keep searching in the right half
            } else if (nums[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        
        return ans;
    }
}
