class Solution {
    public int[] asteroidCollision(int[] asteroids) {
       
        Stack<Integer> stack = new Stack <>();

        for(int i=0 ; i< asteroids.length ; i++){
             boolean alive = true;
            int a = asteroids[i];
            
               while( !stack.isEmpty() && stack.peek() >0 && a < 0 ){
                int num = -a;
                int snum = stack.peek();

                if(num > snum){
                    stack.pop();
                }
                else if(num == snum){
                    stack.pop(); 
                    alive = false;
                    break;
                }
                else{
                    alive = false;
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