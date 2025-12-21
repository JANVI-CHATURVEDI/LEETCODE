class Solution(object):
    def combinationSum2(self, candidates, target):
        candidates.sort()
        ans = []

        def helper(total , part , idx):
           
            if  total == target:
                ans.append(part[:])
                return

            if idx == len(candidates) or total > target:
                return

            part.append(candidates[idx])
            helper(total + candidates[idx] , part , idx+1)
            part.pop()
        
            next_idx = idx + 1
            while next_idx < len(candidates) and candidates[next_idx] == candidates[idx]:
             next_idx += 1
        
            helper(total, part, next_idx)

        helper(0 , [] , 0) 
        return ans
