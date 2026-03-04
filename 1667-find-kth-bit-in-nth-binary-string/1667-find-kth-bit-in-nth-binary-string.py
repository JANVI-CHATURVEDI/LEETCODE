class Solution(object):
    def findKthBit(self, n, k):
        
        if n == 1:
            return "0"
        
        length = 2**n - 1
        mid = (length // 2) + 1 
        
        if k == mid:
            return "1"
        elif k < mid:
            return self.findKthBit(n-1, k)
        else:
            mirrored_k = length - k + 1
            bit = self.findKthBit(n-1, mirrored_k)
            return "1" if bit == "0" else "0"