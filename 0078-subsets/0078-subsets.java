class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    void solve(int index, int[] nums, List<Integer> output, List<List<Integer>> ans) {
       
        if (index == nums.length) {
            ans.add(new ArrayList<>(output));
            return;
        }

        
        solve(index + 1, nums, output, ans);

        
        output.add(nums[index]);
        solve(index + 1, nums, output, ans);

       
        output.remove(output.size() - 1);
    }
}
