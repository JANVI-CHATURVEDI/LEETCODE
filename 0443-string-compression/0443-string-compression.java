class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int write = 0 , read = 0 ;

        if(n == 1){
            return 1 ; 
        }

        while(read < n ){
            char ch = chars[read];
            int count = 0 ;

            while(read < n && chars[read] == ch){
                read++;
                count++;

            } 

            chars[write] = ch ;
            write++;

            if(count > 1){
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }

            count = 0 ;
        }
        return write;
    }
}