class Solution {
public void solve(List<Integer> nums, List<Integer> output,int index,List<List<Integer>> ans){
  
  if(index>=nums.size()){
    ans.add(new ArrayList<>(output));
    return;
  }
//exclude
  solve(nums,output,index+1,ans);
//include
output.add(nums.get(index));
solve(nums,output,index+1,ans);

//backtrack
output.remove(output.size()-1);
}


    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> output=new ArrayList<>();
         List<Integer> numsList=new ArrayList<>();
         for (int num:nums){
            numsList.add(num);
         }

         solve(numsList,output,0,ans);
         return ans;

    }
}