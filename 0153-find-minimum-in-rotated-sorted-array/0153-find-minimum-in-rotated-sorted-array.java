class Solution {
    public int findMin(int[] nums) {
    int n= nums.length; int s=0;
    int e=n-1; 

    if(nums[s]<= nums[e]){
        return nums[s];
    }
    while(s<e){
        int mid=s+(e-s)/2;
       if (nums[mid] < nums[e])
        e = mid;
      else
        s = mid + 1;
    }

    return nums[s];
    }
}