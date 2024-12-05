class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n= strs.length;
        if(strs==null||n==0){
            return "";
        }
        String prefix = strs[0];

       for(int i=0;i<n;i++){
        while(!strs[i].startsWith(prefix)){
              prefix = prefix.substring(0, prefix.length() - 1);
        }
       }return prefix;
    }
}