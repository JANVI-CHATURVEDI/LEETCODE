class Solution:
    def areSimilar(self, mat: List[List[int]], k: int) -> bool:
        matrix = [row[:] for row in mat]
        for i , row in enumerate(matrix):
            k_mod = k % len(row)

            for _ in range(k_mod):
                if i % 2 == 0:
                    first = row.pop(0)
                    row.append(first)
                else:
                    last = row.pop()
                    row.insert(0, last)

        if matrix == mat:
            return True
        
        return False