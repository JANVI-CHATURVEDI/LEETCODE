class Solution(object):
    def trap(self, height):
        if not height:
            return 0

        l = 0
        r = len(height) - 1
        lmax = 0
        rmax = 0
        water = 0

        while l < r :
            if height[l] < height[r]:
                if height[l] > lmax:
                    lmax = height[l]
                else:
                    water += lmax - height[l]
                l += 1
            else:
                if height[r] > rmax:
                    rmax = height[r]
                else:
                    water += rmax -height[r]
                r -= 1        

        return water