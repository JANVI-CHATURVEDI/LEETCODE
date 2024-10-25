class Solution {
    public boolean isPalindrome(int x) {
       if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        while (x > reversed) {
            // Build the reversed number
            reversed = reversed * 10 + x % 10; // Add the last digit of x to reversed
            x /= 10; // Remove the last digit from x
        }

        // x can be equal to reversed (for even length) or reversed / 10 (for odd length)
        return x == reversed || x == reversed / 10;   
    }
}