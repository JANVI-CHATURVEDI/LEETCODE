class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length-1;
        int left = 0;
        int right = n;

        while(left != right){
            int add = numbers[left] + numbers[right];

            if(add == target){
                break;
            }
            else{
                if(add > target) right--;
                else left++;
            }
        }
        
        return new int[]{left+1,right+1};
        
    }
}