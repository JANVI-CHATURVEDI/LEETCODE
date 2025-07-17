class Solution {
    public int maxArea(int[] height) {
        int n=height.length; int marea=0;
        int left =0;
        int right=n-1;

        while(left < right){
          int area = (right - left)* Math.min(height[left] , height[right]);

          if(area > marea) marea=area;

          if(height[left] < height[right]) left++;
          else right--;


           }

           return marea;
    }
}