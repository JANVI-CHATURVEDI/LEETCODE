class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length; int tsum=0,left=0;

        for(int i=0;i<n;i++){
            tsum+=nums[i];
        }

          for(int i=0;i<n;i++){
            if(left==tsum-nums[i]-left){
                return i;
            }

            left+=nums[i];
        }

        return -1;
    }
}