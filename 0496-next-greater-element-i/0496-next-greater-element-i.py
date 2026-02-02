class Solution(object):
    def nextGreaterElement(self, nums1, nums2):
        stack = []
        next_greater_map = {}

        for num in nums2:
            while stack and num > stack[-1]:
                prev = stack.pop()
                next_greater_map[prev] = num
            stack.append(num)

        
        while stack :
            prev = stack.pop()
            next_greater_map[prev] = -1

        result = []
        for num in nums1:
            result.append(next_greater_map[num])

        return result    
                     


