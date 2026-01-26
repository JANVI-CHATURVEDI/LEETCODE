from collections import defaultdict
class Solution(object):
    def subarraySum(self, nums, k):
        map = defaultdict(int)
        map[0] = 1
        prefix = 0
        count = 0

        for num in nums:
            prefix += num
            if prefix - k in map:
                count += map[prefix - k]
            map[prefix] += 1

        return count        

        