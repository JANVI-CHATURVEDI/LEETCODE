class Solution(object):
    def countBinarySubstrings(self, s):
        groups = []
        count = 1

        for i in range(1, len(s)):
            if s[i] == s[i - 1]:
                count += 1
            else:
                groups.append(count)
                count = 1

        groups.append(count)


        result = 0
        for i in range(len(groups)-1):
            result += min(groups[i], groups[i+1])

        return result            