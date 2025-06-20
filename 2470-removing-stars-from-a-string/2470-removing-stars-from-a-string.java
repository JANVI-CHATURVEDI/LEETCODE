class Solution {
    public String removeStars(String s) {
        int n=s.length();
         Stack<Character> stack = new Stack<>();

         for(int i=0;i<n;i++){
           char ch= s.charAt(i);
           if(ch=='*'){
            stack.pop();
            continue;
           }
           else{
            stack.push(ch);
           }
         }

          StringBuilder sb = new StringBuilder();
           for(char i : stack){
       
            sb.append(i);
           }
        return sb.length() == 0 ? "": sb.toString();
    }
}