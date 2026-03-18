from typing import List

class Solution:
    def countSubmatrices(self, grid: List[List[int]], k: int) -> int:
        grid = [list(row) for row in grid]

        m, n = len(grid), len(grid[0])
        prefix = [[0]*(n+1) for _ in range(m+1)]
        
        for i in range(m):
            for j in range(n):
                prefix[i+1][j+1] = grid[i][j] + prefix[i][j+1] + prefix[i+1][j] - prefix[i][j]
        
        count = 0
        for r2 in range(m):
            for c2 in range(n):
                if prefix[r2+1][c2+1] <= k:
                    count += 1
                    
        return count