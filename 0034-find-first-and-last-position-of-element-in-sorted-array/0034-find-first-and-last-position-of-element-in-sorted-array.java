class Solution {
    public int[] searchRange(int[] nums, int target) {
     int n= nums.length;
     int [] result={-1,-1};
    int s=0;
    int e= n-1;
    int mid=s+(e-s)/2;
     while(s<=e){
         mid=s+(e-s)/2;
        if(nums[mid]==target) {
            result[0]=mid;
             e=mid-1;
            
        }
        if(target>nums[mid]){
            s=mid+1;
        }
        else if(target<nums[mid]){
            e=mid-1;
        }
        } 
         
        
       s=0;
     e= n-1;
   
    mid=s+(e-s)/2; 

     while(s<=e){
         mid=s+(e-s)/2;
        if(nums[mid]==target) {
            result[1]=mid;
             s=mid+1;
            
        }
        if(target>nums[mid]){
            s=mid+1;
        }
        else if(target<nums[mid]){
            e=mid-1;
        }
        } 
        
        return result;
    }
}