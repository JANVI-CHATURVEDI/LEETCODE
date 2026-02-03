class Solution(object):
    def search(self, nums, target):
        n = len(nums)
        l = 0
        r = n - 1
        mid = l + (r - l) // 2
        while l <= r :
            num = nums[mid]
            if num == target :
                return mid
            elif num < target :
                l = mid + 1
            else :
                r = mid - 1

            mid = l + (r - l) // 2    
            
        return -1   