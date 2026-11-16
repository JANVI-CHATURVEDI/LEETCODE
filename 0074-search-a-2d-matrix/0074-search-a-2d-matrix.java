class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int n = matrix[0].length;
        int m = matrix.length;
        int i = 0;
        int j = m*n-1;

        while(i <= j){
            int mid = i + (j-i)/2;
            
            int row = mid / n;
            int col = mid % n;

            int value = matrix[row][col];

            if(value == target) return true;

            else if(value > target){
                j = mid - 1;
            }
            else{
                i = mid + 1;
            }
             

        }

        return false;
        
    }
}