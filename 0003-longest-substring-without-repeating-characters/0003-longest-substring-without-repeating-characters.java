class Solution {
    public int lengthOfLongestSubstring(String s) {
        int  n = s.length();
        Map<Character, Integer> lastSeen = new HashMap<>();
        int left = 0 , maxlen = 0;
        
        for(int right = 0 ; right < n ; right++){
            char ch = s.charAt(right);

            if (lastSeen.containsKey(ch) && lastSeen.get(ch) >= left){
                left = lastSeen.get(ch) + 1;
            }

            lastSeen.put(ch, right);
            maxlen = Math.max(maxlen, right - left + 1);
        }

        return maxlen ;
    }
}