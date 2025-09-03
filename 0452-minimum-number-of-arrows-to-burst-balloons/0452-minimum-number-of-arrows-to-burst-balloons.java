class Solution {
    public int findMinArrowShots(int[][] points) {
        int n = points.length;
        int count = 1;
        int newinterval = 0;

        Arrays.sort( points , (a, b) -> Integer.compare(a[1], b[1]));

        newinterval = points[0][1];  

        for(int i = 1 ; i < n ; i ++){
           
           if(newinterval >= points[i][0]){
               continue;
           }
           else{
              newinterval = points[i][1];
              count ++;
           }
        }

        return count ; 

    }
}