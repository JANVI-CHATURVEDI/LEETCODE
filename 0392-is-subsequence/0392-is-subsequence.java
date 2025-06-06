class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int n1=s.length();
        int n2=t.length();
        int i=0,j=0,k=0;

       while(i<n1 && j<n2){
        if(s.charAt(i)==t.charAt(j)){
            k++;
            i++;
            j++;
        }
        else{
            j++;
        }
       }

       if(k==n1){
        return true;
       }

       return false;

    }
}