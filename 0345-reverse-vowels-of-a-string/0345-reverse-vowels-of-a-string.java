class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int l = 0, r = arr.length - 1;

        while (l < r) {
            while (l < r && "aeiouAEIOU".indexOf(arr[l]) == -1) l++;
            while (l < r && "aeiouAEIOU".indexOf(arr[r]) == -1) r--;

            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
        }
        return new String(arr);
    }
}
