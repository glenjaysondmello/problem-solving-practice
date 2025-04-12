public class pattern9 {
    public static void main(String[] args) {
        int n = 4;
        pattern(n);
    }

    static void pattern(int n) {
        int double_n = 2 * n;
        for(int i = 0; i <= double_n; i++) {
            for(int j = 0; j <= double_n; j++) {
                int place_ele = Math.min(Math.min(i, j), Math.min(double_n - i, double_n - j));
                System.out.print(place_ele + " ");
            }
            System.out.println();
        }
    }
}

// Pattern:

// 0 0 0 0 0 0 0 0 0 
// 0 1 1 1 1 1 1 1 0 
// 0 1 2 2 2 2 2 1 0 
// 0 1 2 3 3 3 2 1 0 
// 0 1 2 3 4 3 2 1 0 
// 0 1 2 3 3 3 2 1 0 
// 0 1 2 2 2 2 2 1 0 
// 0 1 1 1 1 1 1 1 0 
// 0 0 0 0 0 0 0 0 0 
