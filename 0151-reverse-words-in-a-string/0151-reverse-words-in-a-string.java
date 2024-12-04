class Solution {
    public String reverseWords(String s) {
        char[] chars = s.trim().toCharArray();
        int n = chars.length;

        // Reverse the entire string
        reverse(chars, 0, n - 1);

        // Reverse each word and handle multiple consecutive spaces
        int start = 0, end = 0;
        for (int i = 0; i <= n; i++) {
            if (i == n || chars[i] == ' ') {
                reverse(chars, start, end - 1);
                start = i + 1;
                end = start;
            } else {
                end++;
            }
        }

        // Remove extra spaces
        int writeIndex = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0 || chars[i] != ' ' || chars[i - 1] != ' ') {
                chars[writeIndex++] = chars[i];
            }
        }

        return new String(chars, 0, writeIndex);
    }

    private void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--; 
        }
    }
}