class Solution(object):
    def hasAllCodes(self, s, k):
        seen = set()
        
        for i in range(len(s) - k + 1):
            substring = s[i:i+k]
            seen.add(substring)
        
        return len(seen) == 2 ** k