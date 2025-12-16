class Solution {

    public int myAtoi(String s) {
        s = s.trim();
        if(s.length() == 0 ) return 0 ;

        int sign = 1;
        int start = 0 ;
        if(s.charAt(0) == '-'){
            sign = -1;
            start = 1;
        }
        else if(s.charAt(0) == '+') {
            start = 1 ; 
        }

        return myAtoiRecursion(s, start, 0L , sign);
    }

    public int myAtoiRecursion(String s, int index, long result, int sign) {
        if(index == s.length()) return (int)(result * sign);

        char c = s.charAt(index);
        if(c < '0' || c > '9') return (int)(result * sign);

        int digit = c - '0';
        result = result * 10 + digit;

        
        if(sign == 1 && result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(sign == -1 && -result < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return myAtoiRecursion(s, index + 1, result, sign);
    }
}