class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length; int count = 0;
        int newinterval = 0;
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
           
        newinterval = intervals[0][1];  
        for(int i = 1 ; i < n ; i ++){
            if( newinterval > intervals[i][0] ){
                count++;
                newinterval = Math.min(newinterval, intervals[i][1]);
            } 
            else{
                newinterval = intervals[i][1];
            }
        }
       return count;
    }
}