public class pattern4 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }

    static void pattern(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j<= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}


// Pattern:

// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5 