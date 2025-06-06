class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0,j=n-1,max=0;


        while(i<j){
          int area = Math.min(height[i], height[j]) * (j - i);
         max = Math.max(max, area);
        
         if (height[i] < height[j]) {
                i++;
        } else {
                j--;
         }
        }



      return max;
        
    }
}