class Solution {
    public int findMinArrowShots(int[][] points) {
         int shots = 1;
     

     if(points.length==1){                   
         return 1 ;
     }

     Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));

     int[] newInterval=points[0];
 
     for(int i =1 ; i< points.length ; i++){

        int[] interval = points[i];

        if(interval[0] > newInterval[1] ){   
           newInterval=interval;
           shots++;
        }
       
         else{
            
           newInterval[0] = Math.max(interval[0] , newInterval[0]);
           newInterval[1] = Math.min(interval[1] , newInterval[1]);
           
           if(interval[0] > newInterval[1] ){   
           newInterval=interval;
           shots++;
        }
        }

     }   
      return shots;
    }
}