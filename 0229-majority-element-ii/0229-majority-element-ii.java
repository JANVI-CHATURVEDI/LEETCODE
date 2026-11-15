class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int max = n/3;

        for(int i = 0 ; i < n; i++){
            int num = nums[i];
            map.put(num ,map.getOrDefault(num, 0) + 1 );
        }

        for (int key : map.keySet()) {

            if (map.get(key) > max) {
                list.add(key);
            }
        }    



        return list;


    }
}