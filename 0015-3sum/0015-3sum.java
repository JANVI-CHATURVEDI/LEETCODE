class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

         List<List<Integer>> result = new ArrayList<>();

        
       for(int i=0;i<nums.length;i++){
         if(i>0){
             if (nums[i] == nums[i - 1]){                  // skip to avoid duplicate triplets.
           continue;
        }
         }
       

        int x=- nums[i];
        int left=i+1,right=nums.length-1; 
        
         while(left < right){
           int sum=nums[left]+nums[right];

           if(sum==x){
             result.add(Arrays.asList(nums[i], nums[left], nums[right]));
             while (left < right && nums[left] == nums[left + 1]) left++;
             while (left < right && nums[right] == nums[right - 1]) right--;
               left++;
               right--;

           }
           else if(sum< x){
            left++;
           }

           else{
            right--;
           }



        }
        
       }

       return result;
       
    }
}