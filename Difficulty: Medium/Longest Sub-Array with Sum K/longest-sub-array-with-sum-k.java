//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim()); // Read number of test cases

        while (t-- > 0) {
            String line = read.readLine().trim(); // Read the array input
            String[] numsStr = line.split(" ");   // Split the input string by spaces
            int[] nums =
                new int[numsStr.length]; // Convert string array to integer array
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            int k = Integer.parseInt(read.readLine().trim()); // Read target sum

            Solution ob = new Solution();
            int ans =
                ob.lenOfLongestSubarr(nums, k); // Call the function and store result
            System.out.println(ans);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int lenOfLongestSubarr(int[] arr, int k) {
        int n= arr.length;
   Map<Long, Integer> prefixSumMap = new HashMap<>();
        long currentSum = 0;
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            currentSum += arr[i];

            // Check if entire subarray from 0 to i forms the sum K
            if (currentSum == k) {
                maxLength = i + 1;
            }

            // Check if removing a prefix gives the sum K
            if (prefixSumMap.containsKey(currentSum - k)) {
                maxLength = Math.max(maxLength, i - prefixSumMap.get(currentSum - k));
            }

            // Store the current prefix sum only if it is not already present
            prefixSumMap.putIfAbsent(currentSum, i);
        }

        return maxLength;
    }
}
