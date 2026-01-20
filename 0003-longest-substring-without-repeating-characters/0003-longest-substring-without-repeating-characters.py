class Solution(object):
    def lengthOfLongestSubstring(self, s):
        n = len(s)
        start = 0
        end = 0
        l = []
        maxl = 0

        while end < n :
            if s[end] in l:
                maxl = max(maxl , end - start)
                while s[end] in l:
                    l.remove(s[start])
                    start += 1
                
            else:
                l.append(s[end])
                end += 1
        
        
        return max(maxl, end - start)
