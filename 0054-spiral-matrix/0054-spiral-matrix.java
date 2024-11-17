class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       List <Integer>al=new ArrayList<>();
       int row=matrix.length;
       int col=matrix[0].length;
       int total=row*col;
       int count=0;
       int startrow=0;
       int endrow= row-1;
       int startcol=0;
       int endcol=col-1;

       while(count<total){
        // print startrow
        for(int idx=startcol; count< total && idx<=endcol; idx++){
            al.add(matrix[startrow][idx]);
            count++;
        }
        startrow++;

        // print endcol
         for(int idx=startrow; count< total && idx<=endrow; idx++){
            al.add(matrix[idx][endcol]);
            count++;
        }
        endcol--;

        // print endrow
        for(int idx=endcol; count< total && idx>=startcol; idx--){
            al.add(matrix[endrow][idx]);
            count++;
        }
        endrow--;

        // print startcol
         for(int idx=endrow; count< total && idx>=startrow; idx--){
            al.add(matrix[idx][startcol]);
            count++;
        }
        startcol++;

       } return al;
    }
}