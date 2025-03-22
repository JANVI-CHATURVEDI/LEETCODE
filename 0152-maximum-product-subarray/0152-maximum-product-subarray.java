class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length; int lproduct=1,rproduct=1; 
        int maxpr=nums[0];

        for(int i=0;i<n;i++){

            if(lproduct==0){
                lproduct=1;
            }

             if(rproduct==0){
                rproduct=1;
            }

            lproduct*=nums[i];
            rproduct*=nums[n-i-1];

            maxpr=Math.max(maxpr , Math.max(lproduct,rproduct));
        }    
     return maxpr;
    }
}