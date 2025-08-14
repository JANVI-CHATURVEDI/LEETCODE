class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
       HashSet<Integer> set = new HashSet<>();
       int l = 0 , n = nums.length;
        long sum = 0L, maxsum = 0L;

        for(int r = 0 ; r < n ; r ++){
           
          while (set.contains(nums[r])) {
                set.remove(nums[l]);
                sum -= nums[l];
                l++;
            }

            
            set.add(nums[r]);
            sum += nums[r];

            if (r - l + 1 > k) {
                set.remove(nums[l]);
                sum -= nums[l];
                l++;
            }

           if(r - l + 1 == k ){
                maxsum = Math.max(maxsum , sum );
                
           }
       }

      return maxsum;
      
    }
}