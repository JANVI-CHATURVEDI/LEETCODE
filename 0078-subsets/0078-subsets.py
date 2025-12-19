class Solution(object):
    def subsets(self, nums):
       List = []
       

       def helper(nums , arr , idx):

          if idx == len(nums):
            List.append(arr[:])
            return 

          helper(nums , arr , idx+1 )
          arr.append(nums[idx])
          helper(nums , arr , idx+1 )  
          arr.pop()
          
       helper(nums, [] , 0)
       return List
        