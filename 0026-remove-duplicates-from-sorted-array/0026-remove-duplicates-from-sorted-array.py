class Solution(object):
    def removeDuplicates(self, nums):
        n = len(nums)
        l = 1 
        r = 1

        while r < n :
            if nums[l-1] != nums[r]:
                nums[l] = nums[r]
                l += 1
                r += 1
            else:
                r += 1    


        return l        