class Solution {
    public int countPrimes(int n) {
     // Sieve of Eratosthenes
    // Time Complexity O(N * log(logN))
    // Space Complexity O(N)
        if (n <= 2) return 0;
        
        boolean[] isPrime = new boolean[n];
        // By Default all the values in the Boolean Array are false
        for (int i = 2; i * i < n; i++) {
             // False in Array Means Number is Prime
            if (!isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                     // Make all Multiples of i to True
                    isPrime[j] = true;
                }
            }
        }
        
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!isPrime[i]) count++;
        }
        
        return count;
   
    
    }
}
