class Solution(object):
    def minSubArrayLen(self, target, nums):
        s = 0 
        e = 0 
        n = len(nums)
        minlen = float('inf')
        sum = 0

        while e < n:
            sum += nums[e]
            
            while sum >= target:
                minlen =  min(minlen , e - s + 1)
                sum -= nums[s]
                s += 1

            e += 1    

        return 0 if minlen == float('inf') else minlen


