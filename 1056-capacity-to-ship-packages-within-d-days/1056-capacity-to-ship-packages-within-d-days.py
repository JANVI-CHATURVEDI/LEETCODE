class Solution(object):
    def shipWithinDays(self, weights, days):
        low = max(weights)
        high = sum(weights)

        while low <= high:
            mid = low + (high - low) // 2

            days1 = 1
            tsum = 0

            for w in weights:
                tsum += w
                if tsum > mid:
                    days1 += 1
                    tsum = w

            if days1 <= days:
                high = mid - 1
            else:
                low = mid + 1

        return low



                                      





        