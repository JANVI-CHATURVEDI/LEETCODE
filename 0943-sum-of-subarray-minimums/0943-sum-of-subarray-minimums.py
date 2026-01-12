class Solution(object):
    def sumSubarrayMins(self, arr):
        MOD = 10**9 + 7
        n = len(arr)
        
        ple = [-1] * n
        stack = []
        for i in range(n):
            while stack and arr[stack[-1]] > arr[i]:
                stack.pop()
            ple[i] = stack[-1] if stack else -1
            stack.append(i)
        
        nle = [n] * n
        stack = []
        for i in range(n-1, -1, -1):
            while stack and arr[stack[-1]] >= arr[i]:
                stack.pop()
            nle[i] = stack[-1] if stack else n
            stack.append(i)
        
        res = 0
        for i in range(n):
            res += arr[i] * (i - ple[i]) * (nle[i] - i)
            res %= MOD
        
        return res
