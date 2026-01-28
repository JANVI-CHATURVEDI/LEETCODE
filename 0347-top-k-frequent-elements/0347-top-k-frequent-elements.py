from collections import defaultdict
import heapq
class Solution(object):
    def topKFrequent(self, nums, k):
        map = defaultdict(int)

        for num in nums:
            map[num] += 1

            
        top_keys = heapq.nlargest(k , map, key=map.get)

        return list(top_keys)