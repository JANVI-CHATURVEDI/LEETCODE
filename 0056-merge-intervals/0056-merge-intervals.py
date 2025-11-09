class Solution(object):
    def merge(self, intervals):
        """
        :type intervals: List[List[int]]
        :rtype: List[List[int]]
        """

        merged = []
        n = len(intervals)
        i = 0
        intervals.sort(key=lambda x: x[0])


        oldinterval = intervals[i] 

        while i < n :
            if oldinterval[1] >= intervals[i][0] :
                oldinterval[1] = max(intervals[i][1] , oldinterval[1] )
                i += 1 
            else :
                merged.append(oldinterval)
                oldinterval = intervals[i]
                
                i += 1   
        
        if i == n :
           merged.append(oldinterval) 
           

        
        return merged