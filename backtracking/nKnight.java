public class nKnight {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(knight(board, 0));
    }

    static int knight(boolean[][] board, int col) {
        if(col == board.length) {
            display(board);
            System.out.println();
            return 1;
        }
        
        int count = 0;

        for(int row = 0; row < board.length; row++) {
            if(isSafe(board, row, col)) {
                board[row][col] = true;
                count += knight(board, col + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        if(isValid(board, row - 2, col + 1)) {
            if(board[row - 2][col + 1]) {
                return false;
            }
        }

        if(isValid(board, row - 2, col - 1)) {
            if(board[row - 2][col - 1]) {
                return false;
            }
        }

        if(isValid(board, row - 1, col + 2)) {
            if(board[row - 1][col + 2]) {
                return false;
            }
        }

        if(isValid(board, row - 1, col - 2)) {
            if(board[row - 1][col - 2]) {
                return false;
            }
        }

        return true;
    }

    static boolean isValid(boolean[][] board, int row , int col) {
        if(row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return true;
        } 

        return false;
    }

    static void display(boolean[][] board) {
        for(boolean[] row : board) {
            for(boolean ele : row) {
                if(ele) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}


// Output:

// K K K K 
// X X X X 
// X X X X 
// X X X X 

// K K K X 
// X X X X 
// X X X X 
// X X X K 

// K K X K 
// X X X X 
// X X X X 
// X X K X 

// K K X X 
// X X X X 
// X X X K 
// X X K X 

// K K X X 
// X X X X 
// X X X X 
// X X K K 

// K X K K 
// X K X X 
// X X X X 
// X X X X 

// K X K X 
// X K X K 
// X X X X 
// X X X X 

// K X K X 
// X K X X 
// X X X X 
// X X X K 

// K X X K 
// X K X X 
// X X K X 
// X X X X 

// K X X X 
// X K X K 
// X X K X 
// X X X X 

// K X X X 
// X K X X 
// X X K X 
// X X X K 

// K X K K 
// X X X X 
// X X X X 
// X K X X 

// K X K X 
// X X X K 
// X X X X 
// X K X X 

// K X K X 
// X X X X 
// X X X X 
// X K X K 

// K X X K 
// X X X X 
// X X K X 
// X K X X 

// K X X X 
// X X X K 
// X X K X 
// X K X X 

// K X X X 
// X X X X 
// X X K K 
// X K X X 

// K X X X 
// X X X X 
// X X K X 
// X K X K 

// K X X K 
// X X X X 
// X X X X 
// X K K X 

// K X X X 
// X X X K 
// X X X X 
// X K K X 

// K X X X 
// X X X X 
// X X X K 
// X K K X 

// K X X X 
// X X X X 
// X X X X 
// X K K K 

// X K K K 
// K X X X 
// X X X X 
// X X X X 

// X K K X 
// K X X X 
// X X X X 
// X X X K 

// X K X K 
// K X K X 
// X X X X 
// X X X X 

// X K X X 
// K X K X 
// X X X K 
// X X X X 

// X K X K 
// K X X X 
// X X X X 
// X X K X 

// X K X X 
// K X X X 
// X X X K 
// X X K X 

// X K X X 
// K X X X 
// X X X X 
// X X K K 

// X X K K 
// K K X X 
// X X X X 
// X X X X 

// X X K X 
// K K X K 
// X X X X 
// X X X X 

// X X K X 
// K K X X 
// X X X X 
// X X X K 

// X X X K 
// K K K X 
// X X X X 
// X X X X 

// X X X X 
// K K K K 
// X X X X 
// X X X X 

// X X K K 
// K X X X 
// X K X X 
// X X X X 

// X X K X 
// K X X K 
// X K X X 
// X X X X 

// X X X K 
// K X K X 
// X K X X 
// X X X X 

// X X X X 
// K X K K 
// X K X X 
// X X X X 

// X X X X 
// K X K X 
// X K X K 
// X X X X 

// X X X K 
// K X X X 
// X K X X 
// X X K X 

// X X X X 
// K X X K 
// X K X X 
// X X K X 

// X X X X 
// K X X X 
// X K X K 
// X X K X 

// X K K K 
// X X X X 
// K X X X 
// X X X X 

// X K K X 
// X X X X 
// K X X X 
// X X X K 

// X K X K 
// X X K X 
// K X X X 
// X X X X 

// X K X X 
// X X K X 
// K X X K 
// X X X X 

// X X K K 
// X K X X 
// K X X X 
// X X X X 

// X X K X 
// X K X K 
// K X X X 
// X X X X 

// X X K X 
// X K X X 
// K X X X 
// X X X K 

// X X X K 
// X K K X 
// K X X X 
// X X X X 

// X X X X 
// X K K K 
// K X X X 
// X X X X 

// X X X K 
// X K X X 
// K X K X 
// X X X X 

// X X X X 
// X K X K 
// K X K X 
// X X X X 

// X X X X 
// X K X X 
// K X K X 
// X X X K 

// X X K K 
// X X X X 
// K K X X 
// X X X X 

// X X K X 
// X X X K 
// K K X X 
// X X X X 

// X X X K 
// X X K X 
// K K X X 
// X X X X 

// X X X X 
// X X K K 
// K K X X 
// X X X X 

// X X X X 
// X X K X 
// K K X K 
// X X X X 

// X X X K 
// X X X X 
// K K K X 
// X X X X 

// X X X X 
// X X X K 
// K K K X 
// X X X X 

// X X X X 
// X X X X 
// K K K K 
// X X X X 

// X X K K 
// X X X X 
// K X X X 
// X K X X 

// X X K X 
// X X X K 
// K X X X 
// X K X X 

// X X K X 
// X X X X 
// K X X X 
// X K X K 

// X X X K 
// X X K X 
// K X X X 
// X K X X 

// X X X X 
// X X K K 
// K X X X 
// X K X X 

// X X X X 
// X X K X 
// K X X K 
// X K X X 

// X X X K 
// X X X X 
// K X K X 
// X K X X 

// X X X X 
// X X X K 
// K X K X 
// X K X X 

// X X X X 
// X X X X 
// K X K K 
// X K X X 

// X X X X 
// X X X X 
// K X K X 
// X K X K 

// X K K K 
// X X X X 
// X X X X 
// K X X X 

// X K K X 
// X X X X 
// X X X X 
// K X X K 

// X K X K 
// X X K X 
// X X X X 
// K X X X 

// X K X X 
// X X K X 
// X X X K 
// K X X X 

// X K X K 
// X X X X 
// X X X X 
// K X K X 

// X K X X 
// X X X X 
// X X X K 
// K X K X 

// X K X X 
// X X X X 
// X X X X 
// K X K K 

// X X K K 
// X K X X 
// X X X X 
// K X X X 

// X X K X 
// X K X K 
// X X X X 
// K X X X 

// X X K X 
// X K X X 
// X X X X 
// K X X K 

// X X X K 
// X K K X 
// X X X X 
// K X X X 

// X X X X 
// X K K K 
// X X X X 
// K X X X 

// X X X K 
// X K X X 
// X X K X 
// K X X X 

// X X X X 
// X K X K 
// X X K X 
// K X X X 

// X X X X 
// X K X X 
// X X K X 
// K X X K 

// X X K K 
// X X X X 
// X K X X 
// K X X X 

// X X K X 
// X X X K 
// X K X X 
// K X X X 

// X X X K 
// X X K X 
// X K X X 
// K X X X 

// X X X X 
// X X K K 
// X K X X 
// K X X X 

// X X X X 
// X X K X 
// X K X K 
// K X X X 

// X X X K 
// X X X X 
// X K K X 
// K X X X 

// X X X X 
// X X X K 
// X K K X 
// K X X X 

// X X X X 
// X X X X 
// X K K K 
// K X X X 

// X X X K 
// X X X X 
// X K X X 
// K X K X 

// X X X X 
// X X X K 
// X K X X 
// K X K X 

// X X X X 
// X X X X 
// X K X K 
// K X K X 

// X X K K 
// X X X X 
// X X X X 
// K K X X 

// X X K X 
// X X X K 
// X X X X 
// K K X X 

// X X K X 
// X X X X 
// X X X X 
// K K X K 

// X X X K 
// X X K X 
// X X X X 
// K K X X 

// X X X X 
// X X K K 
// X X X X 
// K K X X 

// X X X X 
// X X K X 
// X X X K 
// K K X X 

// X X X K 
// X X X X 
// X X K X 
// K K X X 

// X X X X 
// X X X K 
// X X K X 
// K K X X 

// X X X X 
// X X X X 
// X X K K 
// K K X X 

// X X X X 
// X X X X 
// X X K X 
// K K X K 

// X X X K 
// X X X X 
// X X X X 
// K K K X 

// X X X X 
// X X X K 
// X X X X 
// K K K X 

// X X X X 
// X X X X 
// X X X K 
// K K K X 

// X X X X 
// X X X X 
// X X X X 
// K K K K 

// 112