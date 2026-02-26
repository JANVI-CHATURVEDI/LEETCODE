class Solution(object):
    def numSteps(self, s):
        num = int(s, 2)
        step = 0

        while num != 1 :
            if num % 2 == 0 :
                num //= 2
                step += 1
            else :
                num += 1
                step += 1


        return step            
                

