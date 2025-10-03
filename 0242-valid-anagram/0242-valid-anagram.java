class Solution {
    public boolean isAnagram(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();

        if(n2 != n1) return false ;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        
        for(int i = 0 ; i < n1 ; i++ ){
            map1.put(s.charAt(i) , map1.getOrDefault(s.charAt(i) , 0) + 1);
        }

         for(int i = 0 ; i < n2 ; i++ ){
            map2.put(t.charAt(i) , map2.getOrDefault(t.charAt(i) , 0) + 1);
        }

        for (char key : map1.keySet()) {
            if (!map1.get(key).equals(map2.getOrDefault(key, 0))) {
                return false;
            }
        }
      return true ;
    }
}