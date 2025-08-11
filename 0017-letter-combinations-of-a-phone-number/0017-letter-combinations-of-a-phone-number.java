class Solution {

    List<String> result = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        int n = digits.length();

        if(n == 0){
            return result;
        }

        Map<Character , String> map = new HashMap<>();
        map.put('2' , "abc");
        map.put('3' , "def");
        map.put('4' , "ghi");
        map.put('5' , "jkl");
        map.put('6' , "mno");
        map.put('7' , "pqrs");
        map.put('8' , "tuv");
        map.put('9' , "wxyz");

        backtrack(0 , digits , new StringBuilder() , map);
        return result ; 
    }

    void backtrack(int idx , String digits , StringBuilder temp , Map<Character , String> map){

        if(idx == digits.length()){
            result.add(temp.toString());
            return ;
        }

        char ch = digits.charAt(idx);
        String str = map.get(ch);

        for(int i=0 ; i<str.length() ; i++){
            temp.append(str.charAt(i));
            backtrack(idx+1 , digits , temp , map);
            temp.deleteCharAt(temp.length()-1);
        }
    }
}