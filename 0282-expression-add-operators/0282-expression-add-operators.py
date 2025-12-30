class Solution(object):
    def addOperators(self, num, target):
        res = []

        def backtrack(index, path, value, last):
            
            if index == len(num):
                if value == target:
                    res.append(path)
                return

            
            for i in range(index, len(num)):
               
                if i > index and num[index] == '0':
                    break

                curr_str = num[index:i+1]
                curr = int(curr_str)

                
                if index == 0:
                    backtrack(i + 1, curr_str, curr, curr)
                else:
                    
                    backtrack(
                        i + 1,
                        path + "+" + curr_str,
                        value + curr,
                        curr
                    )

                    
                    backtrack(
                        i + 1,
                        path + "-" + curr_str,
                        value - curr,
                        -curr
                    )

                    
                    backtrack(
                        i + 1,
                        path + "*" + curr_str,
                        value - last + last * curr,
                        last * curr
                    )

        backtrack(0, "", 0, 0)
        return res
