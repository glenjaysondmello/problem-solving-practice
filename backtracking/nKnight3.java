public class nKnight3 {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(knight(board, 0, 0, 0, 4));
    }

    static int knight(boolean[][] board, int row, int col, int kUsed, int totalK) {
        if (kUsed == totalK) {
            display(board);
            System.out.println();
            return 1;
        }

        if (row == board.length) {
            return 0;
        }

        int count = 0;

        if (col == board.length) {
            count += knight(board, row + 1, 0, kUsed, totalK);
        } else {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += knight(board, row, col + 1, kUsed + 1, totalK);
                board[row][col] = false;
            }

            count += knight(board, row, col + 1, kUsed, totalK);

        }

        return count;
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }

        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }

        if (isValid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }

        if (isValid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2]) {
                return false;
            }
        }

        return true;
    }

    static boolean isValid(boolean[][] board, int row, int col) {
        if (row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return true;
        }

        return false;
    }

    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean ele : row) {
                if (ele) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}

// display(board);
// System.out.println();
// return 1;
