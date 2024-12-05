class Solution {
    public String largestOddNumber(String num) {
        int n = num.length(); // Get the length of the string
        
        // Traverse the string from the end to find the largest odd number
        for (int i = n - 1; i >= 0; i--) {
            int digit = num.charAt(i) - '0'; // Convert character to integer
            if (digit % 2 != 0) { // Check if the digit is odd
                return num.substring(0, i + 1); // Return substring up to the odd digit
            }
        }
        
        return ""; // If no odd number is found, return an empty string
    }
}
