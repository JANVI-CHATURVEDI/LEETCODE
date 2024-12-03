//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int getSecondLargest(int[] arr) {
    int l=arr.length;
    if(l==1){
        return -1;
    }
    int max=arr[0],smax=-1;
    for(int i=1;i<l;i++){
        if(arr[i]>max){
            smax=max;
            max=arr[i];
            
            
        }
         if(smax<arr[i] && arr[i]<max){
             smax=arr[i];
         }
    }return smax;
    }
}