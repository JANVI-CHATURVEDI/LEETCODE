class Solution {
    public int subarraySum(int[] nums, int k) {
    int n= nums.length;
    Map <Long,Integer>summap=new HashMap <>();
    long sum=0;
    int count=0;
    for(int j=0;j<n;j++){ 
        sum=0;
    for(int i=j;i<n;i++){
        sum+=nums[i];
        if(sum==k){
            count++;
        }
    }
    }return count;
    }
}