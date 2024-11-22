class Solution {

    public  int totalhours(int[] piles, int speed,int n){  
    int totalhours=0;
    for(int i=0;i<n;i++){
     totalhours += Math.ceil((double)(piles[i]) / (double)(speed));
    }return totalhours;
    }
    
    
    public int minEatingSpeed(int[] piles, int h) {
     int n=piles.length;   
     int low =1;
     
     
     int max = piles[0]; // Assume the first element is the largest
        for (int i = 1; i < n; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }
      int high=max;
     

     while(low<=high){
        int mid= low+(high-low)/2;
       int totalHours= totalhours( piles,mid, n);
        if(totalHours<=h){
            high=mid-1;
        }
        else{
            low=mid+1;
        }




     }return low;
  
    } 
}