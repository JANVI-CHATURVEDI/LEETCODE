class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n1 = spells.length , n2 = potions.length ;
        List<Integer> list = new ArrayList<>();
        Arrays.sort(potions);

        for(int i = 0 ; i < n1 ; i ++){

             int s = 0 ; int l = n2 - 1 ; 
             int idx = n2;

            while(s <= l){
              
               int mid =  s + (l-s) / 2;

               long ans = (long) spells[i] * potions[mid];


               if(ans >= success ){
                   idx = mid; 
                   l = mid-1 ;
               }
               else{
                   s = mid+1 ;
               }

               


            }

            list.add(n2 - idx);
           
         
        }  

        int[] arr = list.stream().mapToInt(i -> i).toArray();

         return arr;  

    }
}