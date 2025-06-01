class Solution {
    public String reverseWords(String s) {

       int n= s.length();
       StringBuilder word=new StringBuilder();
       StringBuilder ans=new StringBuilder();

       for(int i=n-1;i>=0;i--){
        char ch= s.charAt(i);
        if(ch!=' '){
            word.insert(0,ch);

        }
        else if(word.length()>0){
            if(ans.length()>0){
                ans.append(" ");
            }
            ans.append(word);
             word.setLength(0);
        }
       }

       if(word.length()>0){
         if(ans.length()>0){
                ans.append(" ");
            }
            ans.append(word);
       }
        return ans.toString();
    }
}