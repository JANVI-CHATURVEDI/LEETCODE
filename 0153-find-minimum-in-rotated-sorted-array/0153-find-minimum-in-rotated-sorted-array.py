class Solution(object):
    def findMin(self, nums):
        n = len(nums)
        s = 0
        e = n-1
        mid = s + (e-s) // 2
        
        
        while s < e:
            num = nums[mid]
            if nums[e] < num:
                s = mid + 1

            else :
                e = mid        
               
            mid = s + (e-s)//2


        return nums[s]