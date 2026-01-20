class Solution(object):
    def isPalindrome(self, s):
        str = "".join(ch.lower() for ch in s if ch.isalnum())

        l = 0
        r = len(str) - 1

        while l < r:
            if str[l] != str[r]:
                return False
            l += 1
            r -= 1

        return True
