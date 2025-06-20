class Solution {
    public int[] asteroidCollision(int[] asteroids) {
         Stack<Integer> stack = new Stack<>();
         

         for(int a: asteroids){
           boolean alive = true;

               while (!stack.isEmpty() && a < 0 && stack.peek() > 0) {
               int num=-a;
               if(num>stack.peek()){
                stack.pop();
               }
               else if(num==stack.peek()){
                 stack.pop();
                 alive=false;
                 break;
               }
               else{
                alive=false;
                break;
               }
               }

               if(alive){
                stack.push(a);
               }
         }


         int[] result = new int[stack.size()];

         for (int j = result.length - 1; j >= 0; j--) {
                   result[j] = stack.pop(); // last in → first out
         }

         return result;
    }
}