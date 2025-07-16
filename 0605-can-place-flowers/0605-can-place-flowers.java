class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l = flowerbed.length; int k=0;
       
      for(int i=0 ; i< l ; i++){

        if(flowerbed[i] == 0){
        int prev = ( i == 0) ? 0: flowerbed[i-1];
        int next = ( i == l-1) ? 0 : flowerbed [i+1];

          if(prev == 0 && next == 0){
            flowerbed[i]=1;
             k++;
        }

        }

       

      }

        if( n > k){
            return false;
        }
       
       return true;
    }
}