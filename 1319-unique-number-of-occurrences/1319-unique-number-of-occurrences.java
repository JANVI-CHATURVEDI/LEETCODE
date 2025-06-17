class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n=arr.length;
     HashMap <Integer,Integer> map=new HashMap<>();
     HashSet <Integer> set = new HashSet<>();

         for(int num : arr){
          
           map.put(num,map.getOrDefault(num, 0) + 1) ;
           
        }

        for(int count : map.values()){
          
            if (set.contains(count)) {
                   return false; // means this frequency is already there, so it's repeated!
             }
                  
                  set.add(count);
           
        }

          return true;


    }
}