class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        for(int i=0 ; i<flowerbed.length ; i++){
            
            if(flowerbed[i]==1){
                i++;
            }
            else{
                if( i == flowerbed.length-1 ){
                   count++;
                   break;  
                }
                else if(flowerbed[i+1]==0){
                  count++;
                   i++;   
                }
               
            }
        }

        if(count >= n){
            return true;
        }

        return false;
    }
}