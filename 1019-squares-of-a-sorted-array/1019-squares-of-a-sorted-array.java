class Solution {
    public int[] sortedSquares(int[] nums) {
        int n= nums.length;
       int[] newnums=new int[n] ;
       for(int i=0;i<n;i++){
       newnums[i]= nums[i]*nums[i];
       }
       Arrays.sort(newnums);
        return newnums;
    }
}