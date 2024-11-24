//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int m = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.nthRoot(n, m);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    
     public static int intPower(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
             if (result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        }
        return result;
     }
    
    
    public int nthRoot(int n, int m) {
        int s=1;
        int e= m;
        
        if(n == 1){
                return m;
            }
              
        
        
        while(s<=e) {
          int mid=s+(e-s)/2;    
          
          int result = intPower(mid, n);
            if(result == m){
                return mid;
            }
            
              if(result>m) {
                  e= mid-1;
                  
              }
              else{
                  s=mid + 1;
              }
        } return  -1; 
    }
}