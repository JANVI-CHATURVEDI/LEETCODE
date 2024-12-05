class Solution {
    public boolean rotateString(String s, String goal) {
        // If lengths are not the same, no way to rotate
        if (s.length() != goal.length()) {
            return false;
        }
        // Check if goal is a substring of s + s
        return (s + s).contains(goal);
    }
}
