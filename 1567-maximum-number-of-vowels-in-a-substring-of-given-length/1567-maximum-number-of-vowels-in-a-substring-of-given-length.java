class Solution {
    public int maxVowels(String s, int k) {
     int n=s.length(); int currentcount=0; int maxVowels = 0;

     for(int i=0;i<k;i++){
        if(isVowel(s.charAt(i))){
            currentcount++;
        }
      }

      maxVowels=currentcount;

      for(int i=k;i<n;i++){
          if(isVowel(s.charAt(i-k))){
            currentcount--;
        }

          if(isVowel(s.charAt(i))){
            currentcount++;
        }
          maxVowels = Math.max(maxVowels,currentcount);
      }

      
        return maxVowels;

    }
   
     public boolean isVowel(char ch){
        ch=Character.toLowerCase(ch);
        return (ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u');
    }
}