class Solution(object):
    def search(self, nums, target):
        n = len(nums)
        s = 0
        e = n - 1
        mid = s + (e - s) / 2

        while s <= e :
            num = nums[mid]
            if num == target :
                return mid

            elif nums[s] <= num :
                if nums[s] <= target < num :
                    e = mid - 1
                else :
                    s = mid + 1

            else :
                if nums[e] >= target > num :
                    s = mid + 1
                else :
                    e = mid - 1
            
            mid = s + (e - s) / 2

        return -1