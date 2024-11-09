class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0;
    for(int i=0; i<nums.length;i++)    {
        sum+=nums[i];
    }
int[] newnums=new int [nums.length];
      int n= nums.length;
      for(int i=n-1; i>=0;i--){
        newnums[i]= sum;
        sum=sum-nums[i];

      }return newnums;
    }
}