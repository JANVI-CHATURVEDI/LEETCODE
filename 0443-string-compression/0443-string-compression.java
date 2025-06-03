class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int index=0;
        int i=0;
       

        while(i<n){
            char currentchar=chars[i];
             int count=0;

            while(i<n && chars[i]==currentchar){
                i++;
                count++;
            }
            chars[index++]=currentchar;

            if(count>1){
                for(char digit:Integer.toString(count).toCharArray()){
                     chars[index]=digit;
                     index++;
                }
            }
        }
      return index;   
    }
}