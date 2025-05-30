public class maze1obstacles {
    public static void main(String[] args) {
        int row = 0, col = 0;
        // int row = 3, col = 3;
        // int obs1 = 2, obs2 = 2;
        boolean[][] board = {
                { true, true, true },
                { true, false, true },
                { true, true, true }
        };

        printPaths(row, col, "", board);
        // printPathsO(row, col, "", obs1, obs2);
    }

    static void printPaths(int row, int col, String pro, boolean[][] board) {
        if (row == board.length - 1 && col == board[0].length - 1) {
            System.out.println(pro);
            return;
        }

        if(!board[row][col]) {
            return;
        }

        if (row < board.length - 1) {
            printPaths(row + 1, col, pro + "D", board);
        }

        if (col < board[0].length - 1) {
            printPaths(row, col + 1, pro + "R", board);
        }

    }

    static void printPathsO(int row, int col, String pro, int obs1, int obs2) {
        if (row == 1 && col == 1) {
            System.out.println(pro);
            return;
        }

        if(row == obs1 && col == obs2) {
            return;
        }

        if (row > 1) {
            printPathsO(row - 1, col, pro + "D", obs1, obs2);
        }

        if (col > 1) {
            printPathsO(row, col - 1, pro + "R", obs1, obs2);
        }
    }
}
