class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        
        Set<Character> vowels = new HashSet<>();
        for (char c : "aeiouAEIOU".toCharArray()) {
            vowels.add(c);
        }

        
        StringBuilder sb = new StringBuilder(s);
        int l = 0, r = sb.length() - 1;

        while(l < r ){

            while (l < r && !vowels.contains(sb.charAt(l))) {
                l++;
            }

            while (l < r && !vowels.contains(sb.charAt(r))) {
                r--;
            }


            char temp = sb.charAt(l);
            sb.setCharAt(l , sb.charAt(r));
            sb.setCharAt(r, temp);
            
            l++;
            r--;


        }
       return sb.toString();
    }
}