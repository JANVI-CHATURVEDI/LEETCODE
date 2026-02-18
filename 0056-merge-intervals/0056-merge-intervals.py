class Solution(object):
    def merge(self, intervals):
        intervals.sort(key=lambda x: x[0])
        result = [intervals[0]]
        
        
        for interval in intervals:
            last = result[-1]
            if interval[0] <= last[1] :
                last[1] = max(last[1], interval[1])
            else:
                result.append(interval)
                


        return result            


