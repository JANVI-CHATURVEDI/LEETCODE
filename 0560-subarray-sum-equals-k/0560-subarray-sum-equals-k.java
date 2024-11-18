class Solution {
    public int subarraySum(int[] nums, int k) {
    int n= nums.length;
    Map <Integer,Integer>summap=new HashMap <>();
    int sum=0;
    int count=0;
    for(int i=0;i<n;i++){ 
     sum+=nums[i];
        if(sum==k){
            count++;
        }
        if(summap.containsKey(sum-k)){
            count += summap.get(sum - k);
        }
         summap.put(sum, summap.getOrDefault(sum, 0) + 1);
    }
    return count;
    }
}