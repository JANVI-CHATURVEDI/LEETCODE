class Solution {
    public int maxOperations(int[] nums, int k) {
      int n = nums.length; int count = 0;
      HashMap<Integer , Integer> map = new HashMap<>();

      for(int i = 0 ; i < n ; i++){
        int numb = k - nums[i];

        if(map.getOrDefault(numb , 0) > 0){
            map.put(numb, map.get(numb) - 1);
            count++;
        }
        else{
             map.put(nums[i], map.getOrDefault(nums[i] , 0) + 1);
        }

      }
    
      return count;    
    }
}