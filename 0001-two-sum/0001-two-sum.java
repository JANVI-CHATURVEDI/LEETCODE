class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;   int complement=0;
      HashMap<Integer,Integer> map= new HashMap<>();
      for(int i=0;i<n;i++){
       complement = target-nums[i];
       if(map.containsKey(complement)){
         return new int[]{map.get(complement),i};
       }
       map.put(nums[i],i);
     
      } return new int[]{};

    }
}