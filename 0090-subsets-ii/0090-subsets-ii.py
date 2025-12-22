class Solution(object):
    def subsetsWithDup(self, nums):
       res = []
       nums.sort()
       

       def helper(nums , arr , idx):

          if idx == len(nums):
            res.append(arr[:])
            return 

          
          arr.append(nums[idx])
          helper(nums , arr , idx+1 )  
          arr.pop()
          
          next_idx = idx + 1
          
          while next_idx < len(nums) and nums[next_idx] == nums[idx]:
           next_idx += 1

          helper(nums , arr , next_idx )
        
          
          
       helper(nums, [] , 0)
       return res
        