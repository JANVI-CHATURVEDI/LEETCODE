class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;

        for (int i = 0; i < n; i++) {  // Fix start index
            boolean[] arr = new boolean[128];  // Track visited characters
            int length = 0;

            for (int j = i; j < n; j++) {  // Expand substring
                char c = s.charAt(j);
                if (arr[c]) break;  // Stop if duplicate is found
                
                arr[c] = true;  // Mark character as seen
                length++;  
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }
}
