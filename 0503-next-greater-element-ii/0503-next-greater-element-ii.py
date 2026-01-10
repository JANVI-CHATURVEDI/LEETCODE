class Solution(object):
    def nextGreaterElements(self, nums):
        n = len(nums)
        stack = []
        result = [-1] * n  

        
        for i in range(2 * n):
            num = nums[i % n]  

            while stack and nums[stack[-1]] < num:
                idx = stack.pop()
                result[idx] = num

            if i < n:  
                stack.append(i)

        return result
