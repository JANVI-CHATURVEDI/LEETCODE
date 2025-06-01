class Solution {
    public String reverseWords(String s) {
    
    char[] chars = s.trim().toCharArray();
    int n = chars.length;
     
     reverse(chars,0,n-1);

     int writeindex=0;
     int start=0;
     
     for(int end=0; end<=n ; end ++){
        if( end == n || chars[end]==' '){
            reverse(chars , start , end-1);

            for(int i=start ;i<end;i++){
                chars[writeindex++]= chars[i];

            }

            if(end<n){
               chars[writeindex++]=' ';
            }

            // Skip extra spaces between words
                while (end + 1 < n && chars[end + 1] == ' ') {
                    end++;
                }

            start=end+1;
      }
     }

       
      return new String(chars,0,writeindex);
    
    }

    public void reverse(char[] chars , int left , int right){
        while(left<right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right]=temp;
            left++;
            right--;
        }
    }
}