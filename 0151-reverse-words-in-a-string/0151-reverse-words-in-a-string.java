class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");

        // Reverse the order of words
        reverseArray(words);

        return String.join(" ", words);
    }

    private void reverseArray(String[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}