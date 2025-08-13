class Solution {
    public int maxVowels(String s, int k) {
       int n = s.length() ; 
       int l = 0 , count = 0 , maxv = Integer.MIN_VALUE;
       
       
        Set<Character> vowels = new HashSet<>();
         vowels.add('a');
         vowels.add('e');
         vowels.add('i');
         vowels.add('o');
         vowels.add('u');

         for( int r = 0 ; r < n ; r ++){
            char ch = s.charAt(r);

            if(vowels.contains(ch)){
                count ++;
            }

            if(r - l + 1 == k){
                maxv = Math.max(maxv , count);

                if(vowels.contains(s.charAt(l))){
                  count --;
                }
                
                l++;
            }
         }


       return maxv;
    }
}