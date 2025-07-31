class Solution(object):
    def minEatingSpeed(self, piles, h):
        s = 1
        r = max(piles)
        result = r

        while s <= r:
            mid = (s + r) // 2

            if self.canEatAll(piles, mid, h):
                result = mid
                r = mid - 1
            else:
                s = mid + 1

        return result


    def canEatAll(self , piles , mid , h):
        hours = 0
        for x in piles:
           hours += x // mid

           if(x % mid != 0):
               hours += 1

        return hours <= h
        