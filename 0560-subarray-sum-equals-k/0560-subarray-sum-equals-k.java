class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;
        int prefixsum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, 1);

        for(int i = 0; i < n ; i++){
            prefixsum += nums[i];
            int num = prefixsum - k;

            if(map.containsKey(num)){
                ans += map.get(num);
            }

            map.put(prefixsum, map.getOrDefault(prefixsum, 0) + 1);
        }


        return ans;
    }
}