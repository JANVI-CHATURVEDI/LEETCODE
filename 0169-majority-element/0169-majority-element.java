class Solution {
    public int majorityElement(int[] nums) {
    int n=nums.length; 
   HashMap<Integer,Integer> numSet = new HashMap<>();
    for( int num:nums){
      numSet.put(num,numSet.getOrDefault(num,0)+1) ; 
       if (numSet.get(num) > n / 2) {
                return num;
            }
    }
   
    return -1;
    }
}