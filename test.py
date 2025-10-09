def solve_n_queens(n):
    def is_safe(board, row, col):
        for i in range(row):
            if board[i] == col or abs(board[i] - col) == abs(i - row):
                return False
        return True

    def backtrack(board, row):
        if row == n:
            solutions.append(board[:])
            return
        for col in range(n):
            if is_safe(board, row, col):
                board[row] = col
                backtrack(board, row + 1)

    solutions = []
    backtrack([-1] * n, 0)
    return solutions

# Example usage:
n = 8  # Solve for 8 queens
for solution in solve_n_queens(n):
    print(solution)
