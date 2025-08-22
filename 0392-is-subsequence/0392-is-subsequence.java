class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int s1 = 0 , s2 = 0 ; 

        while(s1 < s.length() && s2 < t.length()){
           
           char ch = s.charAt(s1);

           if( t.charAt(s2) == ch ){
                s1++;
           }
           
           s2++;

        }

        return s1 == s.length();
    }
}