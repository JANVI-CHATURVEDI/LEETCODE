class Solution(object):
    def isPalindrome(self, x):
        
        if x < 0 or x % 10 == 0 and x != 0:
            return False

        reverse = 0
        num = x

        while num :
            Int = num % 10
            reverse = reverse * 10 + Int
            num /= 10


        if x == reverse :
            return True 
              
        return False