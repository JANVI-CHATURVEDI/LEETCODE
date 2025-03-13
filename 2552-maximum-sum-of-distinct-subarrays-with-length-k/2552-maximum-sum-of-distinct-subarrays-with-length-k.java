class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n= nums.length;long sum=0; long maxsum=0; int left =0;
           
           HashSet<Integer> set = new HashSet <>();

           for(int i=0;i<n;i++){
            while(set.contains(nums[i]) || set.size()>=k){
                set.remove(nums[left]);
                sum-=nums[left];
                left++;
            }

            set.add(nums[i]);
            sum+=nums[i];

            if(set.size()==k){
             maxsum= Math.max(maxsum,sum);
            }
           }

           
       return maxsum; 
    }
}