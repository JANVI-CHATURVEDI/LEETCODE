class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> a[0] == b[0] ? b[1] - a[1] : b[0] - a[0]
        );


        for(int num : arr){
            pq.add(new int[]{ Math.abs(num - x) , num});

            if(pq.size() > k){
                pq.poll();
            }
        }

        List<Integer> result = new ArrayList<>();

        while (k-- > 0 && !pq.isEmpty()) {
            int[] pair = pq.poll();   
            result.add(pair[1]);      
        }

        Collections.sort(result);

        return result;


    }
}