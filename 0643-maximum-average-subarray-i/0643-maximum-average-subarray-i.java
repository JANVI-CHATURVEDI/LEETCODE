class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg=0,mavg=Double.NEGATIVE_INFINITY,sum=0;
        int left=0,count=0;
       

        for(int i=0;i<nums.length;i++){
             count++;
            while(count>k){
                sum -= nums[left] ;
                left++;
                count--;
            }
            
            sum+=nums[i] ;

            if(count ==k){
               avg=sum/k;
                mavg=Math.max(mavg,avg);
            }
        }

        return mavg;

    }
}