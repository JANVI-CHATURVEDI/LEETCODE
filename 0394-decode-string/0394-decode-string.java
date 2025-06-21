class Solution {
    public String decodeString(String s) {
        int n=s.length(); String result;
        Stack<String> str = new Stack<>();
        Stack<Integer> num = new Stack<>();
        StringBuilder sb = new StringBuilder();
       
     
        for(int i=0;i<n;i++){
         char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                   int numb = 0;
               while (i < n && Character.isDigit(s.charAt(i))) {
                  numb = numb * 10 + (s.charAt(i) - '0');
                   i++;
               }
                   i--; // step back because outer loop will also do i++
                num.push(numb);
            }
            else{
                if(ch == '['){
                   String c= String.valueOf(ch);
                    str.push(c);
                }
                else if(ch == ']'){
                   while (!str.peek().equals("[")) {
                        sb.insert(0, str.pop());
                        
                    }
                    str.pop();
                    int numb = num.pop();
                     result = sb.toString().repeat(numb);
                    str.push(result);
                    sb.setLength(0);
                    
                }
                else{
                   String c= String.valueOf(ch);
                    str.push(c);
                }
            }
        }     
   
   
         StringBuilder finalResult = new StringBuilder();
                   for (String part : str) {
                         finalResult.append(part);
                    }
     
      return finalResult.toString();

    }
}
