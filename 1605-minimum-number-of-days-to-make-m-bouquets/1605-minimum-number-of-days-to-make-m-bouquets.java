class Solution {

    public int possible(int arr[],int day,int m,int k){
        int count=0; int nob=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=day) count++;
             else{
            nob+=count/k;
            count=0;
        }

        }
       
        nob+=count/k;
        return nob;
    }
    
    public int minDays(int[] bloomDay, int m, int k) {
        int n= bloomDay.length;
        if(n<m*k){
            return -1;
        }

        int min=Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (bloomDay[i] < min) {
                min = bloomDay[i];
            }
        }
      int low=min;


       int max = bloomDay[0]; // Assume the first element is the largest
        for (int i = 1; i < n; i++) {
            if (bloomDay[i] > max) {
                max = bloomDay[i];
            }
        }
      int high=max;
     
     int result=-1;

      while(low<=high){

        int mid=low+(high-low)/2;
        int noofbouquets=possible(bloomDay,mid,m,k);
        if(noofbouquets >=m){
            result = mid;
            high=mid-1;
        }
    else{
        low=mid+1;
    }

      }


        return result;
    }
}