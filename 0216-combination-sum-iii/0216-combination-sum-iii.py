class Solution(object):
    def combinationSum3(self, k, n):
        
        ans = []

        def helper(total , part , size , idx):
           
            if  total == n and size == k:
                ans.append(part[:])
                return

            if total > n or idx > 9 or size > k:
                return

            part.append(idx)
            helper(total + idx , part , size+1 , idx+1)
            part.pop()

            helper(total, part, size, idx + 1)
        
            

        helper(0 , [] , 0 , 1) 
        return ans
        