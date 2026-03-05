class Solution(object):
    def minOperations(self, s):
        count1 = 0  
        count2 = 0  

        for i, c in enumerate(s):
            if int(c) != i % 2:
                count1 += 1
            else:
                count2 += 1

        return min(count1, count2)
        