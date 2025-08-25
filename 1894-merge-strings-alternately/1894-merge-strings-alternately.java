class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        int  l1 = 0 , l2 = 0 ;
        
        StringBuffer sb = new StringBuffer();
        
        while( l1< n1 && l2 < n2){
           
           if(l1 < n1){
              sb.append(word1.charAt(l1));
           }

           if(l2 < n2){
              sb.append(word2.charAt(l2));
           }

           l1++;
           l2++;
            
        }
        
        if( l1< n1 || l2 < n2 ){
            while(l1< n1 ){
                sb.append(word1.charAt(l1));
                l1++;
            }

             while(l2 < n2 ){
                sb.append(word2.charAt(l2));
                l2++;
            }

        }

        return sb.toString();
    }
}