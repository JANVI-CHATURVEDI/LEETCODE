class Solution(object):
    def wordBreak(self, s, wordDict):
        wordSet = set(wordDict)
        memo = {}
        def helper(start):
            if start == len(s):
                return True

            if start in memo:
                return memo[start]
    
            
            for end in range(start + 1, len(s) + 1):
                prefix = s[start:end]
                
                if prefix in wordSet and helper(end):
                    memo[start] = True
                    return True
            
            memo[start] = False
            return False

        return helper(0)