

 class Solution {
    public String reverseWords(String s) {
        // Trim leading and trailing spaces and split the string by spaces
        String[] words = s.trim().split("\\s+");
        
        StringBuilder reversed = new StringBuilder();
        
        // Iterate from the last word to the first
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" "); // Add space between words
            }
        }
        
        return reversed.toString();
    }
}