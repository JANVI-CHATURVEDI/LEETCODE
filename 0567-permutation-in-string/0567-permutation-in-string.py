class Solution(object):
    def checkInclusion(self, s1, s2):
        n = len(s1)
        m = len(s2)
        if n > m :
            return False

        freq = {}
        for ch in s1:
            freq[ch] = freq.get(ch, 0) + 1

        winfreq = {}

        for i in range(m):
            winfreq[s2[i]] = winfreq.get(s2[i], 0) + 1

            if i >= n :
                winfreq[s2[i-n]] = winfreq.get(s2[i-n], 0) - 1
                if winfreq[s2[i-n]] == 0 :
                    del winfreq[s2[i-n]]

            if winfreq == freq :
                return True        

        return False


        