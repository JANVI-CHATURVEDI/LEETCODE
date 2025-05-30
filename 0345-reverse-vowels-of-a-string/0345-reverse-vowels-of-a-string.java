class Solution {
    public String reverseVowels(String s) {
         char[] chars = s.toCharArray(); 
      int n=chars.length; int leftv = -1 , rightv=-1;

      int left = 0 , right=n-1;
      while(left<=right){
        
        if( left<=right && isVowel(chars[left])){
           leftv=left;
        }
        else{
            if( left<=right){
               left++;
            }
        }

         if( left<=right && isVowel(chars[right])){
           rightv=right;
        }
        else{
            if( left<=right){
               right--;
            }
           
        }


        if(leftv != -1 && rightv !=-1){
            char temp=chars[leftv];
            chars[leftv] = chars[rightv];
            chars[rightv]=temp;
            left++;
            right--;
            leftv=-1;
            rightv=-1;
        }
      }

      return new String(chars);

    }

    public boolean isVowel(char ch) {
    ch = Character.toLowerCase(ch); // makes it lowercase
    return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
}

}