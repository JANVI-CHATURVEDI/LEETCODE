class Solution(object):
    def findDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        slow = nums[0]
        fast = nums[0]

        while True :
            slow = nums[slow]
            fast = nums[nums[fast]]
            if slow == fast:
                break

        slow2 = nums[0]
        while slow2 != slow:
            slow2 = nums[slow2]
            slow = nums[slow]
        
        return slow        
        