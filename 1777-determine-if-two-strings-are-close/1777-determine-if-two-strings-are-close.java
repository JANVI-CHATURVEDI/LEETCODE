class Solution {
    public boolean closeStrings(String word1, String word2) {
        int n1=word1.length(),n2=word2.length();

        if(n1 != n2){
            return false;
        }

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        
         for(int i=0;i<n2;i++ ){
            char ch =word1.charAt(i);
          
          map1.put(ch,map1.getOrDefault(ch, 0) + 1);
           
        }

         for(int i=0;i<n1;i++ ){
             char ch =word2.charAt(i);
          
          map2.put(ch,map2.getOrDefault(ch, 0) + 1);
           
        }

        
         for(int i=0;i<n1;i++ ){
             char ch =word1.charAt(i);
          
          if(map2.containsKey( ch )){
            continue;
          }
          else{
            return false;
          }
           
        }

        List<Integer> freq1 = new ArrayList<>(map1.values());
        List<Integer> freq2 = new ArrayList<>(map2.values());

        Collections.sort(freq1);
        Collections.sort(freq2);

        if (!freq1.equals(freq2)) {
                  return false;
        }


        return true;
    }
}