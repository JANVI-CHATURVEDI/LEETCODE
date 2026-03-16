class Solution:
    def getBiggestThree(self, grid):
        m, n = len(grid), len(grid[0])
        sums = set()

        for r in range(m):
            for c in range(n):

                sums.add(grid[r][c])

                k = 1
                while True:
                    if r+2*k >= m or c-k < 0 or c+k >= n:
                        break

                    total = 0
                    x, y = r, c

                    for _ in range(k):
                        x += 1; y += 1
                        total += grid[x][y]

                    for _ in range(k):
                        x += 1; y -= 1
                        total += grid[x][y]

                    for _ in range(k):
                        x -= 1; y -= 1
                        total += grid[x][y]

                    for _ in range(k):
                        x -= 1; y += 1
                        total += grid[x][y]

                    sums.add(total)
                    k += 1

        return sorted(sums, reverse=True)[:3]