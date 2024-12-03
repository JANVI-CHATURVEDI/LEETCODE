class Solution {
public void solve(int[] nums, List<Integer> output,int index,List<List<Integer>> ans){
  
  if(index>=nums.length){
    ans.add(new ArrayList<>(output));
    return;
  }
//exclude
  solve(nums,output,index+1,ans);
//include
output.add(nums[index]);
solve(nums,output,index+1,ans);

//backtrack
output.remove(output.size()-1);
}


    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> output=new ArrayList<>();
        

         solve(nums,output,0,ans);
         return ans;

    }
}