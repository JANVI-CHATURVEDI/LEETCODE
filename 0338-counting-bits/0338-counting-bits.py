class Solution(object):
    def countBits(self, n):
       result = [0] * (n + 1)
       for i in range(1,n+1):
        if(i % 2 != 0):
            result[i] = result[i // 2]+1
        else:
            result[i] = result[i // 2]    
       return result  