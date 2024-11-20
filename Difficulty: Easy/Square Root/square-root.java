//{ Driver Code Starts
import java.util.Scanner;

class SquartRoot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int a = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.floorSqrt(a));
            t--;
        }
    }
}
// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution {
    int floorSqrt(int n) {
        if(n==0) return 0;
        int s=0; int e=n;  int ans=0;
        
        while (s<=e){
            int mid= s+(e-s)/2;
            int sq=mid*mid;
            if(sq== n) return mid;
            if( sq > n) e=mid-1;
            if(sq< n){ 
                ans=mid;
                s=mid+1;
            }
        } return ans;
        // Your code here
    }
}
