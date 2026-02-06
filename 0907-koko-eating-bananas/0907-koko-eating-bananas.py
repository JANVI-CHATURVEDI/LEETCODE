class Solution(object):
    def minEatingSpeed(self, piles, h):
        n = len(piles)
        s = 1
        e = max(piles)
        mid = s + (e - s)//2
        while s <= e :
            i = 0
            time = 0
            while i < n :
              time += (piles[i] + mid - 1) // mid
              i += 1
            
            if time <= h:
                e = mid -1
            else:
                s = mid + 1

            mid = s + (e - s)/2         

            
        return s
        