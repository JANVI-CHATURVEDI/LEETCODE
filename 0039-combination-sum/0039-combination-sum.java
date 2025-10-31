class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> myList = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        helper(0, candidates, target, current, myList);
        return myList;

        
    }
    public void helper(int index, int[] candidates, int target,
                       List<Integer> current, List<List<Integer>> myList){


        if(target == 0 ){
            myList.add(new ArrayList<>(current));
            return ;
        } 

        if(index == candidates.length || target < 0) {
            return;
        }      

        current.add(candidates[index]);
        helper(index, candidates, target - candidates[index], current, myList);  
        current.remove(current.size() - 1);      


        helper(index + 1, candidates, target, current, myList);

    }


}