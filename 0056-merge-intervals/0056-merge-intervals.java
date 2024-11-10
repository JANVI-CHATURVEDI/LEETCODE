class Solution {
    public int[][] merge(int[][] intervals) {
        //Since we are working with intervals represented by int[] arrays, we need to use ArrayList<int[]> instead of ArrayList<Integer>.
        ArrayList<int[]> res = new ArrayList<>();
        int n= intervals.length;
        if(intervals.length<=1){
            return intervals;
        }
          // Sort intervals by the starting time
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
          // Start with the first interval
        int[] current =intervals[0];
        for(int i=1;i<n;i++){
        
            if(current[1]>= intervals[i][0]){
                 // If overlapping, merge by updating the end of the current interval
                current[1] = Math.max(current[1], intervals[i][1]);
             //   current is updated whenever there's an overlap by extending its end to include the overlapping interval. This way, current always represents the merged interval until we reach a non-overlapping interval.
            } else {
                // No overlap, add the current interval to result and update current
                res.add(current);
                current = intervals[i];
            }
        }

        // Add the last interval after the loop
        res.add(current);

        // Convert the result list to a 2D array
        return res.toArray(new int[res.size()][]);
    }
}