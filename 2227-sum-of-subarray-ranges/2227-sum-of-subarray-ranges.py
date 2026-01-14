class Solution(object):
    def subArrayRanges(self, nums):
        n = len(nums)

        min_sum = 0
        stack = []

        for i in range(n + 1):
            while stack and (i == n or nums[stack[-1]] > nums[i]):
                mid = stack.pop()
                left = mid - (stack[-1] if stack else -1)
                right = i - mid
                min_sum += nums[mid] * left * right
            stack.append(i)

        
        max_sum = 0
        stack = []

        for i in range(n + 1):
            while stack and (i == n or nums[stack[-1]] < nums[i]):
                mid = stack.pop()
                left = mid - (stack[-1] if stack else -1)
                right = i - mid
                max_sum += nums[mid] * left * right
            stack.append(i)

        return max_sum - min_sum
