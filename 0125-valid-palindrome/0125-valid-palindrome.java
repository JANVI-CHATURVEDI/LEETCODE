class Solution {
    public boolean isPalindrome(String s) {
      int st=0;
        int e= s.length()-1;
        
       while(st<e){
            while (st < e && !Character.isLetterOrDigit(s.charAt(st))) {
                st++;
            }

            while (st < e && !Character.isLetterOrDigit(s.charAt(e))) {
                e--;
            }
          if (Character.toLowerCase(s.charAt(st)) != Character.toLowerCase(s.charAt(e))) {
                return false;
            }
           
           st++;
           e--;
            
        }  return true;  
    }
}