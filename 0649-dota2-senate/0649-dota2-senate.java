class Solution {
    public String predictPartyVictory(String senate) {
        char[] str = senate.toCharArray();

        Queue<Character> q = new LinkedList<>();
        int i = 0, count = 0;

        while(count<senate.length()){
            if(str[i%str.length]=='x'){
                count++;
            }
            else if(q.isEmpty()){
                count++;
                q.add(str[i%str.length]);
            }
            else{
                if(q.peek()!=str[i%str.length]){
                    q.poll();
                    str[i%str.length] = 'x';
                    count = 0;
                }
                else{
                    q.add(str[i%str.length]);
                    count++;
                }
            }
            i++;
        }
        
        if(q.peek()=='R') return "Radiant";
        return "Dire";
    }
}