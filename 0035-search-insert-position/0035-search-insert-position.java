class Solution {
    public int searchInsert(int[] nums, int target) {
    int n= nums.length;
    int s=0;
    int e= n-1;
    int mid=s+(e-s)/2;
    while(s<=e){
        if(nums[mid]==target){
            return mid;
        }
        if(target>nums[mid]){
            s=mid+1;
        }
        else if(target<nums[mid]){
            e=mid-1;
        }
        else{
            if(target> nums[s] && target<nums[s+1]){
                return s+1;
            }
        }

        mid=s+(e-s)/2;
    } return e+1;   
    }
}