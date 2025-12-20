class Solution(object):
    def combinationSum(self, candidates, target):
       ans = []

       def helper(total , part , idx):
        
        if  total == target:
            ans.append(part[:])
            return

        if idx == len(candidates):
            return

        
        if total > target:
            return
        
        
        part.append(candidates[idx])
        helper(total + candidates[idx] , part , idx)
        part.pop()
        helper(total  , part , idx + 1)

       helper(0 , [] , 0) 
       return ans
