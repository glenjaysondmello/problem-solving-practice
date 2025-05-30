import java.util.ArrayList;

public class maze1diagonal {
    public static void main(String[] args) {
        int row = 3, col = 3;
        System.out.println(paths(row, col));
        System.out.println();
        printPaths(row, col, "");
        System.out.println();
        System.out.println(listPaths(row, col, ""));
    }

    static int paths(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }

        int left = paths(row - 1, col);
        int diag = paths(row - 1, col - 1);
        int right = paths(row, col - 1);

        if(row > 1 && col > 1) {
            return left + diag + right;
        } else {
            return left + right;
        }
     }

    static void printPaths(int row, int col, String pro) {
        if (row == 1 && col == 1) {
            System.out.println(pro);
            return;
        }

        if(row > 1 && col > 1) {
            printPaths(row - 1, col - 1, pro + "D");
        }

        if (row > 1) {
            printPaths(row - 1, col, pro + "V");
        }

        if (col > 1) {
            printPaths(row, col - 1, pro + "H");
        }
    }

    static ArrayList<String> listPaths(int row, int col, String pro) {
        if (row == 1 && col == 1) {
            ArrayList<String> arr = new ArrayList<>();
            arr.add(pro);
            return arr;
        }

        ArrayList<String> arr = new ArrayList<>();

        if(row > 1 && col > 1) {
            arr.addAll(listPaths(row - 1, col - 1, pro + "D"));
        }

        if (row > 1) {
            arr.addAll(listPaths(row - 1, col, pro + "V"));
        }

        if (col > 1) {
            arr.addAll(listPaths(row, col - 1, pro + "H"));
        }

        return arr;
    }
}