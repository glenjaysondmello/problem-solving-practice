public class pattern8 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }

    static void pattern(int n) {
        for(int i = 0; i < 2 * n; i++) {
            int c = i > n ? 2 * n - i : i;

            for(int s = 0; s < n - c; s++) {
                System.out.print("  ");
            }

            for(int j = c; j >= 1; j--) {
                System.out.print(j + " ");
            }

            for(int k = 2; k <= c; k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }
    }
}

// Pattern:

//         1 
//       2 1 2 
//     3 2 1 2 3 
//   4 3 2 1 2 3 4 
// 5 4 3 2 1 2 3 4 5 
//   4 3 2 1 2 3 4 
//     3 2 1 2 3 
//       2 1 2 
//         1 
