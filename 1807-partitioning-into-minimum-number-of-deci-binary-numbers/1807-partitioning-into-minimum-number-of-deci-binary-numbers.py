class Solution(object):
    def minPartitions(self, n):
        l = len(n)
        max_num = 0
        for i in range(0 , l):
            num = n[i]
            max_num = max(max_num , int(num))
            

        return max_num
        