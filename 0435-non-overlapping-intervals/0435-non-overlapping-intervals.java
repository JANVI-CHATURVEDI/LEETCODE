class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
      int count = 0;
     

     if(intervals.length==1){                   
     return 0 ;
     }
          
     Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

     int[] newInterval=intervals[0];

     for(int i =1 ; i< intervals.length ; i++){

        int[] interval = intervals[i];

        if(interval[0] < newInterval[1] ){
           count ++;
        }
       
         else{
            newInterval=interval;
           
        }

     }   


     return count > 0 ? count: 0; 

    }
}