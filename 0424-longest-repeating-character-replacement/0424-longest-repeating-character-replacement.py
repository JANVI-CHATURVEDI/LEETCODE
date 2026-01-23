class Solution(object):
    def characterReplacement(self, s, k):
        count = {}
        st = 0
        maxFreq = 0
        maxlen = 0

        for ed in range(len(s)):
            count[s[ed]] = count.get(s[ed], 0) + 1
            maxFreq = max(maxFreq, count[s[ed]])

            while (ed - st + 1) - maxFreq > k:
                count[s[st]] -= 1
                st += 1

            maxlen = max(maxlen, ed - st + 1)

        return maxlen
