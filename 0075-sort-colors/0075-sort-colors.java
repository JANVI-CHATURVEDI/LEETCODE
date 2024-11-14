class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            int minindex=i;
          for(int j=i+1;j<n;j++){
            if(nums[j]<nums[minindex])
                minindex=j;
            
          }
            int temp= nums[minindex];
            nums[minindex]=nums[i];
            nums[i]=temp;
           

        }
    }
}