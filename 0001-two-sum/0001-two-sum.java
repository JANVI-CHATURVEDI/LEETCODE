class Solution {
    public int[] twoSum(int[] nums, int target) {
     int n= nums.length;
     HashMap<Integer,Integer> res= new HashMap<>();
        for(int i=0;i<n;i++){
            int comp= target-nums[i];
            if(res.containsKey(comp)){
                int[] num={res.get(comp),i};
                return num;
            }

            res.put( nums[i],i);
        }return new int[0];
    }
}