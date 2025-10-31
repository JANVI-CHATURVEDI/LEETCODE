class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> myList = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        
        helper(1, n, k, current, myList);
        
        
        return myList;

        
    }

    public void helper(int num ,  int n , int k ,
                       List<Integer> current, List<List<Integer>> myList){


        if( current.size() == k ){
            myList.add(new ArrayList<>(current));
            return ;
        } 

        if (num > n) {
            return;
        }

            

        current.add(num);
        helper( num + 1 , n ,k , current, myList);  
        current.remove(current.size() - 1);      


        helper(num + 1 , n , k , current, myList);

    }
}