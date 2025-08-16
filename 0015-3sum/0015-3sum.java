class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
         List<List<Integer>> result = new ArrayList<>();
         
        
       for(int i = 0 ; i < n ; i++){
           int l = i+1 ;
           int r = n-1;

           if (i > 0 && nums[i] == nums[i-1]) continue;
         
           while(l < r){ 
            
           int sum = nums[i] + nums[l] + nums[r] ;
          
              if(sum == 0 ){   
                 result.add(Arrays.asList(nums[i], nums[l] , nums[r] ));
                  l++;
                  r--;

                  while (l < r && nums[l] == nums[l - 1]) l++;
                    while (l < r && nums[r] == nums[r + 1]) r--;
              }

              else if( sum > 0 ){
                r--;
              }
              else{
                l++;
              }
           
           }

       }

       return result ;

    }
}