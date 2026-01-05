class Solution(object):
    def numberOfSubstrings(self, s):
        count = {'a':0 , 'b':0 , 'c':0}
        l = 0
        n = len(s)
        ans = 0
        

        for r in range(n):
            count[s[r]] += 1

            while count['a'] > 0 and count['b'] > 0 and count['c'] > 0 :
                ans += n - r
                count[s[l]] -= 1
                l += 1

        return ans        


        