class Solution {
  
    public int findMin(int[] nums) {
        int s=0;
        int n = nums.length;
        int e = n-1;
      if(nums[s]<=nums[e]){
        return nums[s];
      }
     

int mid= s+(e-s)/2;
      while(s<=e ){ 
         mid= s+(e-s)/2;

       

      if(  mid>0 && nums[mid]<nums[mid-1] ){
        return nums[mid];
      }

      if(nums[mid]>nums[mid+1]&& mid<n-1 ){
        return nums[mid+1];
              }

           if(nums[mid]>nums[e]){
              s=mid+1;
              }
              else{
                e= mid-1;
              }
   
      }
    return -1; // This shouldn't be reached for a valid rotated sorted array
}

    
   
}