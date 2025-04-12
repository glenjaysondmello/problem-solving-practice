public class pattern7 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }

    static void pattern(int n) {
        for(int i = 1; i <= n; i++) {
            for(int s = 0; s < n - i; s++) {
                System.out.print("  ");
            }

            for(int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            for(int k = 2; k <= i; k++) {
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
