class Solution {
    public String simplifyPath(String path) {
        String[] arr = path.split("/"); 
       Stack<String> stack = new Stack<>();

           for(String ch: arr){
            if(ch.equals("..") && !stack.empty()){
                stack.pop();
            }
            else if(!ch.equals("") && !ch.equals(".") && !ch.equals("..") ){
                stack.push(ch);
            }

           }

           StringBuilder sb = new StringBuilder();
           
           for(String i : stack){
            sb.append('/');
            sb.append(i);
           }
        return sb.length() == 0 ? "/": sb.toString();
    }
}