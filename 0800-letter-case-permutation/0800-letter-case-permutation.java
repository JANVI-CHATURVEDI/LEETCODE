class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        solve(s, 0, "", result);
        return result;
    }
    
    private void solve(String s, int index, String output, List<String> result) {
        if(index == s.length()) {
            result.add(output);
            return;
        }
        
        char ch = s.charAt(index);
        
       
        if(Character.isDigit(ch)) {
            solve(s, index + 1, output + ch, result);
        } 
        else {
           
            solve(s, index + 1, output + Character.toLowerCase(ch), result);
            
            solve(s, index + 1, output + Character.toUpperCase(ch), result);
        }
    }
}
