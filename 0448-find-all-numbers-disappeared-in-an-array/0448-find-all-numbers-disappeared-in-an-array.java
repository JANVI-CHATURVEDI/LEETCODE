class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        List<Integer> list = new ArrayList<>();
      HashSet<Integer> res=new HashSet<>();
      for(int i=0;i<n;i++){
        res.add(nums[i]);
      }  
      for(int i=1;i<=n;i++){
        if(!res.contains(i)){
            list.add(i);
        }
      }
        return list;
    }
}