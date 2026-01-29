class Solution(object):
    def isValid(self, s):
        stack = []

        for ch in s:
            if ch == '(' or ch == '{' or ch == '[':
                stack.append(ch)
            else:
                if not stack:
                    return False

            if ch == ')' and stack.pop() != '(':
                return False
            elif ch == '}' and stack.pop() != '{':
                return False
            elif ch == ']' and stack.pop() != '[':
                return False
        
        
        return len(stack) == 0  
        