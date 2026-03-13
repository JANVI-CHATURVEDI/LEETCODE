from typing import List

class Solution:
    def minNumberOfSeconds(self, mountainHeight: int, workerTimes: List[int]) -> int:

        def units_by_worker(w, t):
            left, right = 0, mountainHeight
            while left < right:
                mid = (left + right + 1) // 2
                if w * mid * (mid + 1) // 2 <= t:
                    left = mid
                else:
                    right = mid - 1
            return left

        left, right = 0, 10**18
        while left < right:
            mid = (left + right) // 2
            total = sum(units_by_worker(w, mid) for w in workerTimes)
            if total >= mountainHeight:
                right = mid
            else:
                left = mid + 1
        return left