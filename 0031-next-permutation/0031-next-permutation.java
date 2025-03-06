class Solution {
    public void nextPermutation(int[] nums) {
    int n= nums.length;int pindx=-1;

    for(int i=n-1;i>0;i--){
        if(nums[i]>nums[i-1]){
            pindx=i-1;
            break;

        }
 }

 if(pindx==-1){
    reverse(0,n-1,nums);
    return;
   
 }

 for(int i=n-1;i>0;i--){
    if(nums[i]>nums[pindx]){
        int temp=nums[pindx];
 nums[pindx]=nums[i];
 nums[i]=temp;
 break;
    }
 }

reverse(pindx+1,n-1,nums);
 
        
    }

    public void reverse(int s, int e ,int[]nums){
        while(s<e){                       
        int temp=nums[s];
 nums[s]=nums[e];
 nums[e]=temp;
  s++;
        e--;
    
        }
       
}
}