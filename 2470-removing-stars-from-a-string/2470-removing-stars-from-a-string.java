class Solution {
    public String removeStars(String s) {
        int n = s.length();
        Stack <Character> stack = new Stack <>();
        StringBuilder sb = new StringBuilder();
     
        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            
            if( ch == '*'){
              stack.pop();
              continue;
            }
            
            stack.push(ch);
        }

        for (char item : stack) {
             sb.append(item);
        }

       return sb.toString();
    }
}