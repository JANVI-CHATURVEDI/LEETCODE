class Solution(object):
    def concatenatedBinary(self, n):
        concat = "" 
        for i in range(1, n+1):
            binary = bin(i)[2:]
            concat += binary


        MOD = 10**9 + 7
        return int(concat, 2) % MOD 
