class Solution:
    def decodeCiphertext(self, encodedText: str, rows: int) -> str:
        if not encodedText:
            return ""

        cols = len(encodedText) // rows

        matrix = []
        index = 0
        for r in range(rows):
            matrix.append(encodedText[index:index + cols])
            index += cols

        result = []
        for start_col in range(cols):
            i, j = 0, start_col
            while i < rows and j < cols:
                result.append(matrix[i][j])
                i += 1
                j += 1    

        return "".join(result).rstrip()        
        