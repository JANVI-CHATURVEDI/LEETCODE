class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length ;
        PriorityQueue <Integer> pq = new PriorityQueue <Integer> ();

        for(int i = 0 ; i < n ; i++ ){
            pq.add(nums[i]);
        }
        int i = 0 ;

        while(pq.size() > 0){
            int num = pq.poll();
            nums[i] = num ;
            i++ ;
        }
        return nums ;
    }
}