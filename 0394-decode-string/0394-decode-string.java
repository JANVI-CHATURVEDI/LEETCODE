class Solution {
    public String decodeString(String s) {
      int n = s.length();
      Stack<Integer> num = new Stack <>();
      Stack<String> str = new Stack <>();
      StringBuilder sb = new StringBuilder();

      for(int i = 0 ; i<n ; i++){
        char ch = s.charAt(i);
        
        if(Character.isDigit(ch)){
            int numb = 0;

            while(i<n && Character.isDigit(s.charAt(i)) ){
                numb = numb*10 + (s.charAt(i)- '0');
                i++;
            }
            i--;

            num.push(numb);
        }

        else{
            if(ch == '['){
                String c = String.valueOf(ch);
                str.push(c);
            }
            else if (ch == ']'){
                while(!str.isEmpty()  &&!str.peek().equals( "[")){
                    sb.insert(0 , str.pop());
                }
                 
                if(!str.isEmpty() ){
                    str.pop();
                }
                
                int numb = num.pop();
                String result = sb.toString().repeat(numb);
                str.push(result);
                sb.setLength(0);
            }
            else{
                String c = String.valueOf(ch);
                str.push(c); 
            }
        }
      }

      StringBuilder finalresult = new StringBuilder();

      for(String part : str){
        finalresult.append(part);
      }

      return finalresult.toString();
    }
}