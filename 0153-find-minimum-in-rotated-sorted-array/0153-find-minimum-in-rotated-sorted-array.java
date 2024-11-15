class Solution {
    public int findMin(int[] nums) {
    int n= nums.length; int s=0;
    int e=n-1; 

    if(nums[s]<= nums[e]){
        return nums[s];
    }
    while(s<e){
        int mid=s+(e-s)/2;
        if(nums[mid]<nums[mid+1] && nums[mid]<nums[n-1]){
            e=mid;
        }
        else if(nums[mid]<nums[mid+1] && nums[mid]>nums[n-1]){
            s=mid+1;
        }
        else{
            return nums[mid+1];
        }
     }   return 0;
    }
}