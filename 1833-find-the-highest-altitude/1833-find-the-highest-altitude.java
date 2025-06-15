class Solution {
    public int largestAltitude(int[] gain) {
   int n=gain.length; int psum=0; int max = 0;
 
     for(int i=0;i<n;i++){

          psum+=gain[i];

        max=Math.max(max,psum);

      
     }

     return max;
        
    }
}