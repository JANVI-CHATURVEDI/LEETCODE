class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int n = points.length;

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> (b[0]*b[0] + b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1])
        );
        
        for (int[] num : points) {
             pq.add(num);  

             if (pq.size() > k) {
                pq.poll(); 
             }
        }

        int[][] result = new int[k][2];

        for (int i = k - 1; i >= 0; i--) {
            result[i] = pq.poll();
        }

        return result;

    }
}