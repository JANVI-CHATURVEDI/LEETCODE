class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int[] arr = new int[128];  // Frequency array
        int left = 0;  // Left pointer

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            
            // If duplicate found, move left pointer
            while (arr[c] > 0) {
                arr[s.charAt(left)]--;  
                left++;  
            }

            arr[c]++;  // Mark character as seen
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;

       
       
       
       
       
       /*   BRUTE FORCE
       
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
        
        */
    }
}
