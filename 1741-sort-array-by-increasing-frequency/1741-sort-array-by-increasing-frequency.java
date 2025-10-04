class Solution {
    public int[] frequencySort(int[] nums) {
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq =
            new PriorityQueue<>((a, b) -> {
                if (!a.getValue().equals(b.getValue())) 
                        return a.getValue() - b.getValue(); 
                return b.getKey() - a.getKey();         
}
);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.offer(entry);
            
        }
        
        int[] result = new int[n];
        int idx = 0 ;
        while (!pq.isEmpty()) {
            Map.Entry<Integer, Integer> top = pq.poll();
            for (int i = 0; i < top.getValue(); i++) {
                 result[idx++] = top.getKey();
            }
        }

        return result;
    }
}