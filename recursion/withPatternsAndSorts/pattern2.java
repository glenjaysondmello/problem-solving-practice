public class pattern2 {
    public static void main(String[] args) {
        pattern(4, 0);
        System.out.println();
    }

    static void pattern(int row, int col) {
        if(row == 0) {
            return;
        }

        if(col < row) {
            pattern(row, col + 1);
            System.out.print("*");
        } else {
            pattern(row - 1, 0);
            System.out.println();
        }
    }
}

// *
// **
// ***
// ****