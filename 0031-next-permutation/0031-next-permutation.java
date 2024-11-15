class Solution {
    public void nextPermutation(int[] nums) {
     int n= nums.length; int pivotidx=-1;
      
     for (int i = n - 2; i >= 0; i--) {
    if (nums[i] < nums[i + 1]) {
        pivotidx = i;  // Track the index where nums[i] < nums[i + 1]
        break;          // We only need the first such pair, so break after finding it
    }

}

       if ( pivotidx ==-1){
          reverse( nums ,0 ,n-1);
          return;
        }


for (int i = n - 1; i >= 0; i--) { 
        if(nums[i]>nums[pivotidx]){
            int temp= nums[pivotidx];
           nums[pivotidx]=nums[i];
            nums[i]=temp;
            break;
        }
}
           reverse( nums ,pivotidx +1,n-1);
      }
      
      
     
      
    


    public int[] reverse(int[] nums ,int s ,int e){
       
       
        while(s<e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
             s++;
            e--;
        } return nums;
    }
}