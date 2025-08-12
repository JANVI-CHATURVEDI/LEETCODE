class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int n = nums.length;
        int left = 0 , right = 0  ;
        double maxavg = Integer.MIN_VALUE , sum = 0 ;

        while(right < n ){
            sum += nums[right];

            if(right - left + 1 == k){
                double avg = sum / k;
                maxavg = Math.max(maxavg , avg);
                sum -= nums[left];
                left ++;

            }

            right++;
        }

        return maxavg ;
    }
}