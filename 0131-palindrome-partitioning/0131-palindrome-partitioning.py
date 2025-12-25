class Solution:
    def partition(self, s):
        res = []
        path = []

        def is_palindrome(sub):
            return sub == sub[::-1]

        def dfs(start):
            
            if start == len(s):
                res.append(path[:])
                return

            
            for end in range(start, len(s)):
                substring = s[start:end + 1]

                if is_palindrome(substring):
                    path.append(substring)
                    dfs(end + 1)
                    path.pop()  

        dfs(0)
        return res
