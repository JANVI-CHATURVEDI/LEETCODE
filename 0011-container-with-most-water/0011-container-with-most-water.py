class Solution(object):
    def maxArea(self, height):
        n = len(height)
        l = 0
        r = n - 1
        maxw = 0

        while l < r :
            if height[l] > height[r]:
                area = height[r]*(r-l)
                maxw = max(maxw , area)
                r -= 1
            elif height[l] <= height[r]:
                area = height[l]*(r-l)
                maxw = max(maxw , area)
                l += 1

        return maxw         


        