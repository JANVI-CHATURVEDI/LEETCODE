class Solution(object):
    def letterCombinations(self, digits):
        phone = {
            "2": "abc",
            "3": "def",
            "4": "ghi",
            "5": "jkl",
            "6": "mno",
            "7": "pqrs",
            "8": "tuv",
            "9": "wxyz"
        }

        result = []

        def helper(idx , currstr ):

            if idx == len(digits):
                result.append(currstr)
                return

            letter = phone[digits[idx]]

            for ch in letter:
                helper(idx + 1 , currstr + ch )

        helper(0 , '')    

        return result          
            


        
        