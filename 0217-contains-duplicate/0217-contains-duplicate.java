class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;int num=0;
        Arrays.sort(nums);

        for(int i=1;i<n;i++){
          if(nums[i]==nums[i-1]){
             return true;
            
          }
        }

      return false;
    }
}