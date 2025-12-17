class Solution {
    static final long MOD = 1000000007;

    public int countGoodNumbers(long n) {
        long evenPos = (n + 1) / 2; 
        long oddPos = n / 2;        

        long result = (power(5, evenPos) * power(4, oddPos)) % MOD;
        return (int) result;
    }

    public long power(long base, long exp) {
        if (exp == 0) return 1;

        long half = power(base, exp / 2);
        long ans = (half * half) % MOD;

        if (exp % 2 == 1) {    
            ans = (ans * base) % MOD;
        }

        return ans;
    }
}