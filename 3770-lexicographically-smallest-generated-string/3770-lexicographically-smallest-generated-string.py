class Solution:
    def generateString(self, str1: str, str2: str) -> str:
        n, m = len(str1), len(str2)
        word = ['?'] * (n + m - 1)
        locked = [False] * (n + m - 1)

        for i in range(n):
            if str1[i] == 'T':
                for j in range(m):
                    if word[i+j] != '?' and word[i+j] != str2[j]:
                        return ""
                    word[i+j] = str2[j]
                    locked[i+j] = True

        for i in range(len(word)):
            if word[i] == '?':
                word[i] = 'a'

        for i in range(n):
            if str1[i] == 'F':
                if ''.join(word[i:i+m]) == str2:
                    fixed = False
                    for j in range(m - 1, -1, -1):
                        idx = i + j
                        if locked[idx]:
                            continue

                        original = word[idx]
                        for c in 'abcdefghijklmnopqrstuvwxyz':
                            if c != original:
                                word[idx] = c
                                if ''.join(word[i:i+m]) != str2:
                                    fixed = True
                                    break
                                word[idx] = original

                        if fixed:
                            break

                    if not fixed:
                        return ""

        return ''.join(word)