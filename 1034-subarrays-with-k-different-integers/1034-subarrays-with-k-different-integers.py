class Solution(object):
    def subarraysWithKDistinct(self, nums, k):
        
        
        def atmost(k):
            count = {}
            left = 0
            ans = 0
            
            for right in range(len(nums)):
                count[nums[right]] = count.get(nums[right] , 0)+1

                while len(count) > k:
                    count[nums[left]] -= 1

                    if count[nums[left]] == 0 :
                        del count[nums[left]]
                    left += 1

                ans += right - left + 1
            return ans

        return atmost(k) - atmost(k-1)

        