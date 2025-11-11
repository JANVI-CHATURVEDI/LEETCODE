class Solution(object):
    def decodeString(self, s):
        """
        :type s: str
        :rtype: str
        """
        
        string = []
        number = []
        currstr = ""
        currnum = 0

        for ch in s:
            if ch.isdigit() :
                currnum = currnum * 10 + int(ch)  
            
            elif ch == '[' :
                string.append(currstr)
                number.append(currnum)
                currstr = ""
                currnum = 0

            elif ch == ']' :
                prevnum = number.pop()
                prevstr = string.pop()

                currstr = prevstr + ( currstr * prevnum)     

            else :
                currstr = currstr + ch 


        return currstr                