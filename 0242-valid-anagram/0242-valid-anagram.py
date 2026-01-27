from collections import defaultdict
class Solution(object):
    def isAnagram(self, s, t):
        
        if len(s) != len(t):
            return False

        map_s = defaultdict(int)
        map_t = defaultdict(int)
        
        for num in s:
            map_s[num] += 1

        for num in t:
            map_t[num] += 1    

        if map_t == map_s :
            return True    
        

        return False

        