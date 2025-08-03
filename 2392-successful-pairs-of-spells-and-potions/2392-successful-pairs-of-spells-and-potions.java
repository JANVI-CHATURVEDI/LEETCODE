class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = spells.length;
        int m = potions.length;
        
        int[] pairs = new int[n];
         
        for(int i = 0 ; i< n ; i++){

           int s=0 , e = m-1;
           int idx = m;
        
            while( s <= e){
                int mid = s + (e-s)/2;
    
                if ((long) potions[mid] * spells[i] >= success){   
                    e = mid-1;
                    idx=mid;
                }
                else if(potions[mid]*spells[i] < success){
                    s = mid+1;
                }
            
              }

        pairs[i] = m - idx;

      }
       return pairs;
    }
}