class Solution(object):
    def subsetsWithDup(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums.sort()
        result = [] 
        subset = []

        def backtrack(index):

            result.append(list(subset))

            for i in range(index, len(nums)):
                if i > index and nums[i] == nums[i - 1]:
                    continue

                subset.append(nums[i])
                backtrack(i + 1)
                subset.pop()


        backtrack(0)
        return result 
