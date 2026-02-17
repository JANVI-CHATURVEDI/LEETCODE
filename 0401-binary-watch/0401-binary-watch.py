class Solution(object):
    def readBinaryWatch(self, turnedOn):
        
        result = []
        for hour in range(12):
            for minute in range(60):
                total_ones = bin(hour).count('1') + bin(minute).count('1')
                if total_ones == turnedOn:
                    time_str = "{}:{:02d}".format(hour, minute)
                    result.append(time_str)

        return result
