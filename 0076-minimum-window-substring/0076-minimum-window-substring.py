class Solution(object):
    def minWindow(self, s, t):
        if not s or not t:
            return ""

        freq = {}
        for ch in t:
            freq[ch] = freq.get(ch, 0) + 1

        win = {}
        required = len(freq)
        formed = 0

        l = 0
        min_len = float('inf')
        start = 0

        for r in range(len(s)):
            ch = s[r]
            win[ch] = win.get(ch, 0) + 1

            if ch in freq and win[ch] == freq[ch]:
                formed += 1

            while formed == required:
                window_len = r - l + 1
                if window_len < min_len:
                    min_len = window_len
                    start = l

                left_char = s[l]
                win[left_char] -= 1

                if left_char in freq and win[left_char] < freq[left_char]:
                    formed -= 1

                l += 1

        if min_len == float('inf'):
            return ""
        return s[start:start + min_len]

        