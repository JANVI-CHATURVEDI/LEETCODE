class Solution {
    public String reverseWords(String s) {
        String words[]=s.trim().split("\\s+");
        StringBuilder result=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
             result.append(words[i]);
             if (i != 0) { // Avoid adding a space at the end
                result.append(" ");
            }
        }return result.toString();
        
    }
}


/*                  Input: " hello world "

trim() removes leading and trailing spaces: "hello world".
split("\\s+") splits the string into words by one or more spaces: ["hello", "world"].
Traverse ["hello", "world"] in reverse:
Append world → "world".
Append a space → "world ".
Append hello → "world hello".
Output: "world hello"                            */