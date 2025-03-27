class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
    List<int[]> result = new ArrayList<>();
    
        for (int[] interval : intervals) {
            if (interval[1] < newInterval[0]) {
                result.add(interval); // Before newInterval, add directly
            } else if (interval[0] > newInterval[1]) {
                result.add(newInterval); /* Insert newInterval before adding remaining
                intervals */
                newInterval = interval;  // Update newInterval for next additions
            } else {
                // Merge overlapping intervals
                newInterval[0] = Math.min(newInterval[0], interval[0]);
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }
        }

        result.add(newInterval); // Add the last merged/new interval
        return result.toArray(new int[result.size()][]);
    }
}