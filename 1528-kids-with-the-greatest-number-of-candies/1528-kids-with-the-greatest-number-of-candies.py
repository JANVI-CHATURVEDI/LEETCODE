class Solution(object):
    def kidsWithCandies(self, candies, extraCandies):
        
        maxCandies = max(candies)
        return [c + extraCandies >= maxCandies for c in candies]
