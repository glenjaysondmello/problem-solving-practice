import java.util.Arrays;

public class maze_backtrack {
    public static void main(String[] args) {
        int row = 0, col = 0;

        boolean[][] board = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };

        int[][] path = new int[board.length][board[0].length];
        int step = 1;


        // printPaths(row, col, "", board);

        printPathsWithStep(row, col, "", board, path, step);
    }

    static void printPaths(int row, int col, String pro, boolean[][] board) {
        if (row == board.length - 1 && col == board[0].length - 1) {
            System.out.println(pro);
            return;
        }

        if(!board[row][col]) {
            return;
        }

        board[row][col] = false;

        if (row < board.length - 1) {
            printPaths(row + 1, col, pro + "D", board);
        }

        if (col < board[0].length - 1) {
            printPaths(row, col + 1, pro + "R", board);
        }

        if (row > 0) {
            printPaths(row - 1, col, pro + "U", board);
        }

        if (col > 0) {
            printPaths(row, col - 1, pro + "L", board);
        }

        board[row][col] = true;
    }

    static void printPathsWithStep(int row, int col, String pro, boolean[][] board, int[][] path, int step) {
        if (row == board.length - 1 && col == board[0].length - 1) {
            path[row][col] = step;
            System.out.println("-------------------------------");
            for(int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(pro);
            
            System.out.println("-------------------------------");
            return;
        }

        if(!board[row][col]) {
            return;
        }

        board[row][col] = false;
        path[row][col] = step;

        if (row < board.length - 1) {
            printPathsWithStep(row + 1, col, pro + "D", board, path, step + 1);
        }

        if (col < board[0].length - 1) {
            printPathsWithStep(row, col + 1, pro + "R", board, path, step + 1);
        }

        if (row > 0) {
            printPathsWithStep(row - 1, col, pro + "U", board, path, step + 1);
        }

        if (col > 0) {
            printPathsWithStep(row, col - 1, pro + "L", board, path, step + 1);
        }

        board[row][col] = true;
        path[row][col] = 0;
    }
}


// Output for printPaths:

// DDRR
// DDRURD
// DDRUURDD
// DRDR
// DRRD
// DRURDD
// RDDR
// RDRD
// RDLDRR
// RRDD
// RRDLDR
// RRDLLDRR


// Output for printPathsWithStep: 

// -------------------------------
// [1, 0, 0]
// [2, 0, 0]
// [3, 4, 5]
// DDRR
// -------------------------------
// -------------------------------
// [1, 0, 0]
// [2, 5, 6]
// [3, 4, 7]
// DDRURD
// -------------------------------
// -------------------------------
// [1, 6, 7]
// [2, 5, 8]
// [3, 4, 9]
// DDRUURDD
// -------------------------------
// -------------------------------
// [1, 0, 0]
// [2, 3, 0]
// [0, 4, 5]
// DRDR
// -------------------------------
// -------------------------------
// [1, 0, 0]
// [2, 3, 4]
// [0, 0, 5]
// DRRD
// -------------------------------
// -------------------------------
// [1, 4, 5]
// [2, 3, 6]
// [0, 0, 7]
// DRURDD
// -------------------------------
// -------------------------------
// [1, 2, 0]
// [0, 3, 0]
// [0, 4, 5]
// RDDR
// -------------------------------
// -------------------------------
// [1, 2, 0]
// [0, 3, 4]
// [0, 0, 5]
// RDRD
// -------------------------------
// -------------------------------
// [1, 2, 0]
// [4, 3, 0]
// [5, 6, 7]
// RDLDRR
// -------------------------------
// -------------------------------
// [1, 2, 3]
// [0, 0, 4]
// [0, 0, 5]
// RRDD
// -------------------------------
// -------------------------------
// [1, 2, 3]
// [0, 5, 4]
// [0, 6, 7]
// RRDLDR
// -------------------------------
// -------------------------------
// [1, 2, 3]
// [6, 5, 4]
// [7, 8, 9]
// RRDLLDRR
// -------------------------------