class Solution(object):
    def maxScore(self, cardPoints, k):
        n = len(cardPoints)
        
        
        if k == n:
            return sum(cardPoints)
        
        total_sum = sum(cardPoints)
        window_size = n - k
        
        
        window_sum = sum(cardPoints[:window_size])
        min_window_sum = window_sum
        
        for i in range(window_size, n):
            window_sum += cardPoints[i]
            window_sum -= cardPoints[i - window_size]
            min_window_sum = min(min_window_sum, window_sum)
        
        return total_sum - min_window_sum
