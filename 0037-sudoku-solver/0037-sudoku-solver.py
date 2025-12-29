class Solution(object):
    def solveSudoku(self, board):
        rows = [set() for _ in range(9)]
        cols = [set() for _ in range(9)]
        boxes = [set() for _ in range(9)]

        
        for r in range(9):
            for c in range(9):
                if board[r][c] != '.':
                    num = board[r][c]
                    rows[r].add(num)
                    cols[c].add(num)
                    boxes[(r//3)*3 + c//3].add(num)

        def solve():
            min_count = 10
            target = None

           
            for r in range(9):
                for c in range(9):
                    if board[r][c] == '.':
                        box = (r//3)*3 + c//3
                        options = []
                        for num in "123456789":
                            if (num not in rows[r] and
                                num not in cols[c] and
                                num not in boxes[box]):
                                options.append(num)

                        if len(options) == 0:
                            return False

                        if len(options) < min_count:
                            min_count = len(options)
                            target = (r, c, options)

            
            if not target:
                return True

            r, c, options = target
            box = (r//3)*3 + c//3

            for num in options:
                board[r][c] = num
                rows[r].add(num)
                cols[c].add(num)
                boxes[box].add(num)

                if solve():
                    return True

                board[r][c] = '.'
                rows[r].remove(num)
                cols[c].remove(num)
                boxes[box].remove(num)

            return False

        solve()
