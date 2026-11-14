class Solution {
    public int appendCharacters(String s, String t) {
        int n = s.length()-1;
        int m = t.length()-1;
        int i = 0;
        int j = 0;

        while(i <= n && j <= m ){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(j);
            if(ch1 == ch2){
                i++;
                j++;
            }
            else{
                i++;
            }
        }

        return m-j+1;
        
    }
}